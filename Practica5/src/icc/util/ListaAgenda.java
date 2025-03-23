/* -*- jde -*- */
/* <ListaAgenda.java> */
package icc.util;
import icc.practica5.RegistroAgenda;

/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
*/
public class ListaAgenda { 

    /**
     * Registro almacenado.
    */
    private RegistroAgenda elemento;

    /**
     * Lista siguiente.
    */
    private ListaAgenda siguiente;


    public ListaAgenda(){
        elemento = null;
        siguiente = null;
    }

    /**
    * Construye una lista con un unico elemento.
    * @param elemento: el elemento a almacenar.
    * Debe ser distinto de <code>null</code>.
    */
    public ListaAgenda(RegistroAgenda elemento) {
        this.elemento = elemento;
    }


    /**
     * Devuelve el elemento almacenado en esta lista.
    */
    public RegistroAgenda getRegistro() {
        return elemento;
    }

    /**
     * Devuelve la lista siguiente.
    */
    public ListaAgenda getSiguiente() {
        return siguiente;
    }

    /**
     * Asigna a la lista que va despues de esta.
     * @param siguiente: otra lista.
    */
    public void setSiguiente(ListaAgenda siguiente) {
        this.siguiente = siguiente;
    }

}
