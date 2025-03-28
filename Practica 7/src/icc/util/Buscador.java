/* -*- jde -*- */
/* <Buscador.java> */
package icc.util;

/**
 * Interfaz para definir objetos que buscan otros que
 * satisfagan cierta condicion.
 */
public interface Buscador {

 /**
  * Metodo que indica si el objeto pasado como parametro
  * es el que se esta buscando.
  * @param obj parametro que determina la busqueda.
  * @return si <code>reg</code> tiene ese dato.*/
 public boolean esEste(Object obj);

}