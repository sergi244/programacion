package ejercicio9;
import javax.swing.JOptionPane;
public class Ejercicio9 {
    public static void main(String[] args) {
        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog("teclea dia de la semana en numero"));
        switch (dia){
           case 1:
               System.out.println("Lunes");
               break;
            case 2:
               System.out.println("Martes");
               break;
            case 3:
               System.out.println("Miercoles");
               break;
            case 4:
               System.out.println("Jueves");
               break;
            case 5:
               System.out.println("Viernes");
               break;
            case 6:
               System.out.println("Sabado");
               break;
            case 7:
               System.out.println("Domingo");
               break;
            default:
               System.out.println("no existe este dia");
               break;
      }
}
}