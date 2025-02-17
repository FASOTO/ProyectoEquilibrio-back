package com.equilibrio.backend.backendequilibrio.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Domicilio {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String calle;
    private Integer nrocalle;
    private String localidad;
    private String barrio;

    @OneToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;

    public Integer getNrocalle() {
        return nrocalle;
    }
    public void setNrocalle(Integer nrocalle) {
        this.nrocalle = nrocalle;
    }
    public String getBarrio() {
        return barrio;
    }
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    

}
