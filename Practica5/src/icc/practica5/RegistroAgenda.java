/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.practica5;


/**
 * Clase que modela un registro para una agenda.
**/
public class RegistroAgenda { 

 // TODO: Declara aqui los atributos para almacenar
 // nombre, direccion y telefono.
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
  
  /** 
   * Constructor de un registro con datos en concreto.
   * @param nombre nombre completo de la persona a registrar.
   * @param direccion dirección completa de la persona a registrar.
   * @param telefono número telefónico de la persona a registrar.
  **/
  public RegistroAgenda(String nombre, String direccion, int telefono){
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
  }

  /**
   * Método que retorna el nombre en un registro de la base.
   * @return el nombre almacenado dentro del registro.
  **/
  public String getNombre(){
    return nombre;
  }
  
  /**
   *  Método que retorna la dirección en un registro de la base.
   * @return la dirección almacenada dentro del registro.
  **/ 
  public String getDireccion(){
    return direccion;
  }
  
  /**
   *  Método que retorna el número telefónico en un registro de la base.
   * @return el número telefónico dentro del registro.
  **/ 
  public int getTelefono(){
    return telefono;
  }

  /**
   *  Método que ajusta el nombre en un registro de la base.
   * @param nom nuevo nombre para el registro.
  **/ 
  public void setNombre(String nom){
    nombre = nom;
  }
  
  /**
   *  Método que retorna la dirección en un registro de la base.
   * @param dir nueva dirección para el registro.
  **/ 
  public void setDireccion(String dir){
    direccion = dir;
  }
  
  /**
   *  Método que retorna la dirección en un registro de la base.
   * @param tel nuevo número telefónico para el registro.
  **/ 
  public void setTelefono(int tel){
    telefono = tel;
  }

  /**
   * Devuelve una cadena con los datos en el registro en un formato agradable.
  **/
  public String toString() {
    return "Nombre: " + nombre + "\t" + "Dirección: " + direccion + "\t" + "Telefóno: "+ telefono;
  }

}
