package com.equilibrio.backend.backendequilibrio.repositorios;

import org.springframework.data.rest.core.config.Projection;

import com.equilibrio.backend.backendequilibrio.entidades.Paciente;

@Projection(name = "listado", types = Paciente.class)
public interface PacienteProyeccion {
    String getNombre();
    String getApellido();

}
