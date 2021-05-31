
package Clases;


/**
 *
 * @author oscar
 */
public class Nodo {
    private Nodo siguiente;
    Dispositivos dispositivo;
    
    public Nodo(){
    
    }
    
    public Nodo(Dispositivos dispositivo, Nodo siguiente) {
        this.dispositivo = dispositivo;
        this.siguiente = siguiente;
    }

    public Dispositivos getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivos dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}


