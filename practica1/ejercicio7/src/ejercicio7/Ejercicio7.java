package ejercicio7;
import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String[] args) {
        int calificacion;
        calificacion = Integer.parseInt(JOptionPane.showInputDialog("teclea nota"));
        if (calificacion>10 || calificacion<0) {
            System.out.println("numero erroneo");
        }
        else {
            if (calificacion>=0 && calificacion<5){
                System.out.println("suspendido");
            }
            else {
                System.out.println("aprobado");
            }
        }     
      }
}
