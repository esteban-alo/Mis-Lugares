/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mislugares.puntos;

import java.lang.Math;
/**
 *
 * @author esteban
 */
public class GeoPunto {

    //declaración de atributos
    private double latitud, longitud;

    //declaración de constructor
    public GeoPunto() {
        
    }
    
//    public GeoPunto(double latitud, double longitud) {
//        this.longitud = latitud;
//        this.latitud = longitud;
//    }
    
    
    public GeoPunto (double latitud, double longitud) {
        this.longitud = (int) (longitud * 1E6);
        this.latitud = (int) (latitud * 1E6);
    }

    /**
     * Muestra las coordenadas
     *
     * @return
     */
    @Override    
    public String toString() {
        return "GeoPunto{" + "latitud=" + latitud + 
                ", longitud=" + longitud + '}';

    }

    /**
     * Aproxima la distancia en metros entre dos coordenadas
     *
     * @param punto
     * @return
     */
    public double distancia(GeoPunto punto) {
        final double RADIO_TIERRA = 6371000; // en metros

        double dLat = Math.toRadians(latitud - punto.latitud);

        double dLon = Math.toRadians(longitud - punto.longitud);

        double lat1 = Math.toRadians(punto.latitud);

        double lat2 = Math.toRadians(latitud);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.sin(dLon / 2) * Math.sin(dLon / 2)
                * Math.cos(lat1) * Math.cos(lat2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return c * RADIO_TIERRA;
    }

    //Getters
    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    //Setters
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

}
