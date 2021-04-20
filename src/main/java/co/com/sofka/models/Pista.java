package co.com.sofka.models;

import java.util.List;

public class Pista {
    // Constantes
    private static final Integer LONGITUD_KM = 5;
    
    // Constructores
    public Pista(List<Carril> carriles) {
        this.carriles = carriles;
    }    
    
    // Atributos
    private List<Carril> carriles;
}
