/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p4.TipoMatricula;
import p2.Matricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerMatricula();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerMatricula();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerMatricula();
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerMatricula();
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerMatricula();
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerMatricula();
        
        TipoMatricula tipos = new TipoMatricula();
        ArrayList<Matricula> matriculas = new ArrayList<>();
        matriculas.add(mcamp);
        matriculas.add(mcolegio);
        matriculas.add(mescuela);
        matriculas.add(mjardin);
        matriculas.add(mmaternal);
        matriculas.add(mmaternal2);
        
        tipos.establecerMatriculas(matriculas);
        tipos.establecerPromedioMatriculas();
        
        System.out.printf("%s\n", tipos);
    }
}
