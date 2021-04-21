package com.sofka.models;

import java.util.List;

public class Pista {
    // Constantes
    private static final Integer LONGITUD_KM = 5;

     // Atributos
    private String nombrePista;
    private List<Carril> carriles;
    
    // Constructores
    public Pista(List<Carril> carriles, String nombrePista) {
        this.carriles = carriles;
        this.nombrePista = nombrePista;
    }    
    
    public Pista() {
    }  

    public String getNombrePista() {
        return nombrePista;
    }

    public void setNombrePista(String nombrePista) {
        this.nombrePista = nombrePista;
    }

    public List<Carril> getCarriles() {
        return carriles;
    }

    public void setCarriles(List<Carril> carriles) {
        this.carriles = carriles;
    }
    
   
}
