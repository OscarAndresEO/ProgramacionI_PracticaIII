/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author oscar
 */
public class NodoUs {
        private NodoUs siguiente;
        Usuario usuario;
    Dispositivos dispositivo;
    
    public NodoUs(){
    
    }
    
    public NodoUs(Usuario usuario, NodoUs siguiente) {
        this.usuario = usuario;
        this.siguiente = siguiente;
    }

    public Dispositivos getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoUs getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUs siguiente) {
        this.siguiente = siguiente;
    }
}
