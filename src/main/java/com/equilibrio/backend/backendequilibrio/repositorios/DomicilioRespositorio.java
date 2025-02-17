package com.equilibrio.backend.backendequilibrio.repositorios;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.equilibrio.backend.backendequilibrio.entidades.Domicilio;
import com.equilibrio.backend.backendequilibrio.entidades.Paciente;


@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(path = "domicilios")
public interface DomicilioRespositorio  extends JpaRepository<Domicilio, Long>{


    
}
