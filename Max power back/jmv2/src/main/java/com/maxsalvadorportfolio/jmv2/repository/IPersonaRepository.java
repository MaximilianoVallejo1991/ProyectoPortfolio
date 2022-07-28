
package com.maxsalvadorportfolio.jmv2.repository;

import com.maxsalvadorportfolio.jmv2.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
