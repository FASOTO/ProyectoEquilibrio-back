package com.equilibrio.backend.backendequilibrio.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.equilibrio.backend.backendequilibrio.servicios.GuardarImagen;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/pacientes/imagen")

public class GuardarImagenController {

    @Autowired
    GuardarImagen guardarImagenService;

    @PostMapping("/guardar/{id}")
    public Map<String, String> guardarImagen(@PathVariable Long id, @RequestParam("imagen") MultipartFile[] file, HttpServletRequest request) {

        String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        String path = guardarImagenService.guardar(id, file, host);

        return Map.of("url", path);
    }

}
