/* -*- jde -*- */
/* <ManejadorDeLista.java> */
package icc.util;
/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class ManejadorDeLista{ 
  
  /**
   * Primer elemento de la lista.
   */
  private ListaAgenda cabeza;
  
  /**
   * Numero de elementos en la lista.
   */
  private int longitud;
  
  /**
   * Constructor por defecto 
  **/
  public ManejadorDeLista(){
    cabeza = null;
    longitud = 0;
  }

  /**
   * Agrega un objeto al final de la lista.
   * @param elemento objeto a añadir
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
    if(cabeza == null){
      return null;
    }else{  
      ListaAgenda temporal = cabeza;
      do{
        if(buscador.esEste(temporal.getElemento())){
         return temporal.getElemento();          
        }else{temporal = temporal.getSiguiente();}
      }while(temporal != null);
    }return null;
  }
  
  
  
}
