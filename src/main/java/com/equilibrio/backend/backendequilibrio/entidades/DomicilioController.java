package com.equilibrio.backend.backendequilibrio.entidades;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equilibrio.backend.backendequilibrio.repositorios.DomicilioRespositorio;
import com.equilibrio.backend.backendequilibrio.repositorios.PacienteRespositorio;

@RestController
@RequestMapping("/api/domicilios")
@CrossOrigin(origins = "http://localhost:4200")
public class DomicilioController {

    @Autowired
    private DomicilioRespositorio domicilioRespositorio;

    @Autowired
    private PacienteRespositorio pacienteRespositorio;

     @PostMapping("/{idPaciente}")
    public ResponseEntity<Domicilio> guardarDomicilio(@PathVariable Integer idPaciente,
                                                      @RequestBody Domicilio domicilioDTO) {
        Optional<Paciente> pacienteOptional  = pacienteRespositorio.findById(idPaciente);
        
        Paciente paciente = pacienteOptional.get();

        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(domicilioDTO.getCalle());
        domicilio.setPaciente(paciente); // Se asocia el paciente encontrado

        Domicilio domicilioGuardado = domicilioRespositorio.save(domicilio);
        return ResponseEntity.ok(domicilioGuardado);
    }

    

}
