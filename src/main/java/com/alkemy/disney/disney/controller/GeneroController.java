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

import com.alkemy.disney.disney.dto.GeneroDTO;
import com.alkemy.disney.disney.service.GeneroService;

@RestController
@RequestMapping("Generos")

public class GeneroController {
    
    @Autowired
    private GeneroService generoService;

@GetMapping
public ResponseEntity<List<GeneroDTO>> getAll(){
    List<GeneroDTO> Generos = generoService.getAllGeneros();
    return ResponseEntity.ok().body(Generos);
}

    @PostMapping
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero){
        GeneroDTO generoGuardado= generoService.save(genero);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
    }
/* 
    @DeleteMapping("/{id}")
    public ResponseEntity<void> delete(@PathVariable Long id){
        this.generoService.felete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }
*/
}
