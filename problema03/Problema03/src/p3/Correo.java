/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public abstract class Correo {

    protected String dominio;
    private String correo;
    private String username;

    public abstract void establecerDominio(String n);

    public void establecerUserName(String u) {
        username = u;
    }

    public void establecerCorreo() {
        correo = String.format("%s@%s", obtenerUserName(),
                obtenerDominio());
    }

    public String obtenerDominio() {
        return dominio;
    }

    public String obtenerUserName() {
        return username;
    }

    public String obtenerCorreo() {
        return correo;
    }

}
