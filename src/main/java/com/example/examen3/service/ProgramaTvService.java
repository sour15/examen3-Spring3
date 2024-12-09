package com.example.examen3.service;

import com.example.examen3.model.ProgramaTv;

import java.util.List;
import java.util.Optional;

public class ProgramaTvService implements IProgramaTvService{
    @Override
    public List<ProgramaTv> getAllProgramas() {
        return List.of();
    }

    @Override
    public Optional<ProgramaTv> getProgramaById(Integer id) {
        return Optional.empty();
    }

    @Override
    public ProgramaTv createPrograma(ProgramaTv programa) {
        return null;
    }

    @Override
    public ProgramaTv updatePrograma(Integer id, ProgramaTv programa) {
        return null;
    }

    @Override
    public void deletePrograma(Integer id) {

    }
}
