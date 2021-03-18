/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloBD.*;
import ModeloUML.*;
import Vistas.*;

/**
 *
 * @author 1gdaw03
 */
public class Controlador {

    private static VMenu vm;
    private static VPersonas vp;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vm = new VMenu();
        vm.setVisible(true);
    }
    
}
