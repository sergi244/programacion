package ejercicio18;
import javax.swing.JOptionPane;
public class Ejercicio18 {
    public static void main(String[] args) {
        int primerimpar = 1;
        int suma = 0;
        int numero =Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        for(int contador = 0; contador < numero; contador++){
            suma = suma + primerimpar;
            primerimpar = primerimpar + 2;            
        }
        System.out.println("el cuadrado de "+ numero+" es "+ suma);
    }
    
}
