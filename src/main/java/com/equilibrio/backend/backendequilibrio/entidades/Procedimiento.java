package com.equilibrio.backend.backendequilibrio.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Procedimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Paciente paciente;

    private int numeroDiente;
    private int caraDiente;
    private String tipoProcedimiento;
    private String color;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTipoProcedimiento() {
        return tipoProcedimiento;
    }
    public void setTipoProcedimiento(String tipoProcedimiento) {
        this.tipoProcedimiento = tipoProcedimiento;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public int getNumeroDiente() {
        return numeroDiente;
    }
    public void setNumeroDiente(int numeroDiente) {
        this.numeroDiente = numeroDiente;
    }
    public int getCaraDiente() {
        return caraDiente;
    }
    public void setCaraDiente(int caraDiente) {
        this.caraDiente = caraDiente;
    }
    
}
