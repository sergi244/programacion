/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3p4e1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T3P4e1 {
public static int resultado;
public static int precio;
public static int cantidad;
public static String factura;
public static int iva;
public static int ivaporcentaje;
public static int resultadofinal;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        factura = "Nombre: " + nombre + "\n";
        factura += "Lineas de detalle \n";
        String respuesta;
        do{
          funcionproducto();
          funcionpreciosinIVA();
          funcionprecioIVA();  
          respuesta = JOptionPane.showInputDialog("¿Quiere continuar?");
        }
        while(respuesta.equalsIgnoreCase("si"));
        
        JOptionPane.showMessageDialog(null, factura);
    }

    public static void funcionproducto() {
        
        
        String producto = JOptionPane.showInputDialog("Nombre del producto");
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos has llevado?"));
        precio = Integer.parseInt(JOptionPane.showInputDialog("Precio unidad"));
        
                
        
    }

    public static int funcionpreciosinIVA() {
        
        resultado = cantidad * precio;
        factura += cantidad + "x" + precio + "=" + resultado + "\n";
        return resultado;
        
    }

    public static int funcionprecioIVA() {
        
        iva = 0;
        ivaporcentaje = 0;
        
        iva = Integer.parseInt(JOptionPane.showInputDialog("Elige el iva \n" + "1.- normal21% \n" + "2.- reducido 10% \n" + "3.- supereducido 4% \n"));
        if(iva==1){
            ivaporcentaje = (int) 0.21;
        }
        else{
            if (iva==2){
                ivaporcentaje = (int) 0.10;
            }
            else {
               if(iva==3){
                   ivaporcentaje = (int) 0.04;
               }
            }
        }
        resultadofinal = resultado * ivaporcentaje;
        JOptionPane.showMessageDialog(null, resultadofinal);
        return resultadofinal;
    }

    
    
}
