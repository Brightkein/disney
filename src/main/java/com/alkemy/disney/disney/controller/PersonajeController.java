package com.alkemy.disney.disney.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.alkemy.disney.disney.dto.PersonajeDTO;
import com.alkemy.disney.disney.service.PersonajeService;

@RestController
@RequestMapping("Personajes")
public class PersonajeController {
    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    public ResponseEntity <PersonajeDTO> save (@RequestBody PersonajeDTO personaje){
        PersonajeDTO personajeGuardado=personajeService.save(personaje); 
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
    }

    @GetMapping
    public ResponseEntity<List<PersonajeDTO>> getAll(){
        List<PersonajeDTO> personajes = personajeService.getAllPersonaje();
        return ResponseEntity.ok().body(personajes);
    }


}
