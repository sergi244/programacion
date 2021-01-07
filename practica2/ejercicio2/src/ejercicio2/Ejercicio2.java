package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Variables locales
        String nombreAlumno;
        String visual,cobol,java,sql;
        int respuesta=0;
        do
        {
            nombreAlumno = JOptionPane.showInputDialog("Teclear el nombre del alumno: ");
            // cuatro llamadas a la misma función. Reutilización de código
            sql = solicitarNota("sql");
            cobol = solicitarNota("cobol");
            java = solicitarNota("java");
            visual = solicitarNota("visual");
              
            String nota = proceso(visual,cobol,java,sql);
                 
            JOptionPane.showMessageDialog(null,"La calificación de "+ nombreAlumno + " es de " + nota );
                 
            respuesta = JOptionPane.showConfirmDialog(null, "Si quieres continuar haz click en el botón aceptar");
             
        }
        while(respuesta == 0);
        
    }
    
    public static String proceso(String visual,String cobol, String java, String sql)
    {
       
        if (cobol.compareToIgnoreCase("apto")==0 && sql.compareToIgnoreCase("apto")==0)
        {
            // Sobresaliente, notable o bien
            if (visual.compareToIgnoreCase("apto")==0 && java.compareToIgnoreCase("apto")==0)
                return "Sobresaliente";
                 // else no me hace falta por el return
            if (visual.compareToIgnoreCase("apto")==0 || java.compareToIgnoreCase("apto")==0)
                return "Notable";
            return "Bien";
        }
        else
        {
            // suficiente o insuficiente
            if(sql.compareToIgnoreCase("apto")==0 || cobol.compareToIgnoreCase("apto")==0)
            {
                // ¿ Alguna de las otras?
                if(java.compareToIgnoreCase("apto")==0 || visual.compareToIgnoreCase("apto")==0)
                    return "Suficiente";
                return "Insuficiente";
            }
            else
                // ninguna de las dos
                return "Insuficiente";                       
        }
    }             
    
    public static String solicitarNota(String nombreAsignatura){
        boolean correcto;
        String nota="";
        do
        {
            nota = JOptionPane.showInputDialog("Introduzca si la calificacion de " + nombreAsignatura + " es apto o no apto");
            if(!nota.equalsIgnoreCase("apto") && !nota.equalsIgnoreCase("no apto"))
                correcto = false;
            else
                correcto = true;
            /* Redundante
               correcto = !(!nota.equalsIgnoreCase("apto") && !nota.equalsIgnoreCase("no apto"));
            */
        }
        while(!correcto);
        return nota;
    }
}
