package com.sofka.usecase;

import com.sofka.models.Carril;
import com.sofka.models.NombrePista;
import com.sofka.models.Pista;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerarPistaUseCase {    
    
    public static Pista generarPista(Integer numeroCarriles){          
        return new Pista(generarNumeroCarriles(numeroCarriles), obtenerNombrePista());
    }
    
    private static List<Carril> generarNumeroCarriles(Integer cantidadCarriles){        
        List<Carril> carriles = new ArrayList<>();        
        for (int i = 0; i < cantidadCarriles; i++) {
            carriles.add(new Carril(i + 1));
        }        
        return carriles;
    }
    
    private static String obtenerNombrePista(){
        for (NombrePista nombrePista : NombrePista.values()) {
            if(generarIndeceNombrePiosta(NombrePista.values().length) == nombrePista.ordinal()){
                return nombrePista.name();
            }
        }        
        return NombrePista.ROCK.name();
    }
    
    private static Integer generarIndeceNombrePiosta(Integer maximoNombre){        
        return new Random().nextInt((maximoNombre - 1) + 1) + 1;        
    }            
}
