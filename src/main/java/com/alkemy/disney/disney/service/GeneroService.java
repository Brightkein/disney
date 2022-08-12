package com.alkemy.disney.disney.service;

import java.util.List;

import com.alkemy.disney.disney.dto.GeneroDTO;

public interface GeneroService {

    GeneroDTO save(GeneroDTO dto);

    List<GeneroDTO> getAllGeneros();
}
