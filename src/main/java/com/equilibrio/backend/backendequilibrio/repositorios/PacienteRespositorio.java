package com.equilibrio.backend.backendequilibrio.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.equilibrio.backend.backendequilibrio.entidades.Paciente;

@CrossOrigin(origins = "http://localhost:4200/")
@RepositoryRestResource(path = "pacientes")//, excerptProjection = PacienteProyeccion.class)
public interface PacienteRespositorio extends CrudRepository<Paciente, Long> {

    // @Query("select p from Paciente p")
    // @RestResource(path = "todos")
    // List<Paciente> gPacientes();

}
