package com.equilibrio.backend.backendequilibrio.servicios;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.equilibrio.backend.backendequilibrio.entidades.Imagen;
import com.equilibrio.backend.backendequilibrio.entidades.Paciente;
import com.equilibrio.backend.backendequilibrio.repositorios.PacienteRespositorio;

import jakarta.annotation.PostConstruct;

@Service
public class GuardarImagen implements IGuardarImagen {

    @Autowired
    private PacienteRespositorio pacienteRespositorio;

    private Path rootLocation;

    @Override
    @PostConstruct
    public void init() {
        rootLocation = Paths.get("src/main/resources/static/imagenes");
    }

    @Override
    public String guardar(Long id, MultipartFile[] archivos, String host) {

        Paciente p1 = pacienteRespositorio.findById(id).orElseThrow();
        

        File carpetaNueva = new File(rootLocation + "/" + p1.getDni().toString());

        if (!carpetaNueva.exists())
            carpetaNueva.mkdirs();

        try {
            for (MultipartFile file : archivos) {

                Path filename = Paths.get(p1.getDni().toString(), file.getOriginalFilename());
                Path destinationFile = rootLocation.resolve(filename).normalize().toAbsolutePath();
                Imagen newImage = new Imagen();

                try (InputStream inputStream = file.getInputStream()) {
                    Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
                    newImage.setUrl(host + "/imagenes/" + filename.toString().replace("\\", "/"));
                    p1.getImagenes().add(newImage);
                }
            }
            pacienteRespositorio.save(p1);
            return "Se guardo OK";

        } catch (IOException e) {
            throw new RuntimeException("falla al guardar imagen");
        }
    }

    @Override
    public Resource loadImagen(String nombreArchivo) {

        try {
            Path file = rootLocation.resolve(nombreArchivo);

            Resource resource = new UrlResource((file.toUri()));

            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new RuntimeException("No se hallo archivo");
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("No se hallo archivo");
        }
    }

}
