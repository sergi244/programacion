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
public class Cuenta {
    
   private String numero;
   private ArrayList<Movimiento> listaMovimientos;

    public Cuenta(String numero) {
        this.numero = numero;
        listaMovimientos = new ArrayList();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }
   
}
