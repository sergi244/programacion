/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.util.*;

/**
 *
 * @author 1gdaw03
 */
public class Abogado extends Persona{

    private ArrayList<Caso> listaCasos;
    
    public Abogado(String DNI, String Nombre, String Apellidos, String Direccion) {
        super(DNI, Nombre, Apellidos, Direccion);
    }

    public ArrayList<Caso> getListaCasos() {
        return listaCasos;
    }

    public void setListaCasos(ArrayList<Caso> listaCasos) {
        this.listaCasos = listaCasos;
    }
    
}
