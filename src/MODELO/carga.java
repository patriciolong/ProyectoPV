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
public class carga {
    private int id_carga;
    private float peso;
    private String detalles;
    private Date fecha_recep;
    private Date fecha_entre;
    private String direccion;
    private float precio;

    public carga() {
    }

    public carga(int id_carga, float peso, String detalles, Date fecha_recep, Date fecha_entre, String direccion, float precio) {
        this.id_carga = id_carga;
        this.peso = peso;
        this.detalles = detalles;
        this.fecha_recep = fecha_recep;
        this.fecha_entre = fecha_entre;
        this.direccion = direccion;
        this.precio = precio;
    }

    public int getId_carga() {
        return id_carga;
    }

    public void setId_carga(int id_carga) {
        this.id_carga = id_carga;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFecha_recep() {
        return fecha_recep;
    }

    public void setFecha_recep(Date fecha_recep) {
        this.fecha_recep = fecha_recep;
    }

    public Date getFecha_entre() {
        return fecha_entre;
    }

    public void setFecha_entre(Date fecha_entre) {
        this.fecha_entre = fecha_entre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
