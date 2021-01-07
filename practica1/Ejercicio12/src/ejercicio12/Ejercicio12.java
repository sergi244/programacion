package ejercicio12;
import javax.swing.JOptionPane;
public class Ejercicio12 {
    public static void main(String[] args) {
        int x = 0;
        int contadorchicas = 0;
        int contadorchicos = 0;
        while (x < 30){
            String nombre = JOptionPane.showInputDialog("dime nombre del alumno");
            String sexo = JOptionPane.showInputDialog("dime su sexo").toLowerCase();
            int edad = Integer.parseInt(JOptionPane.showInputDialog("dime su edad"));
            int peso = Integer.parseInt(JOptionPane.showInputDialog("dime su peso"));
            double estatura = Double.parseDouble(JOptionPane.showInputDialog("dime la estatura del alumno")) ;
            if(sexo.equals("femenino")){
                if(estatura>1.6 && peso>60)
                    contadorchicas++;
            }
            else{
                if(estatura>1.7 && peso>70)
                    contadorchicos++;
            }
            x++;
        }
        System.out.println(contadorchicos);
        System.out.println(contadorchicas);
    }
}
