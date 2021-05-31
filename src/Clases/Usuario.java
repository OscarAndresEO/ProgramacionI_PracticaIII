
package Clases;

/**
 *
 * @author oscar
 */
public class Usuario {
    String id;
    String nombre;
    String correo;
    String apellido;
    String contraseña;

    public Usuario(String id, String nombre, String correo, String apellido, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }

    
    public Usuario(String nombre, String apellido, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
