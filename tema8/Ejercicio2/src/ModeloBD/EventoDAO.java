/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author 1gdaw03
 */
public class EventoDAO {
    
    private static Evento evento;
    
    private static PreparedStatement preparado;
    private static String plantilla;
    private static ResultSet resultado;
    
    public static void nuevo(Evento ev) throws Exception{
        BaseDatos.conectar();
        
        plantilla = "INSERT INTO eventos (nombre, lugar, fecha,horaInicio, horaFin, aforo) VALUES (?,?,?,?,?,?)";
            preparado = BaseDatos.getCon().prepareStatement(plantilla);
            preparado.setString(1,ev.getNombre());
            preparado.setString(2,ev.getLugar());
            preparado.setDate(3, conversionDate(ev.getFecha()));
            preparado.setTime(4, conversionTime(ev.getHoraInicio()));
            preparado.setTime(5, conversionTime(ev.getHoraFin()));
            preparado.setInt(6,ev.getAforo());
            
            int n = preparado.executeUpdate();
            System.out.println( n + "filas insertadas");
    }
    
    public static java.sql.Date conversionDate(LocalDate fecha)
    {
        // Conversion LocalDate en java.sql.Date
        return java.sql.Date.valueOf(fecha);
        
    }
    
    public static java.sql.Time conversionTime(LocalTime hora)
    {
         // Conversion LocalTime en java.sql.Time
        return java.sql.Time.valueOf(hora);
    }
    
    public static void crearObjeto() throws Exception
    {
        evento = new Evento();
        evento.setNombre(resultado.getString("nombre"));
        evento.setLugar(resultado.getString("lugar"));
        evento.setFecha(resultado.getDate("fecha").toLocalDate());             
        evento.setHoraInicio(resultado.getTime("horaInicio").toLocalTime());      
        evento.setHoraFin(resultado.getTime("horaFin").toLocalTime());
        evento.setAforo(resultado.getInt("aforo"));
    }
    
}
