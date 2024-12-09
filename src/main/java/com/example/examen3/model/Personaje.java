package com.example.examen3.model;



import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersonaje;

    @Column(nullable = false, length = 50)
    private String nomPersonaje;

    @Column(nullable = false, length = 50)
    private String apePersonaje;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechNacPersonaje;

    @OneToMany(mappedBy = "personaje")
    private List<ProgramaTv> programas;

    // Getters y setters
    public Integer getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Integer idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNomPersonaje() {
        return nomPersonaje;
    }

    public void setNomPersonaje(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }

    public String getApePersonaje() {
        return apePersonaje;
    }

    public void setApePersonaje(String apePersonaje) {
        this.apePersonaje = apePersonaje;
    }

    public Date getFechNacPersonaje() {
        return fechNacPersonaje;
    }

    public void setFechNacPersonaje(Date fechNacPersonaje) {
        this.fechNacPersonaje = fechNacPersonaje;
    }
}
