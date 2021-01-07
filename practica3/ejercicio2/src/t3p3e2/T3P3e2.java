package t3p3e2;

import javax.swing.JOptionPane;

public class T3P3e2 {

    public static void main(String[] args) {

        String cadena=JOptionPane.showInputDialog("mensaje");
        invertircadena(cadena);
    }

    public static void invertircadena(String cadena) {
        String cadenainvertida="";
        for(int y = cadena.length()-1; y >= 0; y--)
        {
            cadenainvertida=cadenainvertida + cadena.charAt(y);
        }
        JOptionPane.showMessageDialog(null, "La cadena invertida es " + cadenainvertida);
    }


    
}
