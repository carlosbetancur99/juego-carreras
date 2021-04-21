package com.sofka.usecase;

import com.sofka.models.Carril;
import com.sofka.models.Carro;
import com.sofka.models.Pista;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AgregarCarroACarrilUseCase {
    
    public static Pista agregarCarrosACarriles(Pista pista, List<Carro> carros){        
        pista.setCarriles(pista.getCarriles()
                .stream()
                .map(carril -> {
                    carril.setCarro(carros.get(carril.getNumeroCarril() - 1));
                    return carril;                            
                            })
                .collect(Collectors.toList()));        
        return pista;
    }  
}
