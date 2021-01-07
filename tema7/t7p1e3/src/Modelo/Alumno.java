/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 1gdaw03
 */
public class Alumno {
    
    private String DNI;
    private String Nombre;
    private String Apellido;
    private Curso codigo;

    public Alumno(String DNI, String Nombre, String Apellido) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public Alumno(String DNI, String Nombre, String Apellido, Curso codigo) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.codigo = codigo;
    }

    public Alumno() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Curso getCodigo() {
        return codigo;
    }

    public void setCodigo(Curso codigo) {
        this.codigo = codigo;
    }

    
        
}
