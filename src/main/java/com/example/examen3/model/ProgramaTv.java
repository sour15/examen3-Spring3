package com.example.examen3.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ProgramaTv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProgramaTv;

    @Column(nullable = false, length = 250)
    private String titulo;

    @Column(nullable = false, length = 250)
    private String resumen;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @ManyToOne
    @JoinColumn(name = "idPersonaje", nullable = false)
    private Personaje personaje;

    // Getters y setters
    public Integer getIdProgramaTv() {
        return idProgramaTv;
    }

    public void setIdProgramaTv(Integer idProgramaTv) {
        this.idProgramaTv = idProgramaTv;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
}
