/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5p1e1;

import Excepciones.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author 1gdaw03
 */
public class T5p1e1 {
private static ArrayList <Double> listas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            listas = new ArrayList();
            llenar();
            
            int opcion=0;
            boolean rellena = false;
            while(opcion != 10)
            {
                opcion=mostrarMenu();
                switch(opcion)
                {
                    case 1:
                           f1();
                        break;
                    case 2:
                           f2();
                        break;
                    case 3:
                           f3();
                        break;
                    case 4:
                           f4();
                        break;
                    case 5:
                           f5();
                        break;
                    case 6:
                           f6();
                        break;
                    case 7:
                           f7();
                        break;
                    case 8:
                           f8();
                        break;
                    case 9:
                           f9();
                        break;
                    case 10:
                           JOptionPane.showMessageDialog(null,"Adios");
                        break;
                        
                    default:
                        throw new NumeroNoValido();
                    
            }
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Problemas no identificados " + e.getMessage());
    }
        
    }

    public static int mostrarMenu() throws Exception{
        int opcion=0;
        boolean correcto;
        do
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1.- Visualizar el valor maximo y el minimo \n" +
                                            "2.- Solicitar un numero y buscarlo \n" +
                                            "3.- Solicitar un numero, buscarlo y borrarlo \n" +
                                            "4.- Convertir el arrayList en un array \n" +
                                            "5.- Si no esta vacio, mostrar el numero de elementos que contiene \n" +
                                            "6.- Insertar un nuevo elemento por el final \n" +
                                            "7.- Insertar un nuevo elemento en la posicion que te indique el usuario. \n" +
                                            "8.- . Borrar un elemento de una posicion concreta. \n" +
                                            "9.- Calcular la suma y la media aritmetica de los valores contenidos. \n" +
                                            "10.- Finalizar"));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "La opción tiene que ser un número");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "10.- finalizar");
                correcto = false;
            }
        }
        while(!correcto);
        return opcion;
    }

    private static void llenar() throws Exception{
        String respuesta;
        do
        {
          listas.add(pedirnumeros());
          respuesta = JOptionPane.showInputDialog("¿Quiere continuar escribiendo numeros?");
        }
        while(respuesta.equalsIgnoreCase("si"));
        
    }

    private static Double pedirnumeros() throws Exception{
       Double numeros = null;
       boolean correcto;
        do
        {
            try
            {
                numeros = Double.parseDouble(JOptionPane.showInputDialog("Teclee un numero"));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Escriba un numero");
                correcto = false;
            }
        }
        while(!correcto);        
       return numeros;
    }

    private static void f1() throws Exception{
        double maximo = listas.get(0);
        int posicionmaximo = 0;
        double minimo = listas.get(0);
        int posicionminimo = 0;
        
        for(int x=1; x<listas.size(); x++)
        {
            if(listas.get(x)>maximo){
                maximo = listas.get(x);
                posicionmaximo = x;
            }
            else
                if(listas.get(x)<x)
                    minimo = listas.get(x);
                    posicionminimo = x;
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + Collections.max(listas));
        JOptionPane.showMessageDialog(null, "El numero menor es: " + Collections.min(listas));
        }
    }

    private static void f2() throws Exception{
         try
            {
                Double numero = pedirnumeros();
                if(listas.contains(numero))
                    JOptionPane.showMessageDialog(null,"El numero se encuentra en la posicion " + listas.indexOf(numero));
                else
                    JOptionPane.showMessageDialog(null, "El numero indicado no se encuentra");
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Escriba un numero");
            }
    }

    private static void f3() throws Exception{
        Double numero = pedirnumeros();
        
        if(listas.remove(numero))
            JOptionPane.showMessageDialog(null, "El numero ha sido borrado.");
        else
            JOptionPane.showMessageDialog(null, "El numero no se encuentra.");
    }

    private static void f4() throws Exception{
        Double[] array;
        array = new Double[listas.size()];
    }

    private static void f5() throws Exception{
        if(!listas.isEmpty())
            JOptionPane.showMessageDialog(null,"Este es el numero de elementos que contiene el array: " + listas.size());
    }
    
    private static void f6() throws Exception{
        try
            {
                double num = Double.parseDouble(JOptionPane.showInputDialog("Escriba numero que quiera agregar"));
                listas.add(num);
                JOptionPane.showMessageDialog(null,"Este es el numero de elementos que contiene el array: " + listas.size());
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Escriba un numero");
            }
        
        
    }

    private static void f7() throws Exception{
            try
                {
                    double num = Double.parseDouble(JOptionPane.showInputDialog("Escriba numero que quiera agregar"));
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Escriba la posicion en la que quiera agregar el numero"));
                    listas.add(pos,num);
                    JOptionPane.showMessageDialog(null,"Este es el numero de elementos que contiene el array: " + listas.size());
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null,"Escriba un numero");
                }   
    }

    private static void f8() throws Exception{
        try
        {
            int pos = Integer.parseInt(JOptionPane.showInputDialog("Escriba la posicion en la que quiera agregar el numero"));
                listas.remove(pos);
                JOptionPane.showMessageDialog(null,"Este es el numero de elementos que contiene el array: " + listas.size());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Escriba un numero");
        }   
    }

    private static void f9() throws Exception{
        double suma = 0;
        Iterator<Double> iterator = listas.iterator();
        while(iterator.hasNext())
        {
            suma+=iterator.next();
        }
        JOptionPane.showMessageDialog(null,"La suma es igual a: " + suma + " y la media es: " + (suma/listas.size()));
    }

}
