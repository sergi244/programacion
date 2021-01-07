/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3p4e2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class T3P4e2 {
public static String respuesta;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
              
       char menu;
       do
       {
            menu = mostrarMenu();
            switch(menu){
                case 'a':
                       funcionedad();
                       break;
                case 'b':
                       funcionparesprimos();
                       break;
                case 'c':
                       funcionpalindromos();
                       break;
            }
       }
       while(menu != 'd');
    }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "problemas: " + e.getMessage());
        }
    }
    
    public static char mostrarMenu() throws Exception {
        char menu;
        do
        {
            menu =  JOptionPane.showInputDialog("a) Calcular edad de una persona \n"
                + "b) Numeros pares y primos \n"
                + "c) Palindromo \n"
                + "d) salir \n").charAt(0);
        }
        while(menu < 'a' || menu > 'd');
        return menu;
    }

    private static void funcionedad() throws Exception {
        try{
            do{
            JOptionPane.showMessageDialog(null, "teclea fecha de nacimiento");
            int dia = Integer.parseInt(JOptionPane.showInputDialog("teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("teclea el mes en numero"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("teclea el año"));
            LocalDate nacimiento = LocalDate.of(ano,mes,dia);
            LocalDate actual = LocalDate.now();
            Period entre = Period.between(nacimiento, actual);
            JOptionPane.showMessageDialog(null, "Han transcurrido " + entre.getYears () +
                                                " años y " + entre.getMonths () + 
                                                " meses y " + entre.getDays () + " dias.");
            
            respuesta = JOptionPane.showInputDialog("¿Quieres calcular otra edad y tiempo hasta cumpleaños?");
            }   
        while (respuesta.equalsIgnoreCase("si"));
        }
        catch(DateTimeException e)
        {
            JOptionPane.showMessageDialog(null,"error " + e.getClass());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"en numero " + e.getClass());
        }
    }

    private static void funcionparesprimos() throws Exception {
        try{
        do{
        int numero = Integer.parseInt(JOptionPane.showInputDialog("teclea un numero"));
        
        respuesta = JOptionPane.showInputDialog("¿Quieres continuar?");
        }
        while (respuesta.equalsIgnoreCase("si"));
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"escriba un numero " + e.getClass()); 
        }
    }

    private static void funcionpalindromos() throws Exception {
        do{
            Scanner teclado = new Scanner(System.in);
            String nuevo;
            palindromo2 objclass=new palindromo2();
            JOptionPane.showMessageDialog(null, "Ingresa la palabra");
            nuevo = JOptionPane.showInputDialog("palabra a comprobar");
            if(objclass.espalindromo(nuevo)){
                JOptionPane.showMessageDialog(null, "Palindromo");
            }
            else {
                JOptionPane.showMessageDialog(null, "No Palindromo");
            }
            respuesta = JOptionPane.showInputDialog("¿Tienes otra palabra a comprobar?");
        }
        while (respuesta.equalsIgnoreCase("si"));
    }
    
}
    