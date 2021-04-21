
package com.sofka.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
   
    public static final String USUARIO_BDA="root";
    public static final String CONTRASEÑA_BDA="admin";
    public static final String URL_CONEXION="jdbc:mysql://localhost:3306/bd_juego_carreras?serverTimezone=UTC";
    
    
    Connection conexion=null;
    
    
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            conexion= DriverManager.getConnection(URL_CONEXION,USUARIO_BDA,CONTRASEÑA_BDA);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
 
        System.err.println("la conexion ha sido exitosa");        
        return conexion;
    }
    
}
