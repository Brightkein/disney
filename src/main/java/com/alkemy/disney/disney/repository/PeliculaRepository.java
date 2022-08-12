package com.alkemy.disney.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkemy.disney.disney.entity.PeliculaEntity;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long>{
    
}
