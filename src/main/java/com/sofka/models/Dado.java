package com.sofka.models;

import java.util.Random;

public class Dado {
    // Constantes
    private static final Integer LIMITED_MINIMO = 1;
    private static final Integer LIMITED_MAXIMO = 6;
    
    // Atributos
    private Integer valor;   
    
    // Metodos
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    public void lanzar(){        
        Random random = new Random();        
        this.valor = random.nextInt((LIMITED_MAXIMO - LIMITED_MINIMO) + 1) + LIMITED_MINIMO;
    }
}
