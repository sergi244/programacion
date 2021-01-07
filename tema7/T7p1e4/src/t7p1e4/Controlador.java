/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1e4;

import Modelo.Producto;
import Vista.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw03
 */



public class Controlador {

    private static VCompraVenta v1 = new VCompraVenta();
    private static Comprar v2 = new Comprar();
    private static Vender v3 = new Vender();
    private static ArrayList<Producto> productos;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        v1.setVisible(true);
        
    }

    public static void salir() {
        v1.setVisible(false);
        System.exit(0);
        
    }

    public static void comprar() {
        v1.setVisible(false);
        v2.setVisible(true);
    }

    public static void vender() {
        v1.setVisible(false);
        v3.setVisible(true);    
    }
    
}
