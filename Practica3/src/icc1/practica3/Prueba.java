package icc1.practica3;

/** 
 * Clase de pruebas para uso de operadores simples.
**/
public class Prueba{

  /**
   *  Entrada en ejecución.
   * @param args argumentos opcionales para la ejecución
  **/
  public static void main (String [] args){
    System.out.print("Hola, Hola caracola que tal te va con la ola?.\n");

    float x = 1F;
    float y = 0.00000001F;
    
    /**Ejercicio 2*/
    float z = x - y;
    
    /**Ejercicio 1*/
    float w = x % y;
    float g = 6;
    
    System.out.println(w);
    System.out.println(z);
    
    /**Ejercicio 3*/
    System.out.println(1 >> 1);
    System.out.println(-1 >> 1);
    
    /**Ejercicio 4*/
    boolean p = true;
    boolean q = false;
    System.out.println(!(p&&q));
    System.out.println(!p || !q); 
  }
}