package com.example.examen3.service;

import com.example.examen3.model.Personaje;
import com.example.examen3.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajeService implements IPersonajeService{
    @Autowired
    private PersonajeRepository personajeRepository;

    @Override
    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    @Override
    public Optional<Personaje> getPersonajeById(Integer id) {
        return personajeRepository.findById(id);
    }

    @Override
    public Personaje createPersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    @Override
    public Personaje updatePersonaje(Integer id, Personaje personaje) {
        if (personajeRepository.existsById(id)) {
            personaje.setIdPersonaje(id);
            return personajeRepository.save(personaje);
        }
        return null;  // o lanzar una excepción si el personaje no existe
    }

    @Override
    public void deletePersonaje(Integer id) {
        personajeRepository.deleteById(id);
    }
}
