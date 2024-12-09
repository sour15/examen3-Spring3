package com.example.examen3.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsuarioSeguridadDto {

    private Integer idUsuario;
    private String nomusuario;
    private String token;
    private String mensajeError;
}
