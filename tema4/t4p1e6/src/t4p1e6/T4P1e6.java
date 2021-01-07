/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p1e6;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T4P1e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            int[] contador = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            entradaDatos(abecedario,contador);
            salidaDatos(abecedario,contador);           
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas: " + e.getMessage());
        }
    }

    private static void entradaDatos(char[] abecedario, int[] contador) {
        int y;
        String mensaje = JOptionPane.showInputDialog("introduzca un mensaje").toLowerCase();
        
        for (int x = 0; x < mensaje.length(); x++)
        {
            y = Arrays.binarySearch (abecedario, mensaje.charAt(x));
            if (y != -1)
                contador[y]=contador[y]+1;

        }
            
    }

    private static void salidaDatos(char[] abecedario, int[] contador) throws Exception
    {
        String resultados="";       
        for (int x = 0; x <contador.length; x++)
        {
           if(contador[x]!=0)  //se quiere excluir las letras que no aparecen
              resultados = resultados + abecedario[x] + " - " + contador[x]+ "\n";
        }
        JOptionPane.showMessageDialog(null, "La frecuencia de las letras es: \n\n" + resultados  ); 
   
    }


}
