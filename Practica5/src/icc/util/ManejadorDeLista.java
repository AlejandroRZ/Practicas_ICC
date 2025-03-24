/* -*- jde -*- */
/* <ManejadorDeLista.java> */

package icc.util;
import icc.practica5.RegistroAgenda;
/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
*/
public class ManejadorDeLista { 

  /**
   * Primer elemento de la lista.
  */
  private ListaAgenda cabeza;

  /**
   * Numero de elementos en la lista.
  */
  private int longitud;

  /**
   * Agrega un registro agenda al final de la lista.
   * @param elemento el nuevo registro a añadir en la lista.
  */
  public void agrega(RegistroAgenda elemento) {
    // Crea el nuevo elemento y lo cuenta.
    ListaAgenda nuevo = new ListaAgenda(elemento);
    longitud++;

    // Si la lista está vacía añade al primer elemento y termina.
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
   * @return la longitud entera de la lista.
  */
  public int getLongitud() {
    return longitud;
  }

  /**
   * Método para que define la la busqueda en la base de datos.
   * @param buscador el objeto que se encarga de hacer al búsqueda dentro de la lista.
   * @return el registro buscado si lo encuentra, null si no.
  */
  public RegistroAgenda encuentra(Buscador buscador) {
    // TODO: Utiliza al objeto buscador para encontrar
    // al registro agenda con el dato solicitado.
    RegistroAgenda resultado = null;
    if(cabeza != null){        
      ListaAgenda registro_actual = cabeza;
      while(registro_actual.getSiguiente() != null) {
        RegistroAgenda elemento = registro_actual.getRegistro();
        if(buscador.esEste(elemento)){
          resultado = elemento;
          break;
        }
        registro_actual = registro_actual.getSiguiente();      
      }  
    }       
    return resultado; 
  }

}
