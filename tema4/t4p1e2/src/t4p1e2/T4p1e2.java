
package t4p1e2;

import javax.swing.JOptionPane;

/*
Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, 
al ﬁnal muestra por pantalla el valor de cada posición y la suma de todos los valores
*/

public class T4p1e2 {

    //private static int[] numeros; // Declaración como global

    public static void main(String[] args) {
       try
       {
          int[] numeros=new int[Integer.parseInt(JOptionPane.showInputDialog("Indica el número de elementos"))]; // Creación
          llenado(numeros);
          mostrar(numeros);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
       }
    }
    
    public static void llenado(int[] numeros) throws Exception
    {
       for(int x=0; x < numeros.length; x++)
       {
            numeros[x] = (int) (Math.random() * 10);
       }
    }
    
    public static void mostrar(int[] numeros) throws Exception
    {
        int suma = 0;
        String datos = "";
        for(int x=0; x < numeros.length; x++)
        {
            datos += "Posición: " + x + " contenido: " + numeros[x] + "\n";
            suma += numeros[x];
        }
        JOptionPane.showMessageDialog(null, datos + " La suma asciende a: " + suma);
        
    }
    
}
