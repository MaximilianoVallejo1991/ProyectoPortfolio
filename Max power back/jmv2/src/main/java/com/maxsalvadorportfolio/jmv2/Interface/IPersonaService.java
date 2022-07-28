
package com.maxsalvadorportfolio.jmv2.Interface;

import com.maxsalvadorportfolio.jmv2.entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de personas
    
    public List<Persona> getPersona();
    
    //guardar un objeto del tipo persona
    
    public void savePersona(Persona persona);
    
    //eliminar un objeto buscandolo por ID
    
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    
    public Persona findPersona(Long id);
}
