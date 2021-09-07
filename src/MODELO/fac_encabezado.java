/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class fac_encabezado {
    private int id_encabezado;
    private Date fecha_entrega;

    public fac_encabezado() {
    }

    public fac_encabezado(int id_encabezado, Date fecha_entrega) {
        this.id_encabezado = id_encabezado;
        this.fecha_entrega = fecha_entrega;
    }

    public int getId_encabezado() {
        return id_encabezado;
    }

    public void setId_encabezado(int id_encabezado) {
        this.id_encabezado = id_encabezado;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    
    
}
