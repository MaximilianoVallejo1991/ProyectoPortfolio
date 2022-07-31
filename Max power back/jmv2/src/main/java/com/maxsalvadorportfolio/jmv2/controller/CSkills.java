
package com.maxsalvadorportfolio.jmv2.controller;



import com.maxsalvadorportfolio.jmv2.Dto.DtoSkills;
import com.maxsalvadorportfolio.jmv2.Security.Controller.Mensaje;
import com.maxsalvadorportfolio.jmv2.entity.Skills;
import com.maxsalvadorportfolio.jmv2.service.SSkills;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController   
@RequestMapping("/skills")
@CrossOrigin(origins = "http://localhost:4200")
public class CSkills {

    @Autowired
    SSkills sSkills;   
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Skills>> list() {
        List<Skills> list = sSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
        @GetMapping("/detail/{id}")
    public ResponseEntity<Skills> getById(@PathVariable("id") int id){
        if(!sSkills.existsById(id)){
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
                
            }
        
        Skills skills = sSkills.getOne(id).get();
        return new ResponseEntity(skills, HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoSkills dtoski) {
        if (StringUtils.isBlank(dtoski.getNombreS())) {
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sSkills.existsByNombreS(dtoski.getNombreS())) {
            return new ResponseEntity(new Mensaje("Ese Skills ya existe"), HttpStatus.BAD_REQUEST);
        }

        Skills skills = new Skills(dtoski.getNombreS(), dtoski.getPorcentajeS(),
                dtoski.getUrlS(), dtoski.getFotoS());
        sSkills.save(skills);
        return new ResponseEntity(new Mensaje("Skill agregado correctamente"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoSkills dtoski) {
        //validamos si existe el ID
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //comprueba el nombre de la skill
        if (sSkills.existsByNombreS(dtoski.getNombreS()) && sSkills.getByNombreS(dtoski.getNombreS()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ese Skill ya existe"), HttpStatus.BAD_REQUEST);
        }
        //para que los campos no estene en blanco
        if (StringUtils.isBlank(dtoski.getNombreS())) {
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Skills skills = sSkills.getOne(id).get();
        skills.setNombreS(dtoski.getNombreS());
        skills.setPorcentajeS(dtoski.getPorcentajeS());
        skills.setUrlS(dtoski.getUrlS());
        skills.setFotoS(dtoski.getFotoS());

        sSkills.save(skills);
        return new ResponseEntity(new Mensaje("Skill ACTUALIZADO"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkills.existsById(id)) 
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
            
        sSkills.delete(id);
        
        return new ResponseEntity(new Mensaje("Skill ELIMINADO"), HttpStatus.OK);
    }
    
  }
