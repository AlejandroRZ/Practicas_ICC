/*Demostracion del uso de Scanner*/
import java.util.Scanner;
public class DemoScanner{

  public static void main(String[]args){
  Scanner lector = new Scanner(System.in);
  while(lector.hasNext()){
  String linea = lector.nextLine();
  System.out.println("Eco: " + linea);
  if(linea.equals("Adios")) break;  
  }
  lector.close();  
  }


}