package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
       char opc;
       do
       {
            opc = mostrarMenu();
            switch(opc){
                case '1':
                       funcionSumar();
                       break;
                case '2':
                       funcionRestar();
                       break;
                case '3':
                       funcionTabla();
                       break;
                case '4':
                       funcionDivision();
                       break;
            }
       }
       while(opc != '5');
    }
    
    public static char mostrarMenu()
    {
        char opc;
        do
        {
            opc =  JOptionPane.showInputDialog("1.- Sumar dos numeros \n"
                + "2.- Restar dos numeros \n"
                + "3.- Visualizar la tabla de multiplicar de un número \n"
                + "4.- Visualizar el cociente y el resto de una división \n"
                + "5.- Salir del programa\n\n"
                + "Elige una opción").charAt(0);
        }
        while(opc < '1' || opc > '5');
        return opc;
                
    }
    
    public static int solicitarNumero()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
    }
    
    public static void funcionSumar()
    {
        int n1 = solicitarNumero();
        int n2 = solicitarNumero();
        JOptionPane.showMessageDialog(null," El resultado de la suma es: " + (n1 + n2));
    }
    
    public static void funcionRestar()
    {
        int n1 = solicitarNumero();
        int n2 = solicitarNumero();
        JOptionPane.showMessageDialog(null," El resultado de la resta es: " + (n1 - n2));
    }
    
    public static void funcionTabla()
    {
        String tabla="";
        int nro = solicitarNumero();
        for (int x = 0; x < 11; x++)
            tabla = tabla + nro + " x " + x + " = " + (nro * x) + "\n";
        JOptionPane.showMessageDialog(null, tabla);
    }
    
    public static void funcionDivision()
    {
        // Teclear datos de entrada tal que el resultado sea un entero.
        int n1 = solicitarNumero();
        int n2 = solicitarNumero();
        JOptionPane.showMessageDialog(null," El cociente es " + (n1 / n2) + " y el resto " + (n1 % n2));
    }
    
}

