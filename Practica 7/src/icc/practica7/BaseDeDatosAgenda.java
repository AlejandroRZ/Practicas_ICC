/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.practica7;
import icc.util.Buscador;
import icc.util.ManejadorDeLista;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Clase para representar una Base de Datos de agenda. *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
**/
public class BaseDeDatosAgenda{ 

  /**
   * Este objeto llevara el control de los registros guardados en la lista.
  **/
  private ManejadorDeLista tabla;

  /**
   * Constructor por defecto para bases de datos vacías
  **/
  public BaseDeDatosAgenda(){
    tabla = new ManejadorDeLista();
  }

  /**
   * Constructor de la base sobre una entrada que la define.
   * @param datos Una cadena con el formato requerido por esta base
   * con los registros de nombres, direcciones y telefonos.
   * @param tam_nombre tamaño del espacio asignado al nombre.
   * @param tam_direccion tamaño del espacio asignado a la direccion.
   * @param tam_telefono tamaño del espacio asignado al telefono.
  **/
  public BaseDeDatosAgenda(String datos,int tam_nombre,int tam_direccion,int tam_telefono) {
        
      int tam_registro = tam_nombre + tam_direccion + tam_telefono;
      String regi = datos.substring(0,tam_registro);
      ManejadorDeLista asistente = new ManejadorDeLista();
    
      while(regi.length() <= datos.length()){
            String nomine = regi.substring(0, tam_nombre);
            String direc =  regi.substring(nomine.length(),  nomine.length() + tam_direccion);
            String telef =  regi.substring(nomine.length() + tam_direccion, regi.length());            
            int telefi = Integer.parseInt(telef);
            RegistroAgenda registroAgenda = new RegistroAgenda(nomine, direc, telefi);
            asistente.agrega(registroAgenda);
            if(regi.length() != datos.length()){
            datos = datos.substring(regi.length(), datos.length());
            regi = datos.substring(0,tam_registro);
            }else {break;}
      }
      tabla = asistente;    
  }

  /**
   * Metodo que añade directamente a la base
   * @param registro que se añadirá.
  **/
  public void anade(RegistroAgenda registro){
    tabla.agrega(registro);
  }

  /** 
   * Método que busca los datos dentro de un registro dado el nombre.
   * @param nombre cadena con el nombre contenido en el registro a buscar.
   * @return el registro que se buscaba si se encuentra, null en caso contrario.
  **/
  public RegistroAgenda dameRegistroPorNombre (String nombre) {
    Buscador inspector = new BuscadorPorNombre(nombre);
      if(tabla != null){
        RegistroAgenda encontrado = (RegistroAgenda)tabla.encuentra(inspector);
        return encontrado;
      }else{return null;}
  }

  /** 
   * Método que devuelve los datos dentro de un registro dado el 
   * número telefónico.
   * @param tel número contenido en el registro a buscar.
   * @return el registro que se buscaba si se encuentra, null en caso contrario.
  **/
  public RegistroAgenda dameRegistroPorTelefono (int tel) {
    Buscador inspector = new BuscadorPorTelefono(tel);
    if(tabla != null){
      RegistroAgenda encontrado = (RegistroAgenda)tabla.encuentra(inspector);
      return encontrado;        
    }else{return null;}
  }

  /**
   * Método que guarda los datos de una agenda en el archivo de texto 
   * que funge como respaldo. 
   * @param cadena cadena de texto con el nombre del archivo.
  **/
  public void guardaAgenda(String cadena){      
    try(
      PrintStream fout = new PrintStream(cadena)
    ){
      GuardaRegistro guardador = new GuardaRegistro(fout);
      tabla.encuentra(guardador);
      fout.close();
      System.out.println("Tu agenda se guardó como " + cadena);
    }catch(FileNotFoundException fileNot){
      System.err.println("No se encontro el archivo " + cadena + " y no pudo ser creado"); 
    }catch(SecurityException seException){
      System.err.println("No se tiene permiso de escribir en el archivo");
    }

  }

  /**
   * Méodo que llena la agenda con datos desde un archivo.
   * @param texto ruta del archivo  de texto donde se 
   * guarda la informacion con la cual se llenará la agenda.
  **/
  public void llenaAgenda(String texto){
    try{      
      BufferedReader brf = new BufferedReader(new FileReader(texto));
      while (brf.ready()) { 
        RegistroAgenda registro = RegistroAgenda.llenaRegistro(brf);
        if (registro.getNombre() != null) tabla.agrega(registro);        
      }
      brf.close();
    }catch(FileNotFoundException fileNotExc){
        System.err.println("No se encontro el archivo texto.txt");
    }catch(IOException ioExcept){
        System.err.println("Error al leer el contenido de texto.txt");
    }
  }

  /**
   * Método que sirve para conocer el tamaño en registros. 
   * @return el número de registros dentro de la tabla.
  **/
  public int noRegistros(){
    return tabla.getLongitud();
  }

}
