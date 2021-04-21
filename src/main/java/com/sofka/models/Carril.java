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

    public Integer getNumeroCarril() {
        return numeroCarril;
    }

    public void setNumeroCarril(Integer numeroCarril) {
        this.numeroCarril = numeroCarril;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    
}
