/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioabogados;

import ModeloUML.*;
import ModeloBD.*;
import Vista.*;

/**
 *
 * @author 1gdaw03
 */

public class Controlador {

    private static VPrincipal vp;
    private static VCliente vc;
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        vp = new VPrincipal();
        vp.setVisible(true);
    }
    
    public static void Alta() {
        vc = new VCliente();
        vc.setVisible(true);
    }
    
    public static void CerrarVentana() {
        vc.dispose();
    }
    
    public static void Salir() {
        System.exit(0);
    }

}
