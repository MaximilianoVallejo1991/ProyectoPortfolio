package com.maxsalvadorportfolio.jmv2.service;

import com.maxsalvadorportfolio.jmv2.entity.Proyectos;
import com.maxsalvadorportfolio.jmv2.repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {

    @Autowired
    RProyectos sProyectos;

    public List<Proyectos> list() {
        return sProyectos.findAll();
    }

    public Optional<Proyectos> getOne(int id) {
        return sProyectos.findById(id);
    }

    public Optional<Proyectos> getByNombreP(String nombreP) {
        return sProyectos.findByNombreP(nombreP);
    }

    public void save(Proyectos proyectos) {
        sProyectos.save(proyectos);
    }

    public void delete(int id) {
        sProyectos.deleteById(id);
    }

    public boolean existsById(int id) {
        return sProyectos.existsById(id);
    }

    public boolean existsByNombreP(String nombreP) {
        return sProyectos.existsByNombreP(nombreP);
    }
}
