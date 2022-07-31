package com.maxsalvadorportfolio.jmv2.Security.Controller;

/**
 *
 * @author jmaxi
 */
public class Mensaje {

    private String mensaje;

    //CONSTRUCTOR
    public Mensaje() {

    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //GETTER & SETTER
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
