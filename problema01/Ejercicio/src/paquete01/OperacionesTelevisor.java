/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALAI
 */
public class OperacionesTelevisor {

    double precioTotal;
    ArrayList<Televisor> televisores;
    double masCaro;
    String marcasVendidas;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void establecerTotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
        }
        precioTotal = s;
    }

    public double obtenerTotalPrecioTvs() {
        return precioTotal;
    }

    public void establecerMarcasVendidas(ArrayList<Televisor> t) {
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        marcasVendidas = s;
    }
    
    public String obtenerMarcasVendidas(){
        return marcasVendidas;
    }

    public void establecerTelevisorMasCaro(ArrayList<Televisor> t) {
        double x = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).obtenerPrecio() > x) {
                x = t.get(i).obtenerPrecio();
            }
        }
        masCaro = x;
    }
    
    public double obtenerTelevisorMasCaro(){
        return masCaro;
    }

    @Override
    public String toString() {
        return String.format("Precio total: %.2f\nMarca mas cara: %s", 
                obtenerTotalPrecioTvs(), obtenerTelevisorMasCaro());
    }

}
