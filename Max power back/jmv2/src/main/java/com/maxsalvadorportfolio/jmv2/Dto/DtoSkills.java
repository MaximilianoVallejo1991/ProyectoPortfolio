package com.maxsalvadorportfolio.jmv2.Dto;

import java.sql.Blob;
import javax.validation.constraints.NotBlank;

public class DtoSkills {
    @NotBlank
    private String nombreS;
    @NotBlank 
    private String porcentajeS;
    private String urlS;
    private Blob fotoS;

    public DtoSkills() {
    }

    public DtoSkills(String nombreS, String porcentajeS, String urlS, Blob fotoS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
        this.urlS = urlS;
        this.fotoS = fotoS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(String porcentajeS) {
        this.porcentajeS = porcentajeS;
    }

    public String getUrlS() {
        return urlS;
    }

    public void setUrlS(String urlS) {
        this.urlS = urlS;
    }

    public Blob getFotoS() {
        return fotoS;
    }

    public void setFotoS(Blob fotoS) {
        this.fotoS = fotoS;
    }
    
    
    
}
