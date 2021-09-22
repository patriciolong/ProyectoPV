/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ConexionPG {
    Connection con; //conexion
    Statement st;//comandos sql
    ResultSet rs;//resultados de consulta.
    
    String cadConexion="jdbc:postgresql://localhost:5432/trailersbdd";//Cadena de conexion
    String pgUser="postgres";
    String pgContra="pepo2001";
    
    
    
    
    
    

    public ConexionPG() {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Se Cargo Driver.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con=DriverManager.getConnection(cadConexion,pgUser,pgContra);
            System.out.println("Se conecto DB.");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public SQLException accion(String nsql){
        System.out.println(nsql);
        try {
            st=con.createStatement();
            st.execute(nsql);
            st.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }
    
    public ResultSet consulta(String sql){
        System.out.println(sql);
        try {
            st=con.createStatement();
            ResultSet rs = st.executeQuery(sql);
          //  st.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
    }
    
    
    
    
}
