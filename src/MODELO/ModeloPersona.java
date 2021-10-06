/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.util.Base64;

/**
 *
 * @author patri
 */
public class ModeloPersona extends persona{
    
    private ConexionPG con = new ConexionPG();
     public ModeloPersona() {
    }

    public ModeloPersona(String cedula, String nombre, String apellido, String telefono, String email, String genero, String direccion) {
        super(cedula, nombre, apellido, telefono, email, genero, direccion);
    }
    
    public List<persona> listaPersonas(String aguja){
        String sql="select * from persona "
                + "where lower(nombre) like lower('%"+aguja+"%') or "
                + "lower(apellido) like lower('%"+aguja+"%') or "
                + "lower(cedula) like lower('%"+aguja+"%')";
        ResultSet rs=con.consulta(sql);
        List<persona> lista=new ArrayList<persona>();
        byte[] bf;
        
        try {
            
            while(rs.next()){
                persona p=new persona();
                p.setCedula(rs.getString("cedula"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setTelefono(rs.getString("telefono"));
//                p.setFechaNacimiento(rs.getDate("fechanacimiento"));
                p.setEmail(rs.getString("email"));
                p.setGenero(rs.getString("genero"));
                p.setDireccion(rs.getString("direccion"));
                
//                bf=rs.getBytes("foto");
//                if (bf!=null) {
//                    bf=Base64.decode(bf,0,bf.length);
//                    try {
//                        p.setFoto(obteberImagen(bf));
//                    } catch (IOException ex) {
//                        Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
                lista.add(p);
                
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
     
    
}
