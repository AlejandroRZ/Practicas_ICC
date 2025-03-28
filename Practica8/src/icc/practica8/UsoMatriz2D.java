/*Clase de uso para matrices de 2 dimensiones
 *@author andreiev. 
 */
package icc.practica8;

public class UsoMatriz2D{

 public static void main(String [] args){
 
 double prueba1[][] = {{2.5,3.7},{5,9},{1.6,2.1}};

 double prueba2[][] = {{9,3.8},{7,4},{1.5,3.1,4.9}};

 double prueba3[][] = {{2.5,3.7},{5,9},{1.6,2.1}, {5.6,9.0}};
 
 double prueba4[][] = {{3,4},{5},{89,1}, {7.4,6.6}};

 double prueba5[][] = {{1,2},{4.3,3.1},{7,1.1}}; 

 double prueba6[][] = {{4,3,6},{2.1,4.2,3.6}}; 

 System.out.println("Hola hola caracola, que tal te va con la ola?");
 
 
 Matriz2D mat1 = Matriz2D.llenaMatriz(prueba1);
 System.out.println(mat1.toString());
 
 Matriz2D mat2 = Matriz2D.llenaMatriz(prueba2);
 System.out.println(mat2.toString());
 
 Matriz2D mat3 = Matriz2D.llenaMatriz(prueba3); 
 System.out.println(mat3.toString());
 
 Matriz2D mat4 = Matriz2D.llenaMatriz(prueba4);  
 System.out.println(mat4.toString());

 Matriz2D mat5 = Matriz2D.llenaMatriz(prueba5);  
 System.out.println(mat5.toString());
 
 //Este lanzara una excepcion, asi lo quise :)
 Matriz2D mat6 = Matriz2D.llenaMatriz(prueba6);  
 System.out.println(mat6.toString());
 
 
 System.out.println(mat1.sumaMatrices(mat2).toString());
 System.out.println(mat1.restaMatrices(mat2).toString());
 System.out.println(mat3.multiplicaEscalar(8));
 System.out.println(mat2.multiplicaEscalar(8));
 System.out.println(mat5.multiplicaMatrices(mat6));
 System.out.println(mat4.multiplicaMatrices(mat3));



 
 }
} 