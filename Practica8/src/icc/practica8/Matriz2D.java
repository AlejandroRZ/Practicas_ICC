/*Clase que implementa matrices de 2 dimensiones
 *@author andreiev. 
 */
package icc.practica8;


public class Matriz2D{

private double matriz [][];

public Matriz2D(int renglones, int columnas){
  matriz = new double [renglones][columnas];
}


/*Metodo que devuelve el numero de renglones en una matriz.
@return numero de renglones en una matriz.*/
public  int getRenglones(){
 return matriz.length;
}

/*Metodo que devuelve el numero de columnas en una matriz.
@return numero de columnas en una matriz.*/
public int getColumnas(){
 if(matriz.length > 0){
 return matriz[0].length; 
 }else{return 0; }
}


/*Metodo auxiliar que presenta informacion de vectores(renglones) en cadenas.
@param arreglo(vector) a representar
@return cadena que representa el vector.
*/
private static String toString(double[] arreglo){
    String arregloResult = "";
    for(int y = 0; y < arreglo.length; y++){
    String elemento = Double.toString(arreglo[y]); 
    arregloResult += (elemento + " ");
    }
    return arregloResult;
}


/*Metodo que presenta informacion de matrices en cadenas.
@return cadena que representa a la matriz.
*/
public String toString(){
String cadena = "";


if(matriz.length > 0){

for(int x = 0; x < matriz.length; x++){
    
    double renglon [] = new double[matriz[0].length];
    for(int y = 0; y < matriz[0].length; y++){
     renglon [y] = matriz[x][y];
    }
    cadena += (toString(renglon) + "\n");

}

}else{ cadena = "No hay matriz";}
return cadena;
}

/*Metodo que asigna datos a las casillasde una matriz de 2 dimensiones.
@param array del cual se tomaran los valores a asignar.
@return matriz llena con los datos pasados como parametro. 
*/

public static Matriz2D llenaMatriz(double[][] array){
 Matriz2D matrix = new Matriz2D(array.length, array[0].length);
 try{
  for(int y = 0; y<matrix.getRenglones(); y++){
   for(int x = 0; x<matrix.getColumnas(); x++){
    matrix.matriz[y][x] = array[y][x];
   }
  }
 }catch(ArrayIndexOutOfBoundsException aiob){
  System.err.println("Hicieron falta datos");
  }
 return matrix;
}

/*Metodo que suma los datos de 2 matrices.
@param sumando, matriz con la cual se sumara aquella que manda a llamar el metodo.
@return matriz con el resultado de la suma. 
*/

public Matriz2D sumaMatrices(Matriz2D sumando){
 Matriz2D resultado = new Matriz2D(this.getRenglones(), this.getColumnas());

 if(sumando.getRenglones() == 0 || sumando.getColumnas()!= this.getColumnas() 
  || sumando.getRenglones() != this.getRenglones() ){
  throw new IllegalArgumentException("No es posible efectuar la suma");
 }else{
  for(int y = 0; y<this.getRenglones(); y++){
   for(int x = 0; x<this.getColumnas(); x++){
   resultado.matriz[y][x] = this.matriz[y][x] + sumando.matriz[y][x];

   }
  }
 }return resultado;
}

/*Metodo que resta los datos de una matriz a otra.
@param sustraendo, matriz que se sustraera de aquella que manda a llamar el metodo.
@return matriz con el resultado de la resta. 
*/
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
 }return resultado;
}

/*Metodo que multiplica los datos de una matriz por un escalar.
@param escalar por el que se multiplicara la matriz que mande a llamar el metodo.
@return matriz con el producto de la multiplicacion. 
*/

public Matriz2D multiplicaEscalar(double escalar){
 Matriz2D productoEsc = new Matriz2D(this.getRenglones(), this.getColumnas());
 if(this.getRenglones() == 0 ){
  throw new IllegalArgumentException("No es posible efectuar la multiplicacion");
 }else{
  for(int y = 0; y<this.getRenglones(); y++){
   for(int x = 0; x<this.getColumnas(); x++){
   productoEsc.matriz[y][x] = this.matriz[y][x] * escalar;

   }
  }
 }return productoEsc;

}

/*Metodo que multiplica los datos de una matriz por los de otra.
@param factor, matriz con la que se multiplicara la matriz que mande a llamar el metodo.
@return matriz con el producto de la multiplicacion. 
*/
public Matriz2D multiplicaMatrices(Matriz2D factor){
 Matriz2D producto = new Matriz2D(this.getRenglones(), factor.getColumnas());
 if(this.getColumnas() != factor.getRenglones()){
 throw new IllegalArgumentException("No es posible efectuar la multiplicacion");
 }else{
   for(int y = 0; y<producto.getRenglones(); y++){
    for(int x = 0; x<factor.getColumnas(); x++){
     for(int z = 0; z<this.getColumnas(); z++){
     producto.matriz[y][x] += (this.matriz[y][z] * factor.matriz[z][x]); 
        }
    }
   }
 }return producto;
}


} 

