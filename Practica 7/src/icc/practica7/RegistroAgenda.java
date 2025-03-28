/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.practica7;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Clase que define un tegistro para una agenda.
**/
public class RegistroAgenda { 

  /** Datos que se almacenaran en el registro.
   * @param nombre
   * @param direccion
   * @param telefono  
  **/
  private String nombre;
  private String direccion;
  private int telefono;
 
  /**
   * Constructor por defecto de registros vacios.
  **/
  public RegistroAgenda(){
    nombre = null;
    direccion = null;
    telefono = 0;
  }
 
  /**
   * Constructor que asigna valores a cada atributo.
   * @param nombre nombre completo a guardar dentro del registro.
   * @param direccion dirección de la persona a registrar.
   * @param telefono número telefónico de contacto del registrado.
  **/
  public RegistroAgenda(String nombre, String direccion, int telefono){
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
  }

  /**
   * Método para obtener el nombre almacenado en el registro.
   * @return cadena con el nombre guardado.
  **/
  public String getNombre(){
    return nombre;
  }
  
  /**
   * Método para obtener la dirección almacenada en el registro.
   * @return cadena con la dirección guardada.
  **/
  public String getDireccion(){
    return direccion;
  }
  
  /**
   * Método para obtener el número teléfonico almacenado en el registro.
   * @return entero con el número de teléfono guardado.
  **/
  public int getTelefono(){
    return telefono;
  }
 
  /**
   * Método para ajustar el nombre almacenado en el registro.
   * @param nom cadena nuevo nombre a almacenar.
  **/
  public void setNombre(String nom){
    nombre = nom;
  }
  
  /**
   * Método para obtener el nombre alamcenado en el registro.
   * @param dir cadena con la neuva dirección a guardar.
  **/
  public void setDireccion(String dir){
    direccion = dir;
  }
  
  /**
   * Método para obtener el número de teléfono almacenado en el registro.
   * @param tel entero cadena con el nuevo número a guardar.
  **/
  public void setTelefono(int tel){
    telefono = tel;
  }
 
  /**
   * Metodo para presentar datos en forma de cadena.
   * @return una cadena con los datos en el registro 
   * en un formato agradable
  **/
  public String toString() {
    return "Nombre: " + nombre + "\t" + "Dirección: " + direccion + "\t" + "Teléfono: "+ telefono;
  }

  /**
   * Metodo para llenar registros desde archivo.
   * @param bf un lector de archivos
   * @return un registro con los datos leídos desde archivo.
  **/ 

  public static RegistroAgenda llenaRegistro(BufferedReader bf){
    RegistroAgenda register = new RegistroAgenda();
    try{
        String nombre = bf.readLine();
        register.setNombre(nombre);
        System.out.println("nombre: " + nombre);
        String direccion = bf.readLine();        
        register.setDireccion(direccion);
        System.out.println("direccion: " + direccion);
        int telefono = Integer.parseInt(bf.readLine());        
        register.setTelefono(telefono);
        System.out.println("telefono: " + telefono);
        
      }catch(FileNotFoundException fileNotExc){
        System.err.println("No se encontro el archivo .txt");
      }catch(NumberFormatException numFormtExc){
        System.err.println("El archivo se encuentra alterado y no es posible hacer la asignacion");
      }catch(IOException ioExc){
        System.err.println("Error al leer el contenido de texto.txt");
      }
    return register;    
  }
  
  /**
   * Metodo para que un registro imprima sus datos.
   * @param printer objeto que imprime los datos.
  **/
  public void imprimeDatos(PrintStream printer){
    printer.println(nombre);
    printer.println(direccion);
    printer.println(telefono);
  }

}
