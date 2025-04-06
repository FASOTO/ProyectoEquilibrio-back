package com.equilibrio.backend.backendequilibrio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.equilibrio.backend.backendequilibrio.servicios.IGuardarImagen;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/pacientes/imagen")
public class GuardarImagenController {

    @Autowired
    IGuardarImagen guardarImagenService;

    @PostMapping("/guardar/{id}")
    public ResponseEntity<String>guardarImagen(@PathVariable Long id, @RequestParam("file") MultipartFile[] file) throws Exception {
        
        return new ResponseEntity<>(guardarImagenService.guardar(id,file), HttpStatus.OK);
    }
    
}
