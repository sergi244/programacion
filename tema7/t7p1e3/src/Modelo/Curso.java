/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw03
 */
public class Curso {
    
    private ArrayList<Alumno>ListaAlumnos;
    private String Codigo;

    public Curso(String Codigo) {
        this.Codigo = Codigo;
    }

    public Curso() {
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return ListaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> ListaAlumnos) {
        this.ListaAlumnos = ListaAlumnos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
    
}
