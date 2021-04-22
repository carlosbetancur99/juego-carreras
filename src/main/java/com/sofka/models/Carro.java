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

    @Override
    public String toString() {
        return "Carro{" + "nombre=" + nombre + ", marca=" + marca + ", distanciaRecorrida=" + distanciaRecorrida + ", conductor=" + conductor + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(Integer distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }
    


    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    
}
