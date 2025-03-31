package com.equilibrio.backend.backendequilibrio.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class DeclaracionJurada {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;

    private boolean padreVive;
    private String enfermedadPadre;
    
    private boolean madreVive;
    private String enfermedadMadre;

    private boolean tieneHermanos;
    private String hermanosSanos;

    private boolean sufreEnfermedad;
    private String enfermedadCual;

    private boolean tratamientoMedico;
    private String tratamientoMedicoCual;

    private String medicamentosConsumeHabitualmente;

    private String medicamentoUltimos5;

    private boolean realizaDeporte;
    private boolean malestarDeporte;

    private boolean alergicoDroga;
    private boolean alergicoAnestecia;
    private boolean alergicoPenicilina;
    private String drogaCual;

    private boolean cicatriza;
    private String sangraMucho;

    private boolean problemaColageno;

    private boolean fiebreReumatica;
    private String fiebreReumaticaMedicacion;

    private boolean diabetico;
    private String controladoDiabetico;
    private String conQueDiabetico;

    private boolean problemaCardiaco;
    private String problemaCardiacoCual;

    private boolean aspirinaAnticoagulante;
    private String aspirinaAnticoagulanteFrecuencia;

    private boolean presion;

    private boolean chagas;
    private String chagasTratamiento;

    private boolean problemasRenales;

    private boolean ulceraGastrica;

    private boolean hepatitis;
    private String hepatitisTipo;

    private boolean problemaHepatico;
    private String problemaHepaticoCual;

    private boolean convulsiones;

    private boolean epileptico;
    private String epilepticoMedicacion;

    private boolean sifilisGonorrea;
    private boolean otraEnfermedadInfectocontagiosa;

    private boolean transfusiones;

    private boolean operado;
    private String operadoDeQue;
    private String operadoCuando;

    private boolean problemaRespiratorio;
    private String problemaRespiratorioCual;

    private boolean fuma;

    private boolean embarazada;
    private String embarazadaMeses;

    private boolean algunaOtraEnfermedad;
    private String algunaOtraEnfermedadCual;

    private String tratamientoHomeopaticoAcupuntura;

    private String medicoClinico;

    private String clinicaHospital;
    
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

    public boolean isPadreVive() {
        return padreVive;
    }
    public void setPadreVive(boolean padreVive) {
        this.padreVive = padreVive;
    }
    public String getEnfermedadPadre() {
        return enfermedadPadre;
    }
    public void setEnfermedadPadre(String enfermedadPadre) {
        this.enfermedadPadre = enfermedadPadre;
    }
    public boolean isMadreVive() {
        return madreVive;
    }
    public void setMadreVive(boolean madreVive) {
        this.madreVive = madreVive;
    }
    public String getEnfermedadMadre() {
        return enfermedadMadre;
    }
    public void setEnfermedadMadre(String enfermedadMadre) {
        this.enfermedadMadre = enfermedadMadre;
    }
    public boolean isTieneHermanos() {
        return tieneHermanos;
    }
    public void setTieneHermanos(boolean hermanos) {
        this.tieneHermanos = hermanos;
    }
    public String getHermanosSanos() {
        return hermanosSanos;
    }
    public void setHermanosSanos(String hermanosSanos) {
        this.hermanosSanos = hermanosSanos;
    }
    public boolean isSufreEnfermedad() {
        return sufreEnfermedad;
    }
    public void setSufreEnfermedad(boolean sufreEnfermedad) {
        this.sufreEnfermedad = sufreEnfermedad;
    }
    public String getEnfermedadCual() {
        return enfermedadCual;
    }
    public void setEnfermedadCual(String enfermedadCual) {
        this.enfermedadCual = enfermedadCual;
    }
    public boolean isTratamientoMedico() {
        return tratamientoMedico;
    }
    public void setTratamientoMedico(boolean tratamientoMedico) {
        this.tratamientoMedico = tratamientoMedico;
    }
    public String getTratamientoMedicoCual() {
        return tratamientoMedicoCual;
    }
    public void setTratamientoMedicoCual(String tratamientoCual) {
        this.tratamientoMedicoCual = tratamientoCual;
    }
    public String getMedicamentoUltimos5() {
        return medicamentoUltimos5;
    }
    public void setMedicamentoUltimos5(String medicamentoUltimos5) {
        this.medicamentoUltimos5 = medicamentoUltimos5;
    }
    public boolean isRealizaDeporte() {
        return realizaDeporte;
    }
    public void setRealizaDeporte(boolean realizaDeporte) {
        this.realizaDeporte = realizaDeporte;
    }
    public boolean isMalestarDeporte() {
        return malestarDeporte;
    }
    public void setMalestarDeporte(boolean malestarDeporte) {
        this.malestarDeporte = malestarDeporte;
    }
    public boolean isAlergicoDroga() {
        return alergicoDroga;
    }
    public void setAlergicoDroga(boolean alergicoDroga) {
        this.alergicoDroga = alergicoDroga;
    }
    public String getDrogaCual() {
        return drogaCual;
    }
    public void setDrogaCual(String drogaCual) {
        this.drogaCual = drogaCual;
    }
    public boolean isCicatriza() {
        return cicatriza;
    }
    public void setCicatriza(boolean cicatriza) {
        this.cicatriza = cicatriza;
    }
    public String getSangraMucho() {
        return sangraMucho;
    }
    public void setSangraMucho(String sangraMucho) {
        this.sangraMucho = sangraMucho;
    }
    public boolean isProblemaColageno() {
        return problemaColageno;
    }
    public void setProblemaColageno(boolean problemaColageno) {
        this.problemaColageno = problemaColageno;
    }
    public boolean isFiebreReumatica() {
        return fiebreReumatica;
    }
    public void setFiebreReumatica(boolean fiebreReumatica) {
        this.fiebreReumatica = fiebreReumatica;
    }
    public String getFiebreReumaticaMedicacion() {
        return fiebreReumaticaMedicacion;
    }
    public void setFiebreReumaticaMedicacion(String protegeMedicacionReumatica) {
        this.fiebreReumaticaMedicacion = protegeMedicacionReumatica;
    }
    public boolean isDiabetico() {
        return diabetico;
    }
    public void setDiabetico(boolean diabetico) {
        this.diabetico = diabetico;
    }
    public String getControladoDiabetico() {
        return controladoDiabetico;
    }
    public void setControladoDiabetico(String controladoDiabetico) {
        this.controladoDiabetico = controladoDiabetico;
    }
    public String getConQueDiabetico() {
        return conQueDiabetico;
    }
    public void setConQueDiabetico(String conQueDiabetico) {
        this.conQueDiabetico = conQueDiabetico;
    }
    public boolean isProblemaCardiaco() {
        return problemaCardiaco;
    }
    public void setProblemaCardiaco(boolean problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }
    public String getProblemaCardiacoCual() {
        return problemaCardiacoCual;
    }
    public void setProblemaCardiacoCual(String problemaCardiacoCual) {
        this.problemaCardiacoCual = problemaCardiacoCual;
    }
    public boolean isAspirinaAnticoagulante() {
        return aspirinaAnticoagulante;
    }
    public void setAspirinaAnticoagulante(boolean aspirinaAnticoagulante) {
        this.aspirinaAnticoagulante = aspirinaAnticoagulante;
    }
    public String getAspirinaAnticoagulanteFrecuencia() {
        return aspirinaAnticoagulanteFrecuencia;
    }
    public void setAspirinaAnticoagulanteFrecuencia(String aspirinaAnticoagulanteFrecuencia) {
        this.aspirinaAnticoagulanteFrecuencia = aspirinaAnticoagulanteFrecuencia;
    }
    public boolean isPresion() {
        return presion;
    }
    public void setPresion(boolean presion) {
        this.presion = presion;
    }
    public boolean isChagas() {
        return chagas;
    }
    public void setChagas(boolean chagas) {
        this.chagas = chagas;
    }
    public String getChagasTratamiento() {
        return chagasTratamiento;
    }
    public void setChagasTratamiento(String chagasTratamiento) {
        this.chagasTratamiento = chagasTratamiento;
    }
    public boolean isProblemasRenales() {
        return problemasRenales;
    }
    public void setProblemasRenales(boolean problemasRenales) {
        this.problemasRenales = problemasRenales;
    }
    public boolean isUlceraGastrica() {
        return ulceraGastrica;
    }
    public void setUlceraGastrica(boolean ulceraGastrica) {
        this.ulceraGastrica = ulceraGastrica;
    }
    public boolean isHepatitis() {
        return hepatitis;
    }
    public void setHepatitis(boolean hepatitis) {
        this.hepatitis = hepatitis;
    }
    public String getHepatitisTipo() {
        return hepatitisTipo;
    }
    public void setHepatitisTipo(String hepatitisTipo) {
        this.hepatitisTipo = hepatitisTipo;
    }
    public boolean isProblemaHepatico() {
        return problemaHepatico;
    }
    public void setProblemaHepatico(boolean problemaHepatico) {
        this.problemaHepatico = problemaHepatico;
    }
    public String getProblemaHepaticoCual() {
        return problemaHepaticoCual;
    }
    public void setProblemaHepaticoCual(String problemaHepaticoCual) {
        this.problemaHepaticoCual = problemaHepaticoCual;
    }
    public boolean isConvulsiones() {
        return convulsiones;
    }
    public void setConvulsiones(boolean convulsiones) {
        this.convulsiones = convulsiones;
    }
    public boolean isEpileptico() {
        return epileptico;
    }
    public void setEpileptico(boolean epileptico) {
        this.epileptico = epileptico;
    }
    public String getEpilepticoMedicacion() {
        return epilepticoMedicacion;
    }
    public void setEpilepticoMedicacion(String epilepticoMedicacion) {
        this.epilepticoMedicacion = epilepticoMedicacion;
    }
    public boolean isSifilisGonorrea() {
        return sifilisGonorrea;
    }
    public void setSifilisGonorrea(boolean sifilisGonorrea) {
        this.sifilisGonorrea = sifilisGonorrea;
    }
    public boolean getOtraEnfermedadInfectocontagiosa() {
        return otraEnfermedadInfectocontagiosa;
    }
    public void setOtraEnfermedadInfectocontagiosa(boolean otraEnfermedadInfectocontagiosa) {
        this.otraEnfermedadInfectocontagiosa = otraEnfermedadInfectocontagiosa;
    }
    public boolean isTransfusiones() {
        return transfusiones;
    }
    public void setTransfusiones(boolean transfusiones) {
        this.transfusiones = transfusiones;
    }
    public boolean isOperado() {
        return operado;
    }
    public void setOperado(boolean operado) {
        this.operado = operado;
    }
    public String getOperadoDeQue() {
        return operadoDeQue;
    }
    public void setOperadoDeQue(String operadoDeQue) {
        this.operadoDeQue = operadoDeQue;
    }
    public boolean isProblemaRespiratorio() {
        return problemaRespiratorio;
    }
    public void setProblemaRespiratorio(boolean problemaRespiratorio) {
        this.problemaRespiratorio = problemaRespiratorio;
    }
    public String getProblemaRespiratorioCual() {
        return problemaRespiratorioCual;
    }
    public void setProblemaRespiratorioCual(String problemaRespiratorioCual) {
        this.problemaRespiratorioCual = problemaRespiratorioCual;
    }
    public boolean isFuma() {
        return fuma;
    }
    public void setFuma(boolean fuma) {
        this.fuma = fuma;
    }
    public boolean isEmbarazada() {
        return embarazada;
    }
    public void setEmbarazada(boolean embarazada) {
        this.embarazada = embarazada;
    }
    public String getEmbarazadaMeses() {
        return embarazadaMeses;
    }
    public void setEmbarazadaMeses(String embarazadaMeses) {
        this.embarazadaMeses = embarazadaMeses;
    }
    public boolean isAlgunaOtraEnfermedad() {
        return algunaOtraEnfermedad;
    }
    public void setAlgunaOtraEnfermedad(boolean algunaOtraEnfermedad) {
        this.algunaOtraEnfermedad = algunaOtraEnfermedad;
    }
    public String getAlgunaOtraEnfermedadCual() {
        return algunaOtraEnfermedadCual;
    }
    public void setAlgunaOtraEnfermedadCual(String algunaOtraEnfermedadCual) {
        this.algunaOtraEnfermedadCual = algunaOtraEnfermedadCual;
    }
    public String getTratamientoHomeopaticoAcupuntura() {
        return tratamientoHomeopaticoAcupuntura;
    }
    public void setTratamientoHomeopaticoAcupuntura(String tratamientoHomeopaticoAcupuntura) {
        this.tratamientoHomeopaticoAcupuntura = tratamientoHomeopaticoAcupuntura;
    }
    public String getMedicoClinico() {
        return medicoClinico;
    }
    public void setMedicoClinico(String medicoClinico) {
        this.medicoClinico = medicoClinico;
    }
    public String getClinicaHospital() {
        return clinicaHospital;
    }
    public void setClinicaHospital(String clinicaHospital) {
        this.clinicaHospital = clinicaHospital;
    }
    public String getMedicamentosConsumeHabitualmente() {
        return medicamentosConsumeHabitualmente;
    }
    public void setMedicamentosConsumeHabitualmente(String medicamentosConsumeHabitualmente) {
        this.medicamentosConsumeHabitualmente = medicamentosConsumeHabitualmente;
    }
    public boolean isAlergicoAnestecia() {
        return alergicoAnestecia;
    }
    public void setAlergicoAnestecia(boolean alergicoAnestecia) {
        this.alergicoAnestecia = alergicoAnestecia;
    }
    public boolean isAlergicoPenicilina() {
        return alergicoPenicilina;
    }
    public void setAlergicoPenicilina(boolean alergicoPenicilina) {
        this.alergicoPenicilina = alergicoPenicilina;
    }
    public String getOperadoCuando() {
        return operadoCuando;
    }
    public void setOperadoCuando(String operadoCuando) {
        this.operadoCuando = operadoCuando;
    }

    
}
