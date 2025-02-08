package com.equilibrio.backend.backendequilibrio.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.equilibrio.backend.backendequilibrio.entidades.Paciente;

@RepositoryRestResource(path = "pacientes")
public interface PacienteRespositorio extends CrudRepository<Paciente, Long> {

}
