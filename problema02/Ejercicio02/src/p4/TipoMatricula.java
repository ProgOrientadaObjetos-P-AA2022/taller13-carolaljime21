/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.ArrayList;
import p2.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> m) {
        matriculas = m;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerMatricula();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }
    
     @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < matriculas.size(); i++) {
            cadena = String.format("%s\nTipo de matricula: %s\n"
                    + "Costo de matricula: %.2f\n",
                    cadena,
                    matriculas.get(i).obtenerTipo(),
                    matriculas.get(i).obtenerMatricula());
        }
        cadena = String.format("%sPromedio de matricula: %.2f\n", 
                cadena, promedioMatriculas);
        return cadena;
    }

}
