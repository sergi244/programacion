/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        String respuesta;
        do{
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "teclea nota del alumno"));
            if(nota >= 6){
                contador = contador + 1;
                do
                {
                 respuesta = JOptionPane.showInputDialog(null, "¿quieres continuar?");
                }
                while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
            }
            respuesta = JOptionPane.showInputDialog("¿Quieres agregar nota de otro alumno?");
        }
        while(respuesta.equalsIgnoreCase("si"));
    System.out.println(contador);
    }
    
}
