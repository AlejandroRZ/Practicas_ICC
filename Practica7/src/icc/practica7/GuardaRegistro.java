/*Clase donde se implementa la funcion esEste a ejecutar 
 * con cada uno de los elementos de la lista.
 */
package icc.practica7;
import icc.util.Buscador;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Clase que define objetos capaces de guardar un
 * registro en un archivo de texto plano.
**/
public class GuardaRegistro implements Buscador{
  private PrintStream impresor;

  /**
   * Constructor que asigna un impresor.
   * @param pis objeto de la clase PrintStream que guardará
   * el flujo de datos.
  **/
  public GuardaRegistro(PrintStream pis){
    impresor = pis;
  }

  /**
   * Método que determina la identidad de un registro dado.
   * @param obj el elemento a verificar.
   * @return valor booleano que confirma o no la identidad del registro.
  */
  public boolean esEste(Object obj){
    RegistroAgenda registrin = (RegistroAgenda)obj;
    registrin.imprimeDatos(impresor);
    return false;
  }

}