/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3p3e4;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Formatter;

/**
 *
 * @author 1gdaw03
 */
public class T3P3e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        try{
            
        String fechaString = JOptionPane.showInputDialog("teclea fecha con formato dd-MM-yy");
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
        Date fechaUno = formato.parse(fechaString);
        
        fechaString = JOptionPane.showInputDialog("teclea fecha con formato dd-MM-yy");
        Date fechaDos = formato.parse(fechaString);
    
        Long milisegundos = fechaUno.getTime() - fechaDos.getTime();
        Long Dias = milisegundos / 86400000;
        
        JOptionPane.showMessageDialog(null,"La diferencia entre " + fechaUno + " y " + fechaDos);
    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
    }
    
}
