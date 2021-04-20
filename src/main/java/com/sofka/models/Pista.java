package com.sofka.models;

import java.util.List;

public class Pista {
    // Constantes
    private static final Integer LONGITUD_KM = 5;

     // Atributos
    private List<Carril> carriles;
    
    // Constructores
    public Pista(List<Carril> carriles) {
        this.carriles = carriles;
    }    
    
   
}
