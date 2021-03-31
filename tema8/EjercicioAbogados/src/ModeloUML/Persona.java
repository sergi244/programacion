/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw03
 */
public class Persona {
    
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private ArrayList<Caso> listaCasos;

    public Persona() {
    }

    public Persona(String DNI, String Nombre, String Apellidos, String Direccion) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.listaCasos = new ArrayList();
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

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Caso> getListaCasos() {
        return listaCasos;
    }

    public void setCaso(Caso c){
        if (listaCasos == null)
            listaCasos = new ArrayList();
        this.listaCasos.add(c);
    }
    
    public void setListaCasos(ArrayList<Caso> listaCasos) {
        this.listaCasos = listaCasos;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Direccion=" + Direccion + ", listaCasos=" + listaCasos + '}';
    }
    
    
}
