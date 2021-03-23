/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.time.*;
import java.util.*;

/**
 *
 * @author 1gdaw03
 */
public class Caso {
    
    private String Numero_Expediente;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    private String Estado;
    private Cliente cliente;
    private ArrayList<Abogado> Abogados;

    public Caso(String Numero_Expediente, LocalDate FechaInicio, LocalDate FechaFin, String Estado) {
        this.Numero_Expediente = Numero_Expediente;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Estado = Estado;
    }

    public Caso() {
    }

    public String getNumero_Expediente() {
        return Numero_Expediente;
    }

    public void setNumero_Expediente(String Numero_Expediente) {
        this.Numero_Expediente = Numero_Expediente;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public ArrayList<Abogado> getAbogados() {
        return Abogados;
    }

    public void setAbogados(ArrayList<Abogado> Abogados) {
        this.Abogados = Abogados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
