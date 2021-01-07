/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p1e4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T4P1e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}; //declarar, crear y llenar
            funcionmes(meses);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas: " + e.getClass());
        }
    }

    private static void funcionmes(String[] meses) {
        String mes = JOptionPane.showInputDialog("Introduzca el mes en letras");
            int x;
            boolean encontrado = false;
            for(x = 0; x < meses.length && !encontrado; x++)
            {
                if (meses[x].compareToIgnoreCase(mes) == 0)
                    encontrado = true;
            }
            if(!encontrado)
                JOptionPane.showMessageDialog(null,"Mes no valido");
            else
                JOptionPane.showMessageDialog(null,"Mes valido");
    }
  
}
