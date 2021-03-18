/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import ModeloUML.*;
import ModeloBD.*;
import Vista.*;
import java.time.*;

/**
 *
 * @author 1gdaw03
 */
public class Controlador {

    private static Evento evento;
    private static VMenu vm; 
    private static VGuardar vg;
    private static VBorrar vb;
    //private static VModificar vmod;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        vm = new VMenu();
        vm.setVisible(true);
        
    }

    public static void Guardar() {
        
        vg = new VGuardar();
        vg.setVisible(true);
        
    }
    
    public static void volver(javax.swing.JDialog v) {
        v.dispose();
    }

    public static void Borrar() {

        vb = new VBorrar();
        vb.setVisible(true);    
    }

    public static void guardarevento(String nombre, String lugar, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Integer Aforo) throws Exception{
        evento = new Evento(nombre,lugar, fecha,horaInicio,horaFin,Aforo);
        EventoDAO.nuevo(evento);
    }

    public static void salir() {
        System.exit(0);
    }
    
}
