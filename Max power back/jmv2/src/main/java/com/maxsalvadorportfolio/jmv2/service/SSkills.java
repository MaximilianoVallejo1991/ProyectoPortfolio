package com.maxsalvadorportfolio.jmv2.service;

import com.maxsalvadorportfolio.jmv2.entity.Skills;
import com.maxsalvadorportfolio.jmv2.repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills {
    
    @Autowired
    RSkills sSkills;
    
    public List<Skills> list(){
        return sSkills.findAll();
    }
    
    public Optional<Skills> getOne(int id) {
        return sSkills.findById(id);
    }
    
    public Optional<Skills> getByNombreS(String nombreS) {
        return sSkills.findByNombreS(nombreS);
    }
        
    public void save(Skills skills) {
        sSkills.save(skills);
    }
    
    public void delete(int id) {
        sSkills.deleteById(id);
    }   
    
    public boolean existsById(int id) {
        return sSkills.existsById(id);
    }

    public boolean existsByNombreS(String nombreS) {
        return sSkills.existsByNombreS(nombreS);
    }
}
