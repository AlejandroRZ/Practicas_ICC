/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.practica6;

import icc.util.Buscador;

/**
 * Clase que busca registros agenda con un nombre dado.
**/
public class BuscadorPorNombre implements Buscador{

  /* Nombre que se busca */
  private String nombreBuscado;

  /**
  * Construye al buscador con el nombre que
  * va buscar.
  * @param nombre nombre que va a buscar. 
  **/
  public BuscadorPorNombre(String nombre) {
    nombreBuscado = nombre;
  }

  /**
  * Metodo que indica si el objeto pasado como parametro
  * es el que se esta buscando.
  * @param reg Objeto que se desea saber si corresponde
  * al nombre buscado.
  * @return si <code>reg</code> tiene ese nombre.
  */
  public boolean esEste(Object reg) {
    RegistroAgenda regi = (RegistroAgenda)reg;
    return regi.getNombre().equals(nombreBuscado);
  }

}