package com.example.examen3.service;

import com.example.examen3.model.ProgramaTv;

import java.util.List;
import java.util.Optional;

public interface IProgramaTvService {
    List<ProgramaTv> getAllProgramas();
    Optional<ProgramaTv> getProgramaById(Integer id);
    ProgramaTv createPrograma(ProgramaTv programa);
    ProgramaTv updatePrograma(Integer id, ProgramaTv programa);
    void deletePrograma(Integer id);
}

