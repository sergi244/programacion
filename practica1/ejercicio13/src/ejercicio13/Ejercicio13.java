/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;
        while (contador != 10){
            int n = Integer.parseInt(JOptionPane.showInputDialog("escribe un numero"));
            suma = suma + n;
            contador = contador + 1;
            }
        System.out.println(suma);
    }
}
