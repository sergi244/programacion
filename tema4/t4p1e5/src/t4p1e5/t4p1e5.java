/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p1e5;

import Excepciones.DatosNoValidos;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class t4p1e5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            // Guardo los datos por mes.
            float[] arrayLitrosCaidos = new float[12];
            inicializaArrayLitrosCaidos(arrayLitrosCaidos);

            char continuar;
            do
            {
                solicitarDatosEntrada(arrayLitrosCaidos);
                continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
            }
            while (continuar == 's');

            visualizarLitrosCaidos(arrayLitrosCaidos);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas: " + e.getClass());
        }
    }
    
    public static void inicializaArrayLitrosCaidos(float[] arrayLitrosCaidos) throws Exception
    {
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
            arrayLitrosCaidos[x] = 0;
        
        // Arrays.fill(arrayLitrosCaidos,0);
   
    }

    private static void solicitarDatosEntrada(float[] arrayLitrosCaidos) throws Exception
    {
        boolean error = true;
        do
        {
            try
            {
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes: "));
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia: "));

                if (mes < 1 || mes > 12 || dia < 1 || dia > 31)
                    throw new DatosNoValidos();
                // Entrada y acumulación de los litros caidos
                float litros = Float.parseFloat(JOptionPane.showInputDialog("Teclea los litros caídos: "));
                arrayLitrosCaidos[mes-1] += litros;
                
                error = false;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"El mes y el día son datos numéricos");
            }
            catch(DatosNoValidos e)
            {
                JOptionPane.showMessageDialog(null," El mes va del 1 al 12 y el día del 1 al 31");
            }
        }
        while(error);
    }


    private static void visualizarLitrosCaidos(float[] arrayLitrosCaidos) throws Exception
    {
        String litrosCaidos = "";
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
        {
          litrosCaidos = litrosCaidos + (x+1) + " - " + arrayLitrosCaidos[x]+ "\n";
  
        }   
       JOptionPane.showMessageDialog(null, "Los litros recogidos durante los doce meses del año son: \n" + litrosCaidos );        
    }
}
