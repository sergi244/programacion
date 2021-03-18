
package ModeloBD;

import java.sql.*;



public class BaseDatos {  
    
    private Connection con;
    
    public BaseDatos(){
}

    public void conectar(){
        try {
            //Identificacion driver
            Class.forName("mysql.jdbc");
            //obtencion conexion base de datos
            String bd = "ejercicio1";
            String url = "jdbc:mysql://localhost:3307/" + bd;
            String user = "root";
            String password = "usbw";
            con = DriverManager.getConnection(url, user, password);
            
                if(con==null){
                    throw new Exception ("Problemas en la conexion");
                }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}
    
    public void desconectar(){
        try {
            
            con.close();
            
        } 
        
        catch (Exception e) {
            System.out.println("problemas al cerrar la conexion");
        }
}

    public Connection getcon(){
        
        return con;
        
    }
}
