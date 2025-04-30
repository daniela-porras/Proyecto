 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.models;

/**
 *
 * @author usuario1
 */
public class Ganadero 
{
    private String cedula;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    
    public Ganadero(String _cedula,String _nombre,String _direc,String _email,String _tel)
    {
        this.cedula=_cedula;
        this.nombre=_nombre;
        this.direccion=_direc;
        this.email=_email;
        this.telefono=_tel;
    };

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
          
}
