/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mislugares.puntos;

/**
 *
 * @author esteban
 */
public class GeoPuntoAlt extends GeoPunto {

    //declaración de atributos
    private double altura;

    public GeoPuntoAlt() {
    }

    public GeoPuntoAlt(double altura) {
        this.altura = altura;
    }

//    public GeoPuntoAlt(double latitud, double longitud) {
//        super(latitud, longitud);
//        this.altura = 0;
//    }
    public GeoPuntoAlt(double latitud, double longitud, double altura) {
        super(latitud, longitud);
        this.altura = altura;
    }

//    public double distanciaT(GeoPuntoAlt gpa) {
//                
//        double distanciaT = Math.pow(this.distancia(gpa), 2) + 
//                Math.pow((altura - gpa.getAltura()), 2);
//        
//        return Math.sqrt(distanciaT);
//        
//    }
    
    public double distancia(GeoPuntoAlt punto) {
        double distancia_anterior = Math.pow(super.distancia(punto), 2);
        double diferencia_alturas = Math.pow(this.altura - punto.altura, 2);
        System.out.print("D Ant " + distancia_anterior);
        System.out.println("\n");
        System.out.print("D Alt " +diferencia_alturas);
        System.out.println("\n");
        return Math.sqrt(distancia_anterior + diferencia_alturas);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
