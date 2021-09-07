/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Usuario
 */
public class cliente extends persona{
    private int id_cliente;

    public cliente() {
    }

    public cliente(int id_cliente, String cedula, String nombre, String apellido, String telefono, String email, String genero, String direccion) {
        super(cedula, nombre, apellido, telefono, email, genero, direccion);
        this.id_cliente = id_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
