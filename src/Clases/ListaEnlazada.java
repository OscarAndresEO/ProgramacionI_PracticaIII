package Clases;

/**
 *
 * @author oscar
 */
public class ListaEnlazada {

    public Nodo head = null;
    public Nodo tail = null;
    public int size = 0;

    public int tamanio() {
        return this.size;
    }

    public boolean estaVacia() {
        return this.size == 0;
    }

    public Dispositivos primero() {
        if (estaVacia()) {
            return null;
        }
        return head.getDispositivo();
    }

    public Dispositivos ultimo() {
        if (estaVacia()) {
            return null;
        }
        return tail.getDispositivo();

    }

    public void insertarInicio(Dispositivos dispositivo) {
        Nodo actual = new Nodo(dispositivo, null);
        actual.setSiguiente(head);
        head = actual;

        if (this.size == 0) {
            this.tail = this.head;
        }
        this.size++;
    }

    public void insertarFinal(Dispositivos dispositivo) {
        Nodo nuevo = new Nodo(dispositivo, null);
        if (estaVacia()) {
            this.head = nuevo;
        } else {
            tail.setSiguiente(nuevo);

        }
        this.tail = nuevo;
        this.size++;
    }

    public Dispositivos eliminarPrimero() {
        if (estaVacia()) {
            return null;
        }
        Dispositivos dispositivo = head.getDispositivo();
        this.head = this.head.getSiguiente();
        this.size--;

        if (this.size == 0) {
            this.tail = null;

        }
        return dispositivo;
    }

    public Dispositivos buscarNodo(String dato) {
        Nodo temporal = head;
        while (temporal == null) {
            if (dato.equals(temporal.getDispositivo().getId())) {
                return temporal.getDispositivo();
            }
            temporal.setSiguiente(temporal);
        }
        return null;
    }
    //USUARIOS

    public NodoUs headU = null;
    public NodoUs tailU = null;
    public int sizeU = 0;

    public boolean estaVaciaU() {
        return this.sizeU == 0;
    }

    public void insertarFinal(Usuario usuario) {
        NodoUs nuevo = new NodoUs(usuario, null);
        if (estaVaciaU()) {
            this.headU = nuevo;
        } else {
            tailU.setSiguiente(nuevo);

        }
        this.tailU = nuevo;
        this.sizeU++;
    }

}
