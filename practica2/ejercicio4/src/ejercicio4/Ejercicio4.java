package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {


    public static void main(String[] args) {
        String nombre;
                
        do{
            nombre = JOptionPane.showInputDialog("teclea nombre del alumno");
            int media = notamedia();
           JOptionPane.showMessageDialog(null, "nota media del alumno " + nombre + " es " + media);
        }
        while(nombre == "FIN");
    }
    
    public static int notamedia(){
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("introduzca primera nota"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("introduzca segunda nota"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("introduzca tercera nota"));
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("introduzca cuarta nota"));
        int n5 = Integer.parseInt(JOptionPane.showInputDialog("introduzca quinta nota"));
        int n6 = Integer.parseInt(JOptionPane.showInputDialog("introduzca sexta nota"));
        
        int media = (n1+n2+n3+n4+n5+n6)/6;
        
        return media;
    }
    
    
}
