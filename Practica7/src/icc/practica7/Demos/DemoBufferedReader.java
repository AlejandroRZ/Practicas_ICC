/*Demostracion del uso de BufferedReader*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader{
  
  public static void main(String[]args){
    try{
    BufferedReader in = new BufferedReader(new FileReader("texto.txt"));
    String linea;
    while((linea = in.readLine()) != null){
    System.out.println(linea);
    }
    in.close();
    
    }catch(FileNotFoundException e){
    System.err.println("No se encontro el archivo texto.txt");
    }catch(IOException ioe){
    System.err.println("Error al leer el contenido de texto.txt");
    }
       
  }


}