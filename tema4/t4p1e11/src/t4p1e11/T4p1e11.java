/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p1e11;

import Excepciones.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T4p1e11 {

    public static String[][] matriznombre = {{"kitkat","chicles de fresa","lacasitos","palotes"},{"kinder bueno","bolsa variada haribo","chetoos","twix"},{"kinder bueno","M&M","papa delta","chicles de menta"},{"lacasitos","crunch","milkybar","kitkat"}};;
    public static double[][] matrizprecio = {{1.1,0.8,1.5,0.9},{1.8,1,1.2,1},{1.8,1.3,1.2,0.8},{1.5,1.1,1.1,1.1}};;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        try
        {
            int opcion=0;
            boolean rellena = false;
            while(opcion != 4)
            {
                opcion=mostrarMenu();
                switch(opcion)
                {
                    case 1:
                            pedir();
                        break;
                    case 2:
                           mostrar();
                        break;
                    case 3:
                            rellenar();
                        break;
                    case 4:
                            apagado();
                        break;
                 
                 default:
                     throw new NumeroNoValido();
                    
            }
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Problemas no identificados " + e.getMessage());
    }
        
    }
    
    public static int mostrarMenu() throws Exception
    {
        int opcion=0;
        boolean correcto;
        do
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1.- pedir golosina \n" +
                                              "2.- mostrar golosinas \n" +
                                              "3.- rellenar golosinas \n" +
                                              "4.- apagar \n" ));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "La opción tiene que ser un número");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "4.- apagar");
                correcto = false;
            }
        }
        while(!correcto);
        return opcion;
    }

    private static void pedir() throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void mostrar() throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void rellenar() throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void apagado() throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
