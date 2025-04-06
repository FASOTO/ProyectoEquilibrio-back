package com.equilibrio.backend.backendequilibrio.servicios;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.equilibrio.backend.backendequilibrio.entidades.Imagen;
import com.equilibrio.backend.backendequilibrio.entidades.Paciente;
import com.equilibrio.backend.backendequilibrio.repositorios.PacienteRespositorio;

@Service
public class GuardarImagen implements IGuardarImagen {

    @Autowired
    private PacienteRespositorio pacienteRespositorio;

    @Override
    public void init() {

    }

    @Override
    public String guardar(Long id, MultipartFile[] archivos) throws Exception {
        File carpeta = new File("src/main/resources/imagenes");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        Paciente p1 = pacienteRespositorio.findById(id).orElseThrow();
        try {

            for (MultipartFile file : archivos) {

                File carpetaNueva = new File("src/main/resources/imagenes/" + p1.getDni().toString());
                if (!carpetaNueva.exists()) {
                    carpetaNueva.mkdirs();
                }
                byte[] bytes = file.getBytes();
                String nombreOriginal = file.getOriginalFilename();
                String direccionNueva = carpetaNueva + "/" + nombreOriginal;

                
                Path path = Paths.get(direccionNueva);
                Files.write(path, bytes);
                Imagen newImage = new Imagen();
                newImage.setUrl(path.toString());
                newImage.setPaciente(p1);
                p1.getImagenes().add(newImage);
            }

            pacienteRespositorio.save(p1);

            return "se crearon los archivos";
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Resource loadImagen(String nombreArchivo) {

        throw new UnsupportedOperationException("Unimplemented method 'loadImagen'");
    }

}
