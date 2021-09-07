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
public class fac_detalle {
    private int id_detalle;
    private float total;

    public fac_detalle() {
    }

    public fac_detalle(int id_detalle, float total) {
        this.id_detalle = id_detalle;
        this.total = total;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
