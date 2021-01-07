/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3p3e5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T3P3e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            int dia = Integer.parseInt(JOptionPane.showInputDialog("teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("teclea el mes"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("teclea el año"));
            LocalDate fecha = LocalDate.of(ano,mes,dia);
            fecha =fecha.plusDays(100);
            JOptionPane.showMessageDialog(null, fecha);    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
        
    }
    
}
