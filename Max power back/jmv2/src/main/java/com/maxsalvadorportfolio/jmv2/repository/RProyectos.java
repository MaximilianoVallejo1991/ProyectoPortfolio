package com.maxsalvadorportfolio.jmv2.repository;

import com.maxsalvadorportfolio.jmv2.entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository  
public interface RProyectos extends JpaRepository<Proyectos, Integer> {

    public Optional<Proyectos> findByNombreP(String nombreE);

    public boolean existsByNombreP(String nombreE);
}
