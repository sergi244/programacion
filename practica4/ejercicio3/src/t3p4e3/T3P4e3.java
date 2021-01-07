/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3p4e3;

import Excepciones.CuentaNoValida;
import Excepciones.SaldoInicial;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T3P4e3 {
    private static String numerocuenta;
    private static int saldoinicial;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
                String nombre =JOptionPane.showInputDialog(null, "Nombre del cliente o fin para finalizar");
                // Repetitiva por cliente
                while (!nombre.equalsIgnoreCase("fin"))
                {
                        
                        // Repetitiva por cuenta
                         do
                         {
                            cuenta()// Pedir y validar los datos de entrada
                              ; // generar la línea de pedido y guardar en totales.
                         }
                         while(JOptionPane.showConfirmDialog(null, "¿ Tienes más cuentas?")==0);

                         // Calculo totales e imprimo factura
                         // Siguiente cliente
                         nombre =JOptionPane.showInputDialog(null, "Nombre del cliente o fin para finalizar");
                }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
        }
    }

    private static void cuenta() {
        
        datoscuenta();
        
        
    }

    private static void datoscuenta() {
              
        boolean correcto;
        do
        {
                    try{
                    
                        numerocuenta = 
                        
                        throw new CuentaNoValida();
                        correcto = true;
                        throw new SaldoInicial();
                        correcto = true;
                    }
                    catch(NullPointerException e)
                    {
                        JOptionPane.showMessageDialog(null,"No se puede salir");
                        correcto = false;
                    }
                    catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null,"Es necesario un dato numérico");
                        correcto = false;
                    }
                    catch(CuentaNoValida | SaldoInicial e)
                    {
                        JOptionPane.showMessageDialog(null,"numero cuenta no valido");
                        correcto = false;
                    }
                    
        }
        while (!correcto);

    }
    }
    

