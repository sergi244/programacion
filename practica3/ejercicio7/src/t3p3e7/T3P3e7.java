/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3p3e7;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T3P3e7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fecha1 = JOptionPane.showInputDialog("teclea una fecha");
            LocalDate fechauno = LocalDate.parse(fecha1, formatter);
            
            String fecha2 = JOptionPane.showInputDialog("teclea una fecha");
            LocalDate fechados = LocalDate.parse(fecha2, formatter);
            int contador = 0;
    }
        catch(DateTimeException e)
        {
            JOptionPane.showMessageDialog(null,"error " + e.getClass());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"en numero " + e.getClass());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
    }
    
}
