/* -*- jde -*- */
/* <ListaAgenda.java> */
package icc.util;
/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class ListaAgenda{ 

 /**
  * Registro almacenado.
  */
 private Object elemento;

 /**
  * Lista siguiente.
  */
 private ListaAgenda siguiente;

 /**
  * Constructor por defecto para listas vacías. 
 **/
 public ListaAgenda(){
  elemento = null;
  siguiente = null;
 }
 
 /**
  * Construye una lista con un unico elemento.
  * @param elemento: el elemento a almacenar.
  *        Debe ser distinto de <code>null</code>.
  */
  public ListaAgenda(Object elemento) {
  this.elemento = elemento;
  }
   
 /**
  * Devuelve el elemento almacenado en esta lista.
  * @return elemento almacenado en el contenedor.
 **/
 public Object getElemento() {
  return elemento;
 }

 /**
  * Devuelve la lista siguiente.
  * @return siguiente contenedor en la lista.
 **/
 public ListaAgenda getSiguiente() {
  return siguiente;
 }

 /**
  * Asigna a la lista que va despues de esta.
  * @param siguiente: otra lista a concatenar.
 **/
 public void setSiguiente(ListaAgenda siguiente) {
  this.siguiente = siguiente;
 }
 
}
