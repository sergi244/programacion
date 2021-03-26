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
    private String Email;

    public Cliente(String DNI, String Nombre, String Apellidos, String Direccion, String Telefono, String Email) {
        super(DNI, Nombre, Apellidos, Direccion);
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public Cliente() {
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    
}
