/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
         */

        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();

        DominioGmail c = new DominioGmail();
        c.establecerDominio("gmail.com");
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        
        DominioOutlook o = new DominioOutlook();
        o.establecerDominio("Outlook.com");
        o.establecerUserName(e.obtenerUserName());
        o.establecerCorreo();

        DominioYahoo y = new DominioYahoo();
        y.establecerDominio("Yahoo.com");
        y.establecerUserName(e.obtenerUserName());
        y.establecerCorreo();

        DominioUTPL d = new DominioUTPL();
        d.establecerDominio("utpl.edu.ec");
        d.establecerUserName(e.obtenerUserName());
        d.establecerCorreo();

        DominioGobiernoEC g = new DominioGobiernoEC();
        g.establecerDominio("gobiernoec.gob.ec");
        g.establecerUserName(e.obtenerUserName());
        g.establecerCorreo();
        
        lista.add(c);
        lista.add(o);
        lista.add(y);
        lista.add(d);
        lista.add(g);

        e.establecerCorreos(lista);

        System.out.printf("%s\n", e);

    }

}
