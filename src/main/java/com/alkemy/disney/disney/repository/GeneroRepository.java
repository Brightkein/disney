package com.alkemy.disney.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alkemy.disney.disney.entity.GeneroEntity;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity, Long>{
    
}
