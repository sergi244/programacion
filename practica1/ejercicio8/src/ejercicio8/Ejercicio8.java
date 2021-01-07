package ejercicio8;
import javax.swing.JOptionPane;
public class Ejercicio8 {
    public static void main(String[] args) {
        int calificacion;
        calificacion = Integer.parseInt(JOptionPane.showInputDialog("teclea nota"));
        if (calificacion>10 || calificacion<0) {
            System.out.println("numero erroneo");
        }
        else {
            if (calificacion>=0 && calificacion<4){
                System.out.println("muy deficiente");
            }
            else {
                if (calificacion>=4 && calificacion <5){
                    System.out.println("insuficiente");
                }
                    else {
                if (calificacion>=5 && calificacion<6){
                    System.out.println("suficiente");
                    }
                    else {
                if (calificacion>=6 && calificacion<7){
                    System.out.println("bien");
                    }
                    else {
                if (calificacion>=7 && calificacion<9){
                    System.out.println("notable");
                    }
                    else {
                    if (calificacion>=9 && calificacion<=10){
                    System.out.println("sobresaliente");
                    }
                 }
                 }
                }     
            }
        }
    }
    }
}