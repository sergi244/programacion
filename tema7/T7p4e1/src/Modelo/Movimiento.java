/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author 1gdaw03
 */
public class Movimiento {
    
    private LocalDate fecha;
    private String descripcion;
    private Float importe;

    public Movimiento(LocalDate fecha, String descripcion, Float importe) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }
    
    
    
}
