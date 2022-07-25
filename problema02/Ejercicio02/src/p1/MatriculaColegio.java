/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaColegio extends Matricula{
        
   @Override
    public void establecerMatricula() {
        matricula = 150.2 + 140.2 + 240.2 + 300.4;
    }

    @Override
    public void establecerTipo() {
        tipo = "Matricula colegio";
    }
}
