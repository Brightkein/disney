package com.alkemy.disney.disney.service;

import java.util.List;

import com.alkemy.disney.disney.dto.PersonajeDTO;

public interface PersonajeService {
    PersonajeDTO save(PersonajeDTO dto);

    List<PersonajeDTO> getAllPersonaje();
}
