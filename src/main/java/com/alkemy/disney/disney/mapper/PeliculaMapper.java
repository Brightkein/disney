package com.alkemy.disney.disney.mapper;

import org.springframework.stereotype.Component;

import com.alkemy.disney.disney.dto.PeliculaDTO;
import com.alkemy.disney.disney.entity.PeliculaEntity;
import java.util.List;
import java.util.ArrayList;

@Component

public class PeliculaMapper {
    public PeliculaEntity peliculaDTO2Entity(PeliculaDTO dto){
        PeliculaEntity entity = new PeliculaEntity();
        entity.setImagen(dto.getImagen());
        entity.setTitulo(dto.getTitulo());
        entity.setFechaCreacion(dto.getFechaCreacion());
        entity.setCalificacion(dto.getCalificacion());
        entity.setGeneroId(dto.getGeneroId());
        return entity; 
    }

    public PeliculaDTO peliculaEntity2DTO(PeliculaEntity entity){
        PeliculaDTO dto= new PeliculaDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setTitulo(entity.getTitulo());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setCalificacion(entity.getCalificacion());
        dto.setId(entity.getId());
        dto.setGeneroId(entity.getGeneroId());
        return dto;
    }

    public List<PeliculaDTO> peliculaListEntity2ListDTO(List<PeliculaEntity> entities){
        List<PeliculaDTO> dtos = new ArrayList<>();
        for(PeliculaEntity entity : entities){
            dtos.add(peliculaEntity2DTO(entity));
        }
        return dtos;

    }
}
