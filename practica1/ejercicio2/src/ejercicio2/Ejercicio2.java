/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1;
        String n2;
        n1 = JOptionPane.showInputDialog("introduzca primer numero");
        n2 = JOptionPane.showInputDialog("introduzca segundo numero");
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es " + (n1*n2));
    }
    
}
