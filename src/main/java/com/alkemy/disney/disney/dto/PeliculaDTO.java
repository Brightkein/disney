package com.alkemy.disney.disney.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


import com.alkemy.disney.disney.entity.PersonajeEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PeliculaDTO {
    private Long id;

    private String imagen;
    private String titulo;
    private LocalDate fechaCreacion;
    private Integer calificacion;
    private Long generoId;
    private Set<PersonajeEntity> personajes = new HashSet<>();

   
}
