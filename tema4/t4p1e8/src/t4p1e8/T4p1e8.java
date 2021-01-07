/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p1e8;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T4p1e8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            String[] codalu = new String[5];
            int[] horasfalta = new int[5];
            inizializarcodalu(codalu);
            inizializarhorasfalta(horasfalta);
            mostrardatos(codalu, horasfalta);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
        }
    }

    private static void inizializarcodalu(String[] codalu) throws Exception{
        for(int x = 0; 0 < codalu.length; x++)
        {
            codalu[x] = JOptionPane.showInputDialog("Introduzca el codigo del alumno");
        }
    }

    private static void inizializarhorasfalta(int[] horasfalta) throws Exception{
        for(int x = 0; x < horasfalta.length; x++)
        {
            horasfalta[x] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas"));
        }
    }

    private static void mostrardatos(String[] codalu, int[] horasfalta) throws Exception{
        String datos="";
        for(int x = 0; x < codalu.length; x++)
        {
            datos = datos + codalu[x] + horasfalta[x];
        }
        JOptionPane.showMessageDialog(null, datos);
    }
    
}
