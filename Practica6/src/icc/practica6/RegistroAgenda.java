/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.practica6;


/**
 * Registro para una Agenda
**/
public class RegistroAgenda { 

  private String nombre;
  private String direccion;
  private int telefono;
 
  /**
   * Constructor por defecto.
  **/
  public RegistroAgenda(){
    nombre = null;
    direccion = null;
    telefono = 0;
  }
  
  /** Datos que se alamacenaran en el registro
   * @param nombre el nombre completo de la persona.
   * @param direccion dirección completa de la persona.
   * @param telefono  número telefónico de la persona.
  **/  
  public RegistroAgenda(String nombre, String direccion, int telefono){
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
  }

  /**
   * Método que devuelve el nombre dentro de un registro. 
   * @return el nombre dentro del registro en turno.
  **/
  public String getNombre(){
    return nombre;
  }
  
  /**
   * Método que devuelve la dirección dentro de un registro. 
   * @return la dirección dentro del registro en turno.
  **/
  public String getDireccion(){
    return direccion;
  }
  
  /**
   * Método que devuelve el número telefónico dentro de un registro. 
   * @return el número telefónico dentro del registro en turno.
  **/
  public int getTelefono(){
    return telefono;
  }

  /**
   * Método que ajusta el nombre guardado dentro del registro.
   * @param nom el nuevo nombre a asignar.
  */
  public void setNombre(String nom){
    nombre = nom;
  }
  
  /**
   * Método que ajusta la dirección guardada dentro del registro.
   * @param dir la nueva dirección a asignar.
  */
  public void setDireccion(String dir){
    direccion = dir;
  }
  
  /**
   * Método que ajusta el número telefónico guardado dentro del registro.
   * @param tel el nuevo número a asignar.
  */
  public void setTelefono(int tel){
    telefono = tel;
  }

  /*Devuelve una cadena con los datos en el registro en un formato agradable*/
  public String toString() {
    return "Nombre: " + nombre + "\t" + "Dirección: " + direccion + "\t" + "Teléfono: "+ telefono;
  }


}
