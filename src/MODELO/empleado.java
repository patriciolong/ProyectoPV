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
public class empleado extends persona{
    private int id_empleado;
    private double sueldo;

    public empleado(int id_empleado, double sueldo, String cedula, String nombre, String apellido, String telefono, String email, String genero, String direccion) {
        super(cedula, nombre, apellido, telefono, email, genero, direccion);
        this.id_empleado = id_empleado;
        this.sueldo = sueldo;
    }

    public empleado() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
