package icc.practica8;

/** 
 * Clase que define una matriz de 2 dimensiones y sus operaciones básicas.
 * @author AlejandroRZ
**/
public class Matriz2D{

  private double matriz [][];

  /**
   * Constructor de una matriz númerica de 2 dimensiones.
   * @param renglones número de renglones para la matriz.
   * @param columnas número de columnas para la matriz.
  **/
  public Matriz2D(int renglones, int columnas){
    matriz = new double [renglones][columnas];
  }


  /**
   * Método que devuelve el número de renglones en una matriz.
   * @return número de renglones en una matriz.
  **/
  public  int getRenglones(){
  return matriz.length;
  }

  /**
   * Método que devuelve el número de columnas en una matriz.
   * @return número de columnas en una matriz.
  **/
  public int getColumnas(){
    if(matriz.length > 0)return matriz[0].length; 
    return 0;
  }


  /**
   * Método auxiliar que presenta información de vectores(renglones) en cadenas.
   * @param arreglo vector a representar
   * @return cadena que representa el vector.
  **/
  private static String toString(double[] arreglo){
    String arregloResult = "";
    for(int i = 0; i < arreglo.length; i++){
      String elemento = Double.toString(arreglo[i]); 
      arregloResult += (elemento + " ");
    }
    return arregloResult;
  }


  /**
   * Método que presenta información de matrices en cadenas.
   * @return cadena que representa a la matriz.
  **/
  public String toString(){
    String cadena = "";
    if(matriz.length > 0){
      for(int j = 0; j < matriz.length; j++){  
        cadena += (toString(matriz[j]) + "\n");
      }
    }else{ cadena = "No hay matriz";}
    return cadena;
  }

  /**
   * Método que asigna datos a las casillas de una matriz de 2 dimensiones.
   * @param array matriz de la cual se tomaran los valores a asignar.
   * @return matriz llena con los datos pasados como parametro. 
  **/
  public static Matriz2D llenaMatriz(double[][] array){
    Matriz2D matrix = new Matriz2D(array.length, array[0].length);
    try{
      for(int i = 0; i<matrix.getRenglones(); i++){
        for(int j = 0; j<matrix.getColumnas(); j++){
          matrix.matriz[i][j] = array[i][j];
        }
      }
    }catch(ArrayIndexOutOfBoundsException aiob){
      System.err.println("Las dimensiones del argumento no son las adecuadas.");
    }
    return matrix;
  }

  /**
   * Método que suma los datos de 2 matrices.
   * @param sumando, matriz con la cual se sumara aquella que manda a llamar el metodo.
   * @return matriz con el resultado de la suma. 
  **/
  public Matriz2D sumaMatrices(Matriz2D sumando){
    Matriz2D resultado = new Matriz2D(this.getRenglones(), this.getColumnas());
    if(sumando.getRenglones() == 0 || sumando.getColumnas()!= this.getColumnas() 
      || sumando.getRenglones() != this.getRenglones() ){

      throw new IllegalArgumentException("No es posible efectuar la suma");

    }else{
      for(int i = 0; i<this.getRenglones(); i++){
        for(int j = 0; j<this.getColumnas(); j++){
          resultado.matriz[i][j] = this.matriz[i][j] + sumando.matriz[i][j];
        }
      }
    }
    return resultado;
  }

  /** Método que resta los datos de una matriz a otra.
   * @param sustraendo, matriz que se sustraera de aquella que manda a llamar el método.
   * @return matriz con el resultado de la resta. 
  **/
  public Matriz2D restaMatrices(Matriz2D sustraendo){
    Matriz2D resultado = new Matriz2D(this.getRenglones(), this.getColumnas());

    if(sustraendo.getRenglones() == 0 || sustraendo.getColumnas()!= this.getColumnas() 
      || sustraendo.getRenglones() != this.getRenglones() ){

      throw new IllegalArgumentException("No es posible efectuar la resta");

    }else{
      for(int y = 0; y<this.getRenglones(); y++){
        for(int x = 0; x<this.getColumnas(); x++){
          resultado.matriz[y][x] = this.matriz[y][x] - sustraendo.matriz[y][x];
        }
      }
    }
    return resultado;
  }

  /** Método que multiplica los datos de una matriz por un escalar.
   * @param escalar por el que se multiplicara la matriz que mande a llamar el metodo.
   * @return matriz con el producto de la multiplicación escalar. 
  **/

  public Matriz2D multiplicaEscalar(double escalar){
    Matriz2D productoEsc = new Matriz2D(this.getRenglones(), this.getColumnas());
    if(this.getRenglones() == 0 ){
      throw new IllegalArgumentException("No es posible efectuar la multiplicacion");
    }else{
      for(int i = 0; i<this.getRenglones(); i++){
        for(int j = 0; j<this.getColumnas(); j++){
          productoEsc.matriz[i][j] = this.matriz[i][j] * escalar;
        }
      }
    }
    return productoEsc;
  }

  /**
   * Método que multiplica los datos de una matriz por los de otra.
   * @param factor, matriz con la que se multiplicara la matriz que mande a llamar el método.
   * @return matriz con el producto de la multiplicación. 
  **/
  public Matriz2D multiplicaMatrices(Matriz2D factor){
    Matriz2D producto = new Matriz2D(this.getRenglones(), factor.getColumnas());
    if(this.getColumnas() != factor.getRenglones()){
      throw new IllegalArgumentException("No es posible efectuar la multiplicación");
    }else{
      for(int y = 0; y<producto.getRenglones(); y++){
        for(int x = 0; x<factor.getColumnas(); x++){
          for(int z = 0; z<this.getColumnas(); z++){
            producto.matriz[y][x] += (this.matriz[y][z] * factor.matriz[z][x]); 
          }
        }
      }
    }    
    return producto;
  }

} 

