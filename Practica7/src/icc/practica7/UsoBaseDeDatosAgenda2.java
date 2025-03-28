/*Clase de uso para una base de datos que funja como agenda*/
package icc.practica7;
import java.util.Scanner;
import icc.util.ManejadorDeLista;

/**
 * Clase de prueba para un menú de uso. 
**/
public class UsoBaseDeDatosAgenda2{

  /**
   * Método estático que comprueba si una cadena es numerica.
   * @param cadena objeto con la información a identificar
   * @return una respuesta en formato booleano.
  **/
  public static boolean esNumerica(String cadena){
    String temporal = cadena.replaceAll(" ","");
    if(temporal.length() == 0)return false;
    for(int i=0; i<temporal.length();i++){
      char c = temporal.charAt(i);
      if(!Character.isDigit(c))return false;
    }
    return true;
  }  

  /**
   * Método estatico que comprueba si una cadena esta constituida
   * por caracteres que no son numeros.
   * @param  cadena el objeto con la información a analizar.
   * @return una respuesta en formato booleano.
  **/
  public static boolean esDeLetras(String cadena){
    String temporal = cadena.replaceAll(" ","");
    if(temporal.length() == 0)return false;
    for(int i=0; i<temporal.length();i++){
      char c = temporal.charAt(i);
      if(Character.isDigit(c))return false;
    }
    return true;
  }  

  /**
   * Método que pide datos al usuario para agregar un contacto.
   * @param lector2 objeto que lee desde entrada standard.
   * @return registro que guarda la informacion de contacto.
  **/
  public RegistroAgenda pedirDatos(Scanner lector2){ 
    RegistroAgenda registro = new RegistroAgenda();
    String entrada;
    Boolean continuidad = true;
    byte estado = 0;

    while(continuidad){

        switch(estado){

            case 0:
              System.out.println("Ingresa un nombre:");
              entrada = lector2.nextLine().trim();
              if (esDeLetras(entrada) && !entrada.isEmpty()) {
                registro.setNombre(entrada);
                estado++;
              }else{
                System.out.println("Debes ingresar un nombre válido.");
              }
              break;

            case 1:
              System.out.println("Ingresa una dirección:");
              entrada = lector2.nextLine().trim();
              if (!entrada.isEmpty()) {
                registro.setDireccion(entrada);
                estado++;
              }else{
                System.out.println("Debes ingresar una dirección.");
              }
              break;

            case 2:
              System.out.println("Ingresa un número telefónico:");
              entrada = lector2.nextLine().trim();
              if (esNumerica(entrada) && entrada.length() == 8) {
                entrada = entrada.replaceAll(" ", "");
                int telef = Integer.parseInt(entrada);
                registro.setTelefono(telef);                
                continuidad = false;                      // Finaliza el programa
              } else {
                System.out.println("Debes ingresar un número telefónico válido.");
              }
              break;
        }        
    }
    return registro;
  }


  /**
   * Método estático que hace busqueda por nombre o 
   * por telefono de un contacto.
   * @param baseBusqueda base de datos donde va a buscar
   * @param lector el lector que hará la búsqueda.
   * @return valor booleano para la iteración donde será incluído.
  **/
  public static boolean busquedaNomTel(BaseDeDatosAgenda baseBusqueda, Scanner lector){    
    String entrada;   
    System.out.println("Dame el nombre o el teléfono de tu contacto");
    entrada = lector.nextLine().trim();
    Boolean encontrado = false;
    if(esNumerica(entrada) && entrada.length() == 8){
      entrada = entrada.replaceAll(" ","");
      int telBuscado = Integer.parseInt(entrada);
      if(baseBusqueda.dameRegistroPorTelefono(telBuscado) != null){
        System.out.println("Resultado:" + "\n" + baseBusqueda.dameRegistroPorTelefono(telBuscado).toString()); 
        encontrado = true;          
      }else{
        System.out.println("Resultado:" + "\n" + "Ese teléfono no está registrado");            
      }          
    }else{
      if(esDeLetras(entrada)){
        if(baseBusqueda.dameRegistroPorNombre(entrada) != null){
          System.out.println("Resultado:" + "\n" + baseBusqueda.dameRegistroPorNombre(entrada));
          encontrado = true;               
        }else{
          System.out.println("Resultado:" + "\n" + "Ese nombre no está registrado");              
        }           
      }else{
        System.out.println("Necesito un teléfono o un nombre adecuados para buscar, " 
                              + "replantea tu búsqueda");            
      }
    }     
    return encontrado;
  }  

  /**
   * Menú para trabajar con la agenda.
   * @param base1 la base de datos con la que se trabajará.
   * @param lector el objeto que lee desde la entrada estándar.   
  **/
  public void menu(BaseDeDatosAgenda base1, Scanner lector){
    String eleccion;
    Boolean continuidad = true;
    do{
        System.out.print("\n" + "¿Qué deseas hacer?" 
          + "\n" + "Para agregar un contacto, presiona 1"
          + "\n" + "Para buscar un contacto, presiona 2" 
          + "\n" + "Para guardar la agenda presiona 3" 
          + "\n" + "Para cargar desde disco presiona 4"
          + "\n" + "Para salir presiona 5" + "\n");        
        eleccion = lector.nextLine().replaceAll(" ", "");

        switch(eleccion){
          case "1":

            RegistroAgenda registrado = pedirDatos(lector);
            base1.anade(registrado);
            System.out.println("Tu contacto ha sido agregado satisfactoriamente");            
            break;

          case "2":

            if(busquedaNomTel(base1, lector))continue;
            break;

          case "3":
            String nombreArchivo;
            System.out.println("Dame el nombre con el que quieres guardar tu agenda:");
            nombreArchivo = lector.nextLine().trim();
            if(base1 == null || base1.noRegistros() == 0){
              System.out.println("La agenda está vacía y no hay nada que guardar");              
            }else{
              base1.guardaAgenda(nombreArchivo+".txt");              
            }            
            break;
          
          case "4":
            System.out.println("Dame la ubicación de tu agenda");
            String archivo = lector.nextLine().trim();
            base1.llenaAgenda(archivo+".txt");     
            break;
          
          case "5":          
            System.out.print("\n" + "Hasta pronto" + "\n" +
              "DSO fue desarrollado por @AlejandroRZ" + "\n"); 
            continuidad = false;             
            break;
        
          default:
            System.out.println("Debes elegir alguna opcion de las presentadas");
            break;
        }       
    }while(continuidad);
  }    
    
  /**
   * Entrada a la ejecución al metodo main
   * @param args argumentos opcionales para la ejecución.
  **/    
  public static void main(String[]args){
    Scanner lectorAlpha = new Scanner(System.in);
    BaseDeDatosAgenda baseDeDatos = new BaseDeDatosAgenda();
    UsoBaseDeDatosAgenda2 presentador = new UsoBaseDeDatosAgenda2();
    System.out.println("Bienvenido");
    presentador.menu(baseDeDatos,lectorAlpha);
    lectorAlpha.close(); 
  }
    
}
