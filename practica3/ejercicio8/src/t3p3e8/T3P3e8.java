/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3p3e8;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T3P3e8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            JOptionPane.showMessageDialog(null, "teclea fecha de nacimiento");
            int dia = Integer.parseInt(JOptionPane.showInputDialog("teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("teclea el mes en numero"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("teclea el año"));
            LocalDate nacimiento = LocalDate.of(ano,mes,dia);
            LocalDate actual = LocalDate.now();
            Period entre = Period.between(nacimiento, actual);
            JOptionPane.showMessageDialog(null, "Han transcurrido " + entre.getYears () + " años y " + entre. getMonths () + " meses y " + entre.getDays () + " dias.");
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
