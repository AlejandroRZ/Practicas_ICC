/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.practica5;


/**
 * Registro para una Agenda
*/
public class RegistroAgenda { 

 // TODO: Declara aqui los atributos para almacenar
 // nombre, direccion y telefono.
  private String nombre;
  private String direccion;
  private int telefono;

  /**
   * Constructores.
  */
  public RegistroAgenda(){
    nombre = null;
    direccion = null;
    telefono = 0;
  }
  
  
  public RegistroAgenda(String nombre, String direccion, int telefono){
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
  }

  /**
   * Agrega los getters necesarios para leer la informacion en el registro.
  */
  public String getNombre(){
    return nombre;
  }
  
  public String getDireccion(){
    return direccion;
  }
  
  public int getTelefono(){
    return telefono;
  }

  /**
   * Agrega los setters que permitan actualizar los datos de tu contacto.
  */
  public void setNombre(String nom){
    nombre = nom;
  }
  
  public void setDireccion(String dir){
    direccion = dir;
  }
  
  public void setTelefono(int tel){
    telefono = tel;
  }

  /**
   * Devuelve una cadena con los datos en el registro en un formato agradable.
  */
  public String toString() {
    return "Nombre: " + nombre + "\t" + "Dirección: " + direccion + "\t" + "Telefóno: "+ telefono;
  }

}
