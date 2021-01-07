package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    // Variables globales
    private static byte horasTrabajadas;
    private static String estadoCivil;
    private static char nivelEstudios;
    
    public static void main(String[] args) {
        
        solicitarDatos();
       // float sueldo = calcularSueldo();   
        JOptionPane.showMessageDialog(null, "El sueldo de este trabajador asciende a " + calcularSueldo()); 
    }
         
    public static void solicitarDatos(){
        solicitarHoras();
        solicitarEstadoCivil();
        solicitarEstudios();
    }
    
    public static void solicitarHoras(){
        horasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Teclea el número de horas que ha trabajado"));
    }
    
    public static void solicitarEstadoCivil(){
        // solicito y valido el estado civil.
        do
        {
            estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del trabajador");

            // paso a mayúsculas.
            estadoCivil = estadoCivil.toUpperCase();
        }
        while (!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil .equals("D") && !estadoCivil.equals("V"));

    }
    
    public static void solicitarEstudios(){
        // solicito y valido el nivel de estudios
        do
        {
            nivelEstudios = JOptionPane.showInputDialog("Teclea el nivel de estudios del trabajador").charAt(0);

            nivelEstudios = Character.toUpperCase(nivelEstudios);
        }
        while (nivelEstudios != 'P'  && nivelEstudios != 'M' && nivelEstudios != 'S');
        
    }
     
    public static float calcularSueldo(){
         //Constantes
         final float PRECIOHORANORMAL = 10;
         final float PRECIOHORAEXTRA = 15;
         
        //Operaciones para calcular la nómina
        float sueldo;
        if (horasTrabajadas > 40) // 40 podría ser otra constante
            sueldo = (horasTrabajadas - 40) * PRECIOHORAEXTRA + 40 * PRECIOHORANORMAL;
        else
            sueldo = horasTrabajadas * PRECIOHORANORMAL; 
                
        final float PLUS = 100.0f;
                
        if (nivelEstudios == 'S')
            sueldo = sueldo + PLUS;
        else
            if (estadoCivil.compareTo("S") ==0)
                sueldo += PLUS;
            else
                if (estadoCivil.compareTo("V") ==0 && nivelEstudios == 'P')
                    sueldo += PLUS;
        
        return sueldo;
                
    }
    
    
}
