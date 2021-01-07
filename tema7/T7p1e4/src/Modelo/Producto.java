/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw03
 */
public class Producto {
    
    private String Nombre;
    private int PrecioU;
    private int UnidadesT;

    public Producto(String Nombre, int PrecioU, int UnidadesT) {
        this.Nombre = Nombre;
        this.PrecioU = PrecioU;
        this.UnidadesT = UnidadesT;
    }

    public Producto() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecioU() {
        return PrecioU;
    }

    public void setPrecioU(int PrecioU) {
        this.PrecioU = PrecioU;
    }

    public int getUnidadesT() {
        return UnidadesT;
    }

    public void setUnidadesT(int UnidadesT) {
        this.UnidadesT = UnidadesT;
    }

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", PrecioU=" + PrecioU + ", UnidadesT=" + UnidadesT + '}';
    }
        
}
