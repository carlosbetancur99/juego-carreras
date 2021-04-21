package com.sofka.models;

public class Carro {
    
    private String nombre;
    private String marca;
    private Integer distanciaRecorrida;
    private Conductor conductor;

    public Carro(String nombreCarro, String marcaCarro, Conductor conductor) {
        this.marca = marcaCarro;
        this.nombre = nombreCarro;
        this.conductor = conductor;
        this.distanciaRecorrida = 0;
    }
    
    public Carro(Conductor conductor) {
        this.conductor = conductor;
        this.distanciaRecorrida = 0;
    }
    
    public void aumentarRecorrido(Integer distancia){
        this.distanciaRecorrida = distanciaRecorrida + distancia;
    }
    
    
}
