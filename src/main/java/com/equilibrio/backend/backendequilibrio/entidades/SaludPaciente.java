package com.equilibrio.backend.backendequilibrio.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class SaludPaciente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;

    private String porqueAsistioConsulta;
    private boolean consultoConOtroProfesional;

    private boolean tomoAlgunMedicamento;
    private String nombreMedicamentos;
    private String desdeCuando;
    private boolean obtuvoResultados;

    private boolean haTenidoDolor;
    private String queTipo;
    private String localizadoDonde;
    private String irradiadoHaciaDonde;
    private String puedeCalmarlo;

    private boolean sufrioGolpeDientes;
    private String cuando;
    private String comoSeProdujo;

    private boolean fracturoDiente;
    private String fracturaDienteCual;
    private String recibioTratamiento;

    private String dificultadHablar;
    private String masticar;
    private String abrirBoca;
    private String tragarAlimentos;

    private String observadoAnormalLabios;
    private String observadoAnormalLengua;
    private String observadoAnormalPaladar;
    private String observadoAnormalPissoBoca;
    private String observadoAnormalCarrillos;
    private String observadoAnormalRebordes;
    private String observadoAnormalTrigonos;
    private String observadoAnormalRetromolar;

    private boolean lesionManchas;
    private boolean lesionAbultamientoTejidos;
    private boolean lesionUlceraciones;
    private boolean lesionAmpollar;
    private String lesionOtros;

    private boolean sangranEncias;
    private String sangranEnciasCuando;

    private boolean pusBoca;
    private String pusBocaDonde;

    private boolean movilidadDientes;
    private String morderSienteAltoDientes;

    private boolean caraHinchada;
    private String caraHinchadaHielo;
    private String caraHinchadaCalor;
    private String caraHinchadaOtros;
    
    private String azucarDiarios;
    private String indicePlaca;

    private String higieneBucal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPorqueAsistioConsulta() {
        return porqueAsistioConsulta;
    }

    public void setPorqueAsistioConsulta(String porqueAsistioConsulta) {
        this.porqueAsistioConsulta = porqueAsistioConsulta;
    }

    public boolean isConsultoConOtroProfesional() {
        return consultoConOtroProfesional;
    }

    public void setConsultoConOtroProfesional(boolean consultoConOtroProfesional) {
        this.consultoConOtroProfesional = consultoConOtroProfesional;
    }

    public boolean isTomoAlgunMedicamento() {
        return tomoAlgunMedicamento;
    }

    public void setTomoAlgunMedicamento(boolean tomoAlgunMedicamento) {
        this.tomoAlgunMedicamento = tomoAlgunMedicamento;
    }

    public String getNombreMedicamentos() {
        return nombreMedicamentos;
    }

    public void setNombreMedicamentos(String nombreMedicamentos) {
        this.nombreMedicamentos = nombreMedicamentos;
    }

    public String getDesdeCuando() {
        return desdeCuando;
    }

    public void setDesdeCuando(String desdeCuando) {
        this.desdeCuando = desdeCuando;
    }

    public boolean isObtuvoResultados() {
        return obtuvoResultados;
    }

    public void setObtuvoResultados(boolean obtuvoResultados) {
        this.obtuvoResultados = obtuvoResultados;
    }

    public boolean isHaTenidoDolor() {
        return haTenidoDolor;
    }

    public void setHaTenidoDolor(boolean haTenidoDolor) {
        this.haTenidoDolor = haTenidoDolor;
    }

    public String getQueTipo() {
        return queTipo;
    }

    public void setQueTipo(String queTipo) {
        this.queTipo = queTipo;
    }

    public String getLocalizadoDonde() {
        return localizadoDonde;
    }

    public void setLocalizadoDonde(String localizadoDonde) {
        this.localizadoDonde = localizadoDonde;
    }

    public String getIrradiadoHaciaDonde() {
        return irradiadoHaciaDonde;
    }

    public void setIrradiadoHaciaDonde(String irradiadoHaciaDonde) {
        this.irradiadoHaciaDonde = irradiadoHaciaDonde;
    }

    public String getPuedeCalmarlo() {
        return puedeCalmarlo;
    }

    public void setPuedeCalmarlo(String puedeCalmarlo) {
        this.puedeCalmarlo = puedeCalmarlo;
    }

    public boolean isSufrioGolpeDientes() {
        return sufrioGolpeDientes;
    }

    public void setSufrioGolpeDientes(boolean sufrioGolpeDientes) {
        this.sufrioGolpeDientes = sufrioGolpeDientes;
    }

    public String getCuando() {
        return cuando;
    }

    public void setCuando(String cuando) {
        this.cuando = cuando;
    }

    public String getComoSeProdujo() {
        return comoSeProdujo;
    }

    public void setComoSeProdujo(String comoSeProdujo) {
        this.comoSeProdujo = comoSeProdujo;
    }

    public boolean isFracturoDiente() {
        return fracturoDiente;
    }

    public void setFracturoDiente(boolean fracturoDiente) {
        this.fracturoDiente = fracturoDiente;
    }

    public String getFracturaDienteCual() {
        return fracturaDienteCual;
    }

    public void setFracturaDienteCual(String fracturaDienteCual) {
        this.fracturaDienteCual = fracturaDienteCual;
    }

    public String getRecibioTratamiento() {
        return recibioTratamiento;
    }

    public void setRecibioTratamiento(String recibioTratamiento) {
        this.recibioTratamiento = recibioTratamiento;
    }

    public String getDificultadHablar() {
        return dificultadHablar;
    }

    public void setDificultadHablar(String dificultadHablar) {
        this.dificultadHablar = dificultadHablar;
    }

    public String getMasticar() {
        return masticar;
    }

    public void setMasticar(String masticar) {
        this.masticar = masticar;
    }

    public String getAbrirBoca() {
        return abrirBoca;
    }

    public void setAbrirBoca(String abrirBoca) {
        this.abrirBoca = abrirBoca;
    }

    public String getTragarAlimentos() {
        return tragarAlimentos;
    }

    public void setTragarAlimentos(String tragarAlimentos) {
        this.tragarAlimentos = tragarAlimentos;
    }

    public String getObservadoAnormalLabios() {
        return observadoAnormalLabios;
    }

    public void setObservadoAnormalLabios(String observadoAnormalLabios) {
        this.observadoAnormalLabios = observadoAnormalLabios;
    }

    public String getObservadoAnormalLengua() {
        return observadoAnormalLengua;
    }

    public void setObservadoAnormalLengua(String observadoAnormalLengua) {
        this.observadoAnormalLengua = observadoAnormalLengua;
    }

    public String getObservadoAnormalPaladar() {
        return observadoAnormalPaladar;
    }

    public void setObservadoAnormalPaladar(String observadoAnormalPaladar) {
        this.observadoAnormalPaladar = observadoAnormalPaladar;
    }

    public String getObservadoAnormalPissoBoca() {
        return observadoAnormalPissoBoca;
    }

    public void setObservadoAnormalPissoBoca(String observadoAnormalPissoBoca) {
        this.observadoAnormalPissoBoca = observadoAnormalPissoBoca;
    }

    public String getObservadoAnormalCarrillos() {
        return observadoAnormalCarrillos;
    }

    public void setObservadoAnormalCarrillos(String observadoAnormalCarrillos) {
        this.observadoAnormalCarrillos = observadoAnormalCarrillos;
    }

    public String getObservadoAnormalRebordes() {
        return observadoAnormalRebordes;
    }

    public void setObservadoAnormalRebordes(String observadoAnormalRebordes) {
        this.observadoAnormalRebordes = observadoAnormalRebordes;
    }

    public String getObservadoAnormalTrigonos() {
        return observadoAnormalTrigonos;
    }

    public void setObservadoAnormalTrigonos(String observadoAnormalTrigonos) {
        this.observadoAnormalTrigonos = observadoAnormalTrigonos;
    }

    public String getObservadoAnormalRetromolar() {
        return observadoAnormalRetromolar;
    }

    public void setObservadoAnormalRetromolar(String observadoAnormalRetromolar) {
        this.observadoAnormalRetromolar = observadoAnormalRetromolar;
    }

    public boolean isLesionManchas() {
        return lesionManchas;
    }

    public void setLesionManchas(boolean lesionManchas) {
        this.lesionManchas = lesionManchas;
    }

    public boolean isLesionAbultamientoTejidos() {
        return lesionAbultamientoTejidos;
    }

    public void setLesionAbultamientoTejidos(boolean lesionAbultamientoTejidos) {
        this.lesionAbultamientoTejidos = lesionAbultamientoTejidos;
    }

    public boolean isLesionUlceraciones() {
        return lesionUlceraciones;
    }

    public void setLesionUlceraciones(boolean lesionUlceraciones) {
        this.lesionUlceraciones = lesionUlceraciones;
    }

    public boolean isLesionAmpollar() {
        return lesionAmpollar;
    }

    public void setLesionAmpollar(boolean lesionAmpollar) {
        this.lesionAmpollar = lesionAmpollar;
    }

    public String isLesionOtros() {
        return lesionOtros;
    }

    public void setLesionOtros(String lesionOtros) {
        this.lesionOtros = lesionOtros;
    }

    public boolean isSangranEncias() {
        return sangranEncias;
    }

    public void setSangranEncias(boolean sangranEncias) {
        this.sangranEncias = sangranEncias;
    }

    public String getSangranEnciasCuando() {
        return sangranEnciasCuando;
    }

    public void setSangranEnciasCuando(String sangranEnciasCuando) {
        this.sangranEnciasCuando = sangranEnciasCuando;
    }

    public boolean isPusBoca() {
        return pusBoca;
    }

    public void setPusBoca(boolean pusBoca) {
        this.pusBoca = pusBoca;
    }

    public String getPusBocaDonde() {
        return pusBocaDonde;
    }

    public void setPusBocaDonde(String pusBocaDonde) {
        this.pusBocaDonde = pusBocaDonde;
    }

    public boolean isMovilidadDientes() {
        return movilidadDientes;
    }

    public void setMovilidadDientes(boolean movilidadDientes) {
        this.movilidadDientes = movilidadDientes;
    }

    public String getMorderSienteAltoDientes() {
        return morderSienteAltoDientes;
    }

    public void setMorderSienteAltoDientes(String morderSienteAltoDientes) {
        this.morderSienteAltoDientes = morderSienteAltoDientes;
    }

    public boolean isCaraHinchada() {
        return caraHinchada;
    }

    public void setCaraHinchada(boolean caraHinchada) {
        this.caraHinchada = caraHinchada;
    }

    public String getCaraHinchadaHielo() {
        return caraHinchadaHielo;
    }

    public void setCaraHinchadaHielo(String caraHinchadaHielo) {
        this.caraHinchadaHielo = caraHinchadaHielo;
    }

    public String getCaraHinchadaCalor() {
        return caraHinchadaCalor;
    }

    public void setCaraHinchadaCalor(String caraHinchadaCalor) {
        this.caraHinchadaCalor = caraHinchadaCalor;
    }

    public String getCaraHinchadaOtros() {
        return caraHinchadaOtros;
    }

    public void setCaraHinchadaOtros(String caraHinchadaOtros) {
        this.caraHinchadaOtros = caraHinchadaOtros;
    }

    public String getAzucarDiarios() {
        return azucarDiarios;
    }

    public void setAzucarDiarios(String azucarDiarios) {
        this.azucarDiarios = azucarDiarios;
    }

    public String getIndicePlaca() {
        return indicePlaca;
    }

    public void setIndicePlaca(String indicePlaca) {
        this.indicePlaca = indicePlaca;
    }

    public String getHigieneBucal() {
        return higieneBucal;
    }

    public void setHigieneBucal(String higieneBucal) {
        this.higieneBucal = higieneBucal;
    }


    
}
