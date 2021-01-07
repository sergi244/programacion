/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p1e9;

import javax.swing.JOptionPane;
import Excepciones.numeronovalido;
/**
 *
 * @author 1gdaw03
 */
public class T4p1e9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            int[] codigos = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
            unidadesvendidas(codigos);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas: " + e.getMessage());
        }
    }

    private static void unidadesvendidas(int[] codigos) throws Exception{
        boolean error = true;
        int cantidad = 0;
        do
        {
            try
            {
                for(int x = 0; x < codigos.length; x++){
                    codigos[x] = cantidad;
            
                    if(cantidad<=0)
                    {
                        throw new numeronovalido();
                    }


                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Es un numero");
            }
            catch (numeronovalido e)
            {
                JOptionPane.showMessageDialog(null,"Numero no valido");
            }
        }
        while(error);
    }
        
}