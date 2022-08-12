package com.alkemy.disney.disney.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.disney.disney.dto.GeneroDTO;
import com.alkemy.disney.disney.entity.GeneroEntity;
import com.alkemy.disney.disney.mapper.GeneroMapper;
import com.alkemy.disney.disney.repository.GeneroRepository;
import com.alkemy.disney.disney.service.GeneroService;

@Service
public class GeneroServiceImplementacion implements GeneroService{
    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepository;
    public GeneroDTO save(GeneroDTO dto){
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        GeneroEntity entitySaved = generoRepository.save(entity);
        GeneroDTO result=generoMapper.generoEntity2DTO(entitySaved);
        return result;
    }

    public List<GeneroDTO> getAllGeneros() {
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.generoEntityList2DTOList(entities);
        return result;
    }
}
