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
public class Cliente {
    
    private String NombreApellidos;
    private String DNI;
    private String clave;
    
    private ArrayList<Cuenta> listaCuentas;

    public Cliente(String NombreApellidos, String DNI, String clave) {
        this.NombreApellidos = NombreApellidos;
        this.DNI = DNI;
        this.clave = clave;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public String getNombreApellidos() {
        return NombreApellidos;
    }

    public void setNombreApellidos(String NombreApellidos) {
        this.NombreApellidos = NombreApellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    
}
