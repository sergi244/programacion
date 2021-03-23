/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

/**
 *
 * @author 1gdaw03
 */
public class Cliente extends Persona{
    
    private String Telefono;
    private String email;

    public Cliente(String Telefono, String email, String DNI, String Nombre, String Apellidos, String Direccion) {
        super(DNI, Nombre, Apellidos, Direccion);
        this.Telefono = Telefono;
        this.email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
