package icc.practica0;

/**
 * Clase de uso para la impresora en binario.
 * @author AlejandroRZ 
**/
public class UsoImpresoraBinario{ 
  
  /**
   * Entrada en ejecución a main.
   * @param args argumentos opcionales para la ejecución.
  **/
  public static void main (String[]args){
    double nan = Double.NaN;
    double minf = Double.NEGATIVE_INFINITY;
    double pinf = Double.POSITIVE_INFINITY;
    double cero = 0.0;
    double mcero = -0.0;
    int permisos = 0754;
    int corrimiento1 = permisos << 1;
    int corrimiento2 = permisos << 3;
    int corrimiento3 = permisos >> 1;
    int corrimiento4 = permisos >> 3;  
    int corrimiento5 = permisos >>> 1;  
    int corrimiento6 = permisos >>> 3;  
    int primeroa = 456;
    long primerob = 456L;
    float primeroc = 456.0F;
    double primerod = 456.0;
    int segundoa = -456;
    long segundob = -456L;
    float segundoc = -456.0F;
    double segundod = -456.0;
    double terceroa = -456.061;
    float tercerob = -456.061F;
    int terceroc = (int)terceroa;
    long tercerod = (long)terceroa;
    int mascara = 111; //En binario 1101111//
    int mascaracan = mascara << 3;  
    int num = 1408;
    int andando = mascara & num;
    int oregano = mascara | num;
    int complemento = ~mascara; 
    
    ImpresoraBinario impresora;  
    impresora = new ImpresoraBinario();
    
    System.out.println("¡Hola cocodrilo!, ¿Qué tal te va por el Nilo?");
    
    
    //Actividades de 1.1 a 1.4//
    System.out.println("Así se ve el NaN");
    impresora.imprime(nan);
    System.out.println("Así se ve el infinito negativo");
    impresora.imprime(minf);
    System.out.println("Así se ve el infinito positivo");
    impresora.imprime(pinf);
    System.out.println("Así se ve el cero positivo");
    impresora.imprime(cero);
    System.out.println("Así se ve el cero negativo");
    impresora.imprime(mcero);
    System.out.println("Así se ven los registros");
    impresora.imprime(permisos);
    System.out.println("Así se ven los registros con << 1 ");
    impresora.imprime(corrimiento1);
    System.out.println("Así se ven los registros con << 3 ");
    impresora.imprime(corrimiento2);
    System.out.println("Así se ven los registros con >> 1");
    impresora.imprime(corrimiento3);
    System.out.println("Así se ven los registros con >> 3");
    impresora.imprime(corrimiento4);
    System.out.println("Así se ven los registros con >>> 1");
    impresora.imprime(corrimiento5);
    System.out.println("Así se ven los registros con >>> 3");
    impresora.imprime(corrimiento6);
    System.out.println("Para darle acceso de escritura a todos basta con un corrimiento a la derecha");
    impresora.imprime(corrimiento3);
        
    //Ejercicio 1//
    System.out.println("Ejercicio 1-a");
    impresora.imprime(primeroa);
    System.out.println("Ejercicio 1-b");
    impresora.imprime(primerob);
    System.out.println("Ejercicio 1-c");
    impresora.imprime(primeroc);
    System.out.println("Ejercicio 1-d");
    impresora.imprime(primerod);
    
     //Ejercicio 2//
    System.out.println("Ejercicio 2-a");
    impresora.imprime(segundoa);
    System.out.println("Ejercicio 2-b");
    impresora.imprime(segundob);
    System.out.println("Ejercicio 2-c");
    impresora.imprime(segundoc);
    System.out.println("Ejercicio 2-d");
    impresora.imprime(segundod);
    
    //Ejercicio 3//
    System.out.println("Ejercicio 3-a");
    impresora.imprime(terceroa);
    System.out.println("Ejercicio 3-b");
    impresora.imprime(tercerob);
    System.out.println("Ejercicio 3-c");
    impresora.imprime(terceroc);
    System.out.println("Ejercicio 3-d");
    impresora.imprime(tercerod);
    
     //Ejercicio 4//
    System.out.println("Ejercicio 4-a");
    impresora.imprime(mascaracan);
    
    //Ejercicio 5//
    System.out.println("Ejercicio 5-a");
    impresora.imprime(andando);
    System.out.println("Ejercicio 5-b");
    impresora.imprime(oregano);
    System.out.println("Ejercicio 5-c");
    impresora.imprime(complemento);
       
  }

}