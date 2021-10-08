/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.postgresql.util.Base64;

/**
 *
 * @author patri
 */
public class ModeloCliente extends cliente{
    
    private ConexionPG con = new ConexionPG();
     public ModeloCliente() {
    }

    public ModeloCliente(int id_cliente, String cedula, String nombre, String apellido, String telefono, String email, String genero, String direccion) {
        super(id_cliente, cedula, nombre, apellido, telefono, email, genero, direccion);
    }

   
    
    public List<cliente> listaCliente(String aguja){
        String sql="select * from cliente "
                + "where lower(cedula) like lower('%"+aguja+"%')";
        ResultSet rs=con.consulta(sql);
        List<cliente> lista=new ArrayList<cliente>();
        byte[] bf;
        
        try {
            
            while(rs.next()){
                cliente p=new cliente();
                p.setCedula(rs.getString("cedula"));
                p.setId_cliente(rs.getInt("id_cliente"));
//                }
                lista.add(p);
                
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public void editar(String cedula){
//        String foto64=null;
//        try {
//            BufferedImage img=imgBimage(getFoto());
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ImageIO.write(img, "PNG", bos);
//            byte[] imgb=bos.toByteArray();
//            foto64=Base64.encodeBytes(imgb);
//        } catch (Exception e) {
//            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null,e);
//            
//        }
        String sql;
        sql="update cliente "
                + "set cedula='"+getCedula()+"' "
                + ",id_cliente='"+getId_cliente()+"' ";
                
         con.accion(sql);
    }
    
    public void remover(String cedula){
        String sql;
        sql="delete from cliente "
                + "where cedula='"+cedula+"'";
         con.accion(sql);
    }
    
     public void grabar(){
//        String foto64=null;
//        try {
//            BufferedImage img=imgBimage(getFoto());
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ImageIO.write(img, "PNG", bos);
//            byte[] imgb=bos.toByteArray();
//            foto64=Base64.encodeBytes(imgb);
//        } catch (Exception e) {
//            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null,e);
//            
//        }
        
        String sql;
        sql="insert into cliente(cedula,id_cliente) "
                + "values('"+getCedula()+"','"+getId_cliente()+"')";
         con.accion(sql);
    }
     
    
}
