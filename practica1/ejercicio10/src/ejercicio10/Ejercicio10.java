package ejercicio10;
import javax.swing.JOptionPane;
public class Ejercicio10 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "tecla numeros para el ejercicio") ;
        int n1;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("teclea primer numero"));
        int n2;
        n2 = Integer.parseInt(JOptionPane.showInputDialog("teclea segundo numero"));
        int n3;
        n3 = Integer.parseInt(JOptionPane.showInputDialog("teclea tercer numero"));

        if (n1>n2 && n1>n3) {
            System.out.println(n1 + " es el mayor");
        if (n2>n3){
            System.out.println(n3 + " es el mas pequeño");
        }
            else {
            System.out.println(n2 + " es el mas pequeño");
        }        
        } 
        if (n2>n1 && n2>n3) {
            System.out.println(n2 + " es el mayor");
        if (n1>n3){
            System.out.println(n3 + " es el mas pequeño");
        }
        else {
            System.out.println(n1 + " es el mas pequeño");
        }
        }  
        if (n3>n1 && n3>n2) {
            System.out.println(n3 + " es el mayor");
        if (n1>n2){
            System.out.println(n2 + " es el mas pequeño");
        }
        else {
            System.out.println(n1 + " es el mas pequeño");
        }
        } 
            }
        }     


