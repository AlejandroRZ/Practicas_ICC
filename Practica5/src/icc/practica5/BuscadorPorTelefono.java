/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.practica5;

import icc.util.Buscador;

/**
 * Clase que busca registros agenda con un nombre dado.
 */
public class BuscadorPorTelefono implements Buscador{

  /* Telefono que se busca */
  private int telBuscado;

  /**
   * Construye al buscador con el telefono que
   * va a buscar.
  */
  public BuscadorPorTelefono(int telefono) {
    telBuscado = telefono;
  }

  /**
   * Metodo que indica si el objeto pasado como parametro
   * es el que se esta buscando.
   * @param reg Registro que se desea saber si corresponde
   * al telefono buscado.
   * @return si <code>reg</code> tiene ese telefono.
  */
  public boolean esEste(RegistroAgenda registro) {
    
    return registro.getTelefono() == telBuscado;
  }


}