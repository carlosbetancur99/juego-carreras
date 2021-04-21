package com.sofka.models;

public class Carril {
    private Integer numeroCarril;
    private Carro carro;

    public Carril(Carro carro) {
        this.carro = carro;
    }   
    
    public Carril(Integer numeroCarril){
        this.numeroCarril = numeroCarril;
    }
}
