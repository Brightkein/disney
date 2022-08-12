package com.alkemy.disney.disney.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.disney.disney.dto.PeliculaDTO;
import com.alkemy.disney.disney.entity.PeliculaEntity;
import com.alkemy.disney.disney.mapper.PeliculaMapper;
import com.alkemy.disney.disney.repository.PeliculaRepository;
import com.alkemy.disney.disney.service.PeliculaService;
@Service
public class PeliculaServiceImplementacion implements PeliculaService{
    @Autowired
    private PeliculaMapper peliculaMapper;
    @Autowired
    private PeliculaRepository peliculaRepository;
    

    public PeliculaDTO save(PeliculaDTO dto){
        PeliculaEntity entity = peliculaMapper.peliculaDTO2Entity(dto);
        PeliculaEntity entitySaved = peliculaRepository.save(entity);
        PeliculaDTO result=peliculaMapper.peliculaEntity2DTO(entitySaved);
        return result;
    }

    public List<PeliculaDTO> getAllPeliculas(){
        List<PeliculaEntity> entities = peliculaRepository.findAll();
        List<PeliculaDTO> result =peliculaMapper.peliculaListEntity2ListDTO(entities);
        return result;

        
    }
}
