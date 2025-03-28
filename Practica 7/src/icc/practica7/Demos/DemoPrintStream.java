/*Demostracion del uso de Printstream*/
import java.io.FileNotFoundException;
import java.io.PrintStream;



public class DemoPrintStream{
  public static void main (String []args){
  String nombreArchivo = "Salida.txt";
  try(PrintStream fout = new PrintStream(nombreArchivo)){
  fout.println("Inicio");
  fout.format("Linea %d\n", 1);
  fout.println("Fin");
  }catch(FileNotFoundException filet){
    System.err.println("No se encontro el archivo " + nombreArchivo +
                       " y no pudo ser creado");  
  
  }catch(SecurityException se){
    System.err.println("No se tiene permiso de escribir en el archivo");
  
  }
  
  }
}