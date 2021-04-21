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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTurno() {
        return turno;
    }

    public void setTurno(Boolean turno) {
        this.turno = turno;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }


    
    
    
}
