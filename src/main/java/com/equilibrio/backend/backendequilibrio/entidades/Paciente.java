package com.equilibrio.backend.backendequilibrio.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "paciente")
    private Domicilio domicilio;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "paciente")
    private DeclaracionJurada declaracionJurada;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "paciente")
    private SaludPaciente saludPaciente;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "paciente_id")
    private List<Procedimiento> procedimientos = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "paciente_id")
    private List<Imagen> imagenes = new ArrayList<>();

    private String nombre;
    private String apellido;
    private Integer dni;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String obraSocial;
    private Integer nroAfiliado;
    private String estadoCivil;
    private String profesion;

    public String getObraSocial() {
        return obraSocial;
    }
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    public Integer getNroAfiliado() {
        return nroAfiliado;
    }
    public void setNroAfiliado(Integer nroAfiliado) {
        this.nroAfiliado = nroAfiliado;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
        domicilio.setPaciente(this);
    }
    public DeclaracionJurada getDeclaracionJurada() {
        return declaracionJurada;
    }
    public void setDeclaracionJurada(DeclaracionJurada declaracionJurada) {
        this.declaracionJurada = declaracionJurada;
        declaracionJurada.setPaciente(this);
    }
    public SaludPaciente getSaludPaciente() {
        return saludPaciente;
    }
    public void setSaludPaciente(SaludPaciente saludPaciente) {
        this.saludPaciente = saludPaciente;
        saludPaciente.setPaciente(this);
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Integer getDni() {
        return dni;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }
    public List<Procedimiento> getProcedimientos() {
        return procedimientos;
    }
    public void setProcedimientos(List<Procedimiento> procedimientos) {
        this.procedimientos = procedimientos;
    }
    public List<Imagen> getImagenes() {
        return imagenes;
    }
    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
