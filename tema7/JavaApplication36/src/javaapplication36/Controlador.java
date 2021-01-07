/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import Modelo.Persona;
import Vista.V1;

/**
 *
 * @author usuario
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static V1 v1;
    public static void main(String[] args) {
       v1 = new V1();
       v1.setVisible(true);
    }
    
    public static void tenDatos(String n, String e)
    {
        Persona p = new Persona(n,Integer.parseInt(e));
        // bd.ten(p);
        //listaPersonas.add(p);
       // v1.tenDatos(p.getNombre(),p.getEdad());
    }
    
    public static void salir(){
        System.exit(0);
    }
}
