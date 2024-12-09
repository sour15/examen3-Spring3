package com.example.examen3.controller;

import com.example.examen3.model.Personaje;
import com.example.examen3.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/personaje")
public class PersonajeController {

        @Autowired
        private PersonajeService personajeService;

        @GetMapping
        public List<Personaje> getAllPersonajes() {
            return personajeService.getAllPersonajes();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Personaje> getPersonajeById(@PathVariable Integer id) {
            Optional<Personaje> personaje = personajeService.getPersonajeById(id);
            return personaje.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        }

        @PostMapping
        public ResponseEntity<Personaje> createPersonaje(@RequestBody Personaje personaje) {
            Personaje newPersonaje = personajeService.createPersonaje(personaje);
            return ResponseEntity.status(HttpStatus.CREATED).body(newPersonaje);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Personaje> updatePersonaje(@PathVariable Integer id, @RequestBody Personaje personaje) {
            Personaje updatedPersonaje = personajeService.updatePersonaje(id, personaje);
            return updatedPersonaje != null ? ResponseEntity.ok(updatedPersonaje) : ResponseEntity.notFound().build();
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletePersonaje(@PathVariable Integer id) {
            personajeService.deletePersonaje(id);
            return ResponseEntity.noContent().build();
        }
    }
