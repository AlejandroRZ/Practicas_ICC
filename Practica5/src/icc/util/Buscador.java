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
     * @param reg registro a determinar si es el adecuado.
     * @return el resultado, sí el registro pasado como argumento es el buscado o no.
    **/
    public boolean esEste(RegistroAgenda reg);

}