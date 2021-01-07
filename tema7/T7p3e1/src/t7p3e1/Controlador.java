/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p3e1;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw03
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    
    private static Proveedor[] aProveedores;
    private static Producto[] aProductos;
    private static ArrayList<Cliente> lClientes;
    
    private static VAlmacen v;
    
    private static Producto objetoProducto;
    private static Proveedor objetoProveedor;
    private static Cliente objetoCliente;
    
    private final static int DTOPP = 3;
    private final static int DTOV = 2;

    public static void main(String[] args) {
        crearDatos();

        v = new VAlmacen(true);
        v.setVisible(true);
    }
    
    public static void salir() {
        v.dispose();
        System.exit(0);
    }

    private static void crearDatos() {
        aProveedores = new Proveedor[5];
        aProveedores[0] = new Proveedor();
        aProveedores[0].setNombre("Luisa");
        aProveedores[1] = new Proveedor();
        aProveedores[1].setNombre("Mónica");
        aProveedores[2] = new Proveedor();
        aProveedores[2].setNombre("Inés");
        aProveedores[3] = new Proveedor();
        aProveedores[3].setNombre("Ana");
        aProveedores[4] = new Proveedor();
        aProveedores[4].setNombre("Miren");
        
       //Productos
        aProductos=new Producto[3];
        aProductos[0] = new Producto("Producto uno",10, 257.2f);
        aProductos[1] = new Producto("Producto dos",100, 2f);
        aProductos[2] = new Producto("Producto tres",5, 50f);
        
       // Relación entre productos y proveedores
        aProductos[0].setListaProveedores(aProveedores[1]);
        aProductos[0].setListaProveedores(aProveedores[3]);
        
        aProductos[1].setListaProveedores(aProveedores[4]);
        
        aProductos[2].setListaProveedores(aProveedores[0]);
        aProductos[2].setListaProveedores(aProveedores[4]);
        
        // clientes
        lClientes = new ArrayList();    }

    public static void guardarProveedor(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
