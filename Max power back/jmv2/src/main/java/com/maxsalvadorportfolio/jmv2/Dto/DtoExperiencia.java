
package com.maxsalvadorportfolio.jmv2.Dto;

import javax.validation.constraints.NotBlank;


public class DtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank String descripcionE;
    
    //CONSTRUCTORES

    public DtoExperiencia() {
    }

    public DtoExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    
     //getter & setter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}
