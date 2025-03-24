/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.practica6;
import icc.util.Buscador;
import icc.util.ManejadorDeLista;

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
      **/
      private ManejadorDeLista tabla;

      /**
      * Constructor por defecto para bases de datos vacías.
      **/
      public BaseDeDatosAgenda(){
      tabla = null;
      }

      /**
       * Constructor.
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
       * Método que devuelve un registro dentro de la agenda basado en su nombre.
       * @param nombre nombre contenido en el registro a buscar.
       * @return encontrado el registro que se buscaba.
      **/
      public RegistroAgenda dameRegistroPorNombre (String nombre) {
            Buscador inspector = new BuscadorPorNombre(nombre);
            if(tabla != null){
                  RegistroAgenda encontrado = (RegistroAgenda)tabla.encuentra(inspector);
                  return encontrado;
            }else{return null;}
      }

      /**
       * Método que devuelve un registro de la agenda basado en su número de teléfono.
       * @param tel telefono contenido en el registro a buscar.
       * @return encontrado el registro que se buscaba.
      **/
      public RegistroAgenda dameRegistroPorTelefono (int tel) {
            Buscador inspector = new BuscadorPorTelefono(tel);
            if(tabla != null){
                  RegistroAgenda encontrado = (RegistroAgenda)tabla.encuentra(inspector);
                  if(encontrado != null){
                        return encontrado; 
                  }else{return null;}
            }else{return null;}
      }
}
