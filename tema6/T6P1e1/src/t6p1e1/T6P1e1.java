/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p1e1;

import calculos.Circunferencia;
import excepciones.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T6P1e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            // Entrada
            double r = Double.parseDouble(JOptionPane.showInputDialog("Teclea el radio de la circunferencia"));
            if ( r <= 0)
                throw new DatoNoValido();
            
            // Creación
            Circunferencia c = new Circunferencia();
            c.setRadio(r);
            //  Circunferencia c = new Circunferencia(r);

            // Salida
            DecimalFormat df = new DecimalFormat("#.00");
            JOptionPane.showMessageDialog(null, "Los datos de la circunferencia con radio: " + c.getRadio() + " son:" +
                    "\n\n Longitud: " + df.format(c.getLongitud()) + 
                    "\n Area: " + df.format(c.getArea())+
                    "\n Volumen: " + df.format(c.getVolumen()));
        }
        catch(NumberFormatException e)
        {
            System.out.println("Problemas, el dato no es numérico");
        }
        catch(DatoNoValido e)
        {
            System.out.println("Problemas, el dato es menor o igual que cero");
        }
        catch(Exception e)
        {
            System.out.println("Problemas " + e.getMessage());
        }        
    }
    
}
