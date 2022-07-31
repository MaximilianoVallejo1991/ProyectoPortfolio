package com.maxsalvadorportfolio.jmv2.entity;

import java.sql.Blob;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String nombreS;
    private String porcentajeS;
    private String urlS;
    private Blob fotoS;

    public Skills() {
    }

    public Skills(String nombreS, String porcentajeS, String urlS, Blob fotoS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
        this.urlS = urlS;
        this.fotoS = fotoS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
