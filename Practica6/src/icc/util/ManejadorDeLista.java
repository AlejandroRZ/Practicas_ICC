/* -*- jde -*- */
/* <ManejadorDeLista.java> */
package icc.util;
/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
**/
public class ManejadorDeLista{ 

  /**
   * Primer elemento de la lista.
  **/
  private ListaAgenda cabeza;

  /**
   * Numero de elementos en la lista.
  **/
  private int longitud;

  /**
   *Agrega un objeto al final de la lista.
   *@param elemento el nuevo elemento a añadir.
  **/
  public void agrega(Object elemento) {
    // Crea el nuevo elemento y lo cuenta.
    ListaAgenda nuevo = new ListaAgenda(elemento);
    longitud++;

    // Si la lista esta vacia anade al primer elemento y termina.
    if (cabeza == null) {
      cabeza = nuevo;
      return;
    }

    // Si no, hay que recorrer la lista para formar al nuevo
    // elemento detras del ultimo.
    ListaAgenda anterior = cabeza;
    while(anterior.getSiguiente() != null) {
      anterior = anterior.getSiguiente();
    }
    anterior.setSiguiente(nuevo); 
  }

  /**
   * Devuelve el numero de elementos en esta lista.
   * @return longitud
  **/
  public int getLongitud() {
    return longitud;
  }

  /**
   * Por ahora utilizaremos este metodo para poder
   * programar la busqueda en la base de datos.
   * @param buscador: objeto que guarda el dato a buscar.
   * @return resultado: objeto que contiene el dato buscado.
  **/
  public Object encuentra(Buscador buscador) {
    Object resultado = null;
    if(cabeza != null){      
        ListaAgenda elemento_actual = cabeza;
        while(elemento_actual != null){
          if(buscador.esEste(elemento_actual.getRegistro())){
            resultado = elemento_actual.getRegistro();
            break;
          }
          elemento_actual = elemento_actual.getSiguiente();
        }        
    }
    return resultado; 
  }
}
