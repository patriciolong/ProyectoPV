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
public class vehiculo {
    private int numero_serie;
    private String placa;
    private String color;

    public vehiculo() {
    }

    public vehiculo(int numero_serie, String placa, String color) {
        this.numero_serie = numero_serie;
        this.placa = placa;
        this.color = color;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    
}
