/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p4e1;

import Vista.*;
import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw03
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Cliente> listaclientes;
    private ArrayList<Cuenta> listaCuentas;
    private static VLogin l;
    private static VInicio I;
    
    public static void main(String[] args) {
        
        I = new VInicio(true);
        I.setVisible(true);
    }

    public static void acceso() {
       
        l = new VLogin(true);
        l.setVisible(true);
        I.dispose();
        
    }
    
}
