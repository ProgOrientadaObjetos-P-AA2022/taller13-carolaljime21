/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

/**
 *
 * @author SALAI
 */
public abstract class Matricula {

    protected double matricula;
    protected String tipo;

    public abstract void establecerMatricula();

    public abstract void establecerTipo();

    public double obtenerMatricula() {

        return matricula;
    }

    public String obtenerTipo() {

        return tipo;
    }

}
