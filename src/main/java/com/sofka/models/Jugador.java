package com.sofka.models;

public class Jugador {
    private String nombre;
    private Boolean turno;
    private Dado dado;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.turno = Boolean.FALSE;
        this.dado = new Dado();
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", turno=" + turno + ", dado=" + dado + '}';
    }


    
    
    
}
