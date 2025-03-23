/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.practica5;

import icc.util.Buscador;

/**
 * Clase que busca registros de agenda con un nombre dado.
 */
public class BuscadorPorNombre implements Buscador{

  /* Nombre que se busca */
  private String nombreBuscado;

  /**
   * Construye al buscador con el nombre que
   * va a buscar.
  */
  public BuscadorPorNombre(String nombre) {
    nombreBuscado = nombre;
  }

  /**
   * Metodo que indica si el objeto pasado como parametro
   * es el que se esta buscando.
   * @param reg Registro que se desea saber si corresponde
   * al nombre buscado.
   * @return si <code>reg</code> tiene ese nombre.
  */
  public boolean esEste(RegistroAgenda registro) {
    return registro.getNombre().equals(nombreBuscado);
  }

}