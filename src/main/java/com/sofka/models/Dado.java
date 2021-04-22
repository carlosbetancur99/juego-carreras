package com.sofka.models;

import java.util.Random;

public class Dado {
    // Constantes
    private static final Integer LIMITED_MINIMO = 1;
    private static final Integer LIMITED_MAXIMO = 6;
    
    // Atributos
    private Integer valor;  

    public Dado() {
        this.valor = 0;
    }   
    
    // Metodos
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    public Integer lanzar(){                
        return valor = new Random().nextInt((LIMITED_MAXIMO - LIMITED_MINIMO) + 1) + LIMITED_MINIMO;
    }

    @Override
    public String toString() {
        return "Dado{" + "valor=" + valor + '}';
    }
    
    
}
