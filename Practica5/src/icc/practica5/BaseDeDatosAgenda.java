/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.practica5;
import icc.util.Buscador;
import icc.util.ManejadorDeLista;
import icc.practica5.RegistroAgenda;
import icc.practica5.BuscadorPorNombre;
/**
 * Clase para representar una Base de Datos de agenda.
 *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
**/
public class BaseDeDatosAgenda { 

  /**
  * Este objeto llevara el control de los registros guardados en la lista.
  */
  private ManejadorDeLista tabla;

  /**
   * Constructor para bases de datos vacias
  **/
  public BaseDeDatosAgenda(){
    tabla = null;
  }
  
  /**
   * Constructor.
   * @param datos Una cadena con el formato requerido por esta base
   * con los registros de nombres, direcciones y telefonos.
   * @param tam_nombre tamaño en carácteres del nombre.
   * @param tam_direccion tamaño en carácteres de la dirección.
   * @param tam_telefono tamaño en digitos del teléfono.
  **/
  public BaseDeDatosAgenda(String datos, int tam_nombre, int tam_direccion, int tam_telefono) {    
    // TODO: Crear el ManejadorDeLista para almacenar ahi los registros.
    int tam_registro = tam_nombre + tam_direccion + tam_telefono;
    String regi = datos.substring(0,tam_registro);
    ManejadorDeLista asistente = new ManejadorDeLista();
  
    while(regi.length() <= datos.length()){

      String nomb = regi.substring(0, tam_nombre);
      String direc =  regi.substring(nomb.length(),  nomb.length() + tam_direccion);
      String telef =  regi.substring(nomb.length() + tam_direccion, regi.length());

      int tel_numerico = Integer.parseInt(telef);
      RegistroAgenda registroAgenda = new RegistroAgenda(nomb, direc, tel_numerico);      
      asistente.agrega(registroAgenda);

      if(regi.length() != datos.length()){
        datos = datos.substring(regi.length(), datos.length());
        regi = datos.substring(0,tam_registro);
      }else {break;}

    }

    tabla = asistente;                      

  }

  /** 
   * Método que busca un registro en la base de datos dado un nombre.
   * @param nombre el nombre de la persona a buscar. 
   * @return el registro con el nombre indicado si se encuentra, null si no.
  **/
  public RegistroAgenda dameRegistroPorNombre (String nombre) {
    // TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
    // para encontrar el registro correcto dentro de la lista.
    Buscador busca_nombre = new BuscadorPorNombre(nombre);

    if(tabla != null){
      RegistroAgenda resultado_busqueda = tabla.encuentra(busca_nombre);
      return resultado_busqueda;      
    }else{return null;}

  }

  /** 
   * Método que busca un registro en la base de datos dado un número de teléfono.
   * @param tel el número telefónico de la persona a buscar. 
   * @return el registro con el número telefónico indicado si se encuentra, null si no.
  **/
  public RegistroAgenda dameRegistroPorTelefono (int tel) {
    // TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
    // Usa BuscadorPorTelefono y el metodo encuentra de ManejadorDeLista
    // para encontrar el registro correcto dentro de la lista.
    Buscador busca_tel = new BuscadorPorTelefono(tel);

    if(tabla != null){
      RegistroAgenda resultado_busqueda = tabla.encuentra(busca_tel);
      return resultado_busqueda; 
    }else{return null;}
  }
  
}
