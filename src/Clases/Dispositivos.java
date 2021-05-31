package Clases;

import java.io.Serializable;


/**
 *
 * @author oscar
 */
public final class Dispositivos implements Serializable {

    public String numero="----", correoElectronico, Nombre, tipo, conexion ="Sin Conexiones";
    public String visible="false", encendido = "true";
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public Dispositivos(){
    
    }
  
    
    public Dispositivos( String correoElectronico, String Nombre, String tipo, String visible,String encendido, String numero) {
  
    this.correoElectronico = correoElectronico;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.conexion = conexion;
        this.visible = visible;
        this.encendido = encendido;
        this.numero = numero;
    }

    public Dispositivos(String correoElectronico, String Nombre, String tipo, String visible, String encendido) {
       
        this.correoElectronico = correoElectronico;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.visible = visible;
        this.encendido = encendido;

    }

    public Dispositivos( String tipo, String conexion, String Nombre, String encendido) {
        
        this.tipo = tipo;
        this.conexion = conexion;
        this.Nombre = Nombre;
        this.encendido = encendido;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String isVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String isEncendido() {
        return encendido;
    }

    public void setEncendido(String encendido) {
        this.encendido = encendido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dispositivos {correoElectronico =" + this.correoElectronico + ", nombre=" + this.Nombre
                + ", tipo= " + this.tipo + ", conexion=" + this.conexion + ", visible=" + this.visible + ", encendido =" + this.encendido
                + ", numero= " + this.numero + "}";
    }

}
