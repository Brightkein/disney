package com.alkemy.disney.disney.dto;

import java.util.ArrayList;
import java.util.List;

import com.alkemy.disney.disney.entity.PeliculaEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PersonajeDTO {
    
    private Long id;

    private String imagen;
    private String nombre;
    private Long edad;
    private Long peso;
    private String historia;
    private List<PeliculaEntity>peliculas = new ArrayList<>();
}
