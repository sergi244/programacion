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
public class ClienteDAO {
    
    private static Cliente cliente;
    
    private static PreparedStatement preparado;
    private static String plantilla;
    private static ResultSet resultado;
    
    public static void nuevo(Cliente cl) throws Exception{
        BaseDatos.conectar();
        
        plantilla = "INSERT INTO cliente VALUES (?,?,?,?,?,?)";
            preparado = BaseDatos.getCon().prepareStatement(plantilla);
            preparado.setString(1, cl.getDNI());
            preparado.setString(2, cl.getNombre());
            preparado.setString(3, cl.getApellidos());
            preparado.setString(4, cl.getDireccion());
            preparado.setString(5, cl.getTelefono());
            preparado.setString(6, cl.getEmail());
            
            int n = preparado.executeUpdate();
            System.out.println( n + " filas insertadas");
    }
    
    public static void borrar(Cliente cl) throws Exception{
        BaseDatos.conectar();
        
        plantilla = "DELETE FROM cliente WHERE DNI = ?";
            preparado = BaseDatos.getCon().prepareStatement(plantilla);
            preparado.setString(1, cl.getDNI());
                       
            int n = preparado.executeUpdate();
            System.out.println( n + " filas eliminadas");
    }
    
     public static Cliente consultar(Cliente cl) throws Exception{
        // Método que consultar un acontecimiento de la base de datos
        BaseDatos.conectar();
        
        plantilla = "select *  from acontecimientos where DNI = ?";
        preparado = BaseDatos.getCon().prepareStatement(plantilla);
        preparado.setString(1,cl.getDNI());
            
        resultado = preparado.executeQuery();
        if (resultado.next())
        {
            crearObjeto();
            BaseDatos.desconectar();
        }
        else
        {
            BaseDatos.desconectar();
            throw new Exception("Cliente no encontrado");
        }
        
        return cliente;
    }
    
    public static void crearObjeto() throws Exception
    {
        cliente = new Cliente();
        cliente.setDNI(resultado.getString("DNI"));
        cliente.setNombre(resultado.getString("nombre"));
        cliente.setApellidos(resultado.getString("Apellidos"));             
        cliente.setDireccion(resultado.getString("Direccion"));      
        cliente.setTelefono(resultado.getString("Telefono"));
        cliente.setEmail(resultado.getString("Email"));
    }
}
