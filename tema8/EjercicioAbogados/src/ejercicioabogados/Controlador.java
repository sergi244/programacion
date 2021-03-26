/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioabogados;

import ModeloUML.*;
import ModeloBD.*;
import Vista.*;
import VistaCliente.*;
import VistaAbogado.*;

/**
 *
 * @author 1gdaw03
 */

public class Controlador {

    private static Cliente cliente;
    private static Abogado abogado;
    
    private static VPrincipal vp;
    private static VAltaCliente vac;
    private static VAltaAbogado vaa;
    private static VBajaCliente vbc;
    private static VBajaAbogado vba;
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        vp = new VPrincipal();
        vp.setVisible(true);
    }
    
    public static void AltaCliente() {
        vac = new VAltaCliente();
        vac.setVisible(true);
    }
    
    public static void AltaAbogado() {
        vaa = new VAltaAbogado();
        vaa.setVisible(true);
    }
    
    public static void BajaCliente() {
        vbc = new VBajaCliente();
        vbc.setVisible(true);
    }

    public static void BajaAbogado() {
        vba = new VBajaAbogado();
        vba.setVisible(true);
    }
    
    public static void guardarcliente(String DNI, String Nombre, String Apellidos, String Direccion, String Telefono, String Email) throws Exception{
        cliente = new Cliente(DNI, Nombre, Apellidos, Direccion, Telefono, Email);
        ClienteDAO.nuevo(cliente);
    }
    
    public static void guardarabogado(String DNI, String Nombre, String Apellidos, String Direccion) throws Exception{
        abogado = new Abogado(DNI, Nombre, Apellidos, Direccion);
        AbogadoDAO.nuevo(abogado);
    }
    
    public static void volver(javax.swing.JDialog v) {
        v.dispose();
    }
    
    public static void Salir() {
        System.exit(0);
    }

}
