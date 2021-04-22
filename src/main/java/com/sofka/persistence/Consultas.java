package com.sofka.persistence;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consultas {
    
    private Statement st;
    private ResultSet rs;
    private Conexion conexion;
    
    
    public Consultas(){
        
    }
    
    
    public void insertarPodio(){
        conexion = new Conexion();
        
        try {
            st = conexion.conectar().createStatement();
            rs = st.executeQuery("insert into bd_juego_carreras (Carro,Jugador,Posicion) VALUES (?,?,?,?)");
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        conexion.cerrar();
        
        
    }
    
}
