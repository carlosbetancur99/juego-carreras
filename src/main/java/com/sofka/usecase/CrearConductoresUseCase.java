package com.sofka.usecase;

import com.sofka.models.Conductor;
import java.util.List;
import java.util.stream.Collectors;

public class CrearConductoresUseCase {    
    
    public List<Conductor> crearConductores(List<String> nombresJugadores){
        return nombresJugadores.stream()
                .map(nombre -> crearConductor(nombre))
                .collect(Collectors.toList());
    }
    
    private Conductor crearConductor(String nombre){
        return new Conductor(nombre);
    }
}
