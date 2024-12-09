package com.example.examen3.service;

import com.example.examen3.model.Personaje;

import java.util.List;
import java.util.Optional;

public interface IPersonajeService {
    List<Personaje> getAllPersonajes();
    Optional<Personaje> getPersonajeById(Integer id);
    Personaje createPersonaje(Personaje personaje);
    Personaje updatePersonaje(Integer id, Personaje personaje);
    void deletePersonaje(Integer id);
}

