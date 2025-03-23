/* -*- jde -*- */
/* <Buscador.java> */

package icc.util;
import icc.practica5.RegistroAgenda;
/**
 * Interfaz para definir objetos que buscan otros que
 * satisfagan cierta condicion.
 */
public interface Buscador {

    /**
     * Metodo que indica si el objeto pasado como parametro
     * es el que se esta buscando.
    */
    public boolean esEste(RegistroAgenda reg);

}