/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 1gdaw03
 */
public class AbogadoDAO {
    
    private static Abogado abogado;
    
    private static PreparedStatement preparado;
    private static String plantilla;
    private static ResultSet resultado;
    
     public static void nuevo(Abogado ab) throws Exception{
        BaseDatos.conectar();
        
        plantilla = "INSERT INTO abogado VALUES (?,?,?,?)";
            preparado = BaseDatos.getCon().prepareStatement(plantilla);
            preparado.setString(1,ab.getDNI());
            preparado.setString(2,ab.getNombre());
            preparado.setString(3, ab.getApellidos());
            preparado.setString(4, ab.getDireccion());
            
            int n = preparado.executeUpdate();
            System.out.println( n + " filas insertadas");
    }
    
    public static void crearObjeto() throws Exception
    {
        abogado = new Abogado();
        abogado.setDNI(resultado.getString("DNI"));
        abogado.setNombre(resultado.getString("nombre"));
        abogado.setApellidos(resultado.getString("Apellidos"));             
        abogado.setDireccion(resultado.getString("Direccion"));      

    }
}
