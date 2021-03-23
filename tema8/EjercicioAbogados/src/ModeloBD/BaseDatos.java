/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.*;

/**
 *
 * @author 1gdaw03
 */
public class BaseDatos {
    
    private static Connection con;
    
    public BaseDatos(){
    }
    
    public static void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/"+"ejercicioabogados";
            con = DriverManager.getConnection(url, "root", "usbw");
            
            if (con==null){
                throw new Exception ("Problemas con la conexion");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void desconectar(){
        try{
            con.close();
        }
        catch(Exception e){
            System.out.println("Problemas al cerrar la conexion");
        }
        
    }
    
    public static Connection getCon(){
        
        return con;
    
    }
    
}
