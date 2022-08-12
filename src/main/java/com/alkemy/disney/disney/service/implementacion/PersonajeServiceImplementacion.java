package com.alkemy.disney.disney.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.disney.disney.dto.PersonajeDTO;
import com.alkemy.disney.disney.entity.PersonajeEntity;
import com.alkemy.disney.disney.mapper.PersonajeMapper;
import com.alkemy.disney.disney.repository.PersonajeRepository;
import com.alkemy.disney.disney.service.PersonajeService;


@Service
public class PersonajeServiceImplementacion implements PersonajeService{

    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;
    public PersonajeDTO save(PersonajeDTO dto){
        PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity entitySaved = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntity2DTO(entitySaved);
        return result;
    }

    public List<PersonajeDTO> getAllPersonaje(){
        List<PersonajeEntity> entities = personajeRepository.findAll();
        List<PersonajeDTO> result = personajeMapper.personajeListEntity2ListDTO(entities);
        return result;
    }

    
}
