package com.alkemy.disney.disney.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


import com.alkemy.disney.disney.dto.PersonajeDTO;
import com.alkemy.disney.disney.entity.PersonajeEntity;

@Component
public class PersonajeMapper {

    

    public PersonajeEntity personajeDTO2Entity(PersonajeDTO dto){
        PersonajeEntity entity = new PersonajeEntity();
        entity.setImagen(dto.getImagen());
        entity.setNombre(dto.getNombre());
        entity.setEdad(dto.getEdad());
        entity.setPeso(dto.getPeso());
        entity.setHistoria(dto.getHistoria());
        //entity.setPeliculas(dto.getPeliculas());
        return entity;
    }

    public PersonajeDTO personajeEntity2DTO(PersonajeEntity entity){
        PersonajeDTO dto=new PersonajeDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        dto.setEdad(entity.getEdad());
        dto.setPeso(entity.getPeso());
        dto.setHistoria(entity.getHistoria());
        //dto.setPeliculas(entity.getPeliculas());
        return dto;
    }
    public List<PersonajeDTO> personajeListEntity2ListDTO(List<PersonajeEntity> entities){
        List<PersonajeDTO> dtos = new  ArrayList<>();
        for (PersonajeEntity entity : entities) {
            dtos.add(personajeEntity2DTO(entity));
        }
        return dtos;
    }
    
}
