/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mislugares.main;

import com.example.mislugares.Lugar;
import com.example.mislugares.Lugares;
import com.example.mislugares.TipoLugar;
import com.mislugares.puntos.GeoPuntoAlt;

/**
 *
 * @author esteban
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                TipoLugar.EDUCACION,962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        System.out.println("Lugar : \n" + lugar.toString());
        
        for(Lugar l : Lugares.vectorLugares) {
             System.out.println(l);
       }
       
        System.out.println("\n\n");
        
        GeoPuntoAlt nu = new GeoPuntoAlt(4.166093, 38.995656, 4.568);
        GeoPuntoAlt nue = new GeoPuntoAlt(4.343, 98.995656, 90.568);
        
        System.out.println(nue.distancia(nu)); 
    }

}
