package com.equilibrio.backend.backendequilibrio.servicios;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IGuardarImagen {

    void init();
    String guardar(Long id, MultipartFile[] archivo) throws Exception;
    Resource loadImagen(String nombreArchivo);
}
