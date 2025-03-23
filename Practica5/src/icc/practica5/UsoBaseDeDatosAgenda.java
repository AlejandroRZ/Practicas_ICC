/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc.practica5;

/**
 * Clase de uso donde se pueden crear un par de bases de datos y
 * realizar consultas.
 */
public class UsoBaseDeDatosAgenda {

 /*  Numero de caracteres que debe tener el registro nombre. */
 private static final int TAM_NOMBRE    = 20;
 /*  Numero de caracteres que debe tener el registro direccion. */
 private static final int TAM_DIRECCION = 30;
 /*  Numero de caracteres que debe tener el registro telefono. */
 private static final int TAM_TELEFONO  = 8;

 private static final String tabla1 =
 /* Nombre (20) */      /* Direccion (30) */             /* Telefono (8) */
 "Juan Perez Garcia   "+"Avenida Siempre Viva # 40     "+"55554466"+
 "Arturo Lopez Estrada"+"Calle de la abundancia # 12   "+"55557733"+
 "Edgar Hernandez Levi"+"Oriente 110 # 14              "+"55512112"+
 "Maria Garcia Sanchez"+"Avenida Insurgentes Sur # 512 "+"56742391"+
 "Pedro Paramo Rulfo  "+"Avenida Mexico Lindo # 23     "+"54471499"+
 "Jose Arcadio Buendia"+"Macondo # 30                  "+"56230190"+
 "Florentino Ariza    "+"Calle de la Colera # 11       "+"55551221";

 private static final String tabla2 =
 /* Nombre (20) */      /* Direccion (30) */             /* Telefono (8) */
 "Galio Bermudez      "+"Sotanos de Mexico # 45        "+"55552112"+
 "Carlos Garcia Vigil "+"La Republica # 1              "+"55554332"+
 "Eligio Garcia Agusto"+"Ciudades Desiertas # 90       "+"56344325";


  public static void main(String[] args) {
  // TODO: Crear un par de BaseDeDatosAgenda y realizar algunas consultas.
  BaseDeDatosAgenda base1 = new BaseDeDatosAgenda("Juan Perez Garcia   "+"Avenida Siempre Viva # 40     "+"55554466"+
     "Arturo Lopez Estrada"+"Calle de la abundancia # 12   "+"55557733"+
     "Edgar Hernandez Levi"+"Oriente 110 # 14              "+"55512112"+
     "Maria Garcia Sanchez"+"Avenida Insurgentes Sur # 512 "+"56742391"+
     "Pedro Paramo Rulfo  "+"Avenida Mexico Lindo # 23     "+"54471499"+
     "Jose Arcadio Buendia"+"Macondo # 30                  "+"56230190"+
     "Florentino Ariza    "+"Calle de la Colera # 11       "+"55551221", TAM_NOMBRE, TAM_DIRECCION, TAM_TELEFONO);
  
   BaseDeDatosAgenda base2 = new BaseDeDatosAgenda("Galio Bermudez      "+"Sotanos de Mexico # 45        "+"55552112"+
    "Carlos Garcia Vigil "+"La Republica # 1              "+"55554332"+
    "Eligio Garcia Agusto"+"Ciudades Desiertas # 90       "+"56344325", TAM_NOMBRE, TAM_DIRECCION, TAM_TELEFONO);
   
   BaseDeDatosAgenda base3 = new BaseDeDatosAgenda();
 
   RegistroAgenda prueba = base1.dameRegistroPorNombre("Maria Garcia Sanchez");
   if(prueba != null){
   System.out.println(prueba.toString());
   }else{System.out.println("Ese nombre no esta registrado");}
  
   RegistroAgenda prueba2 = base2.dameRegistroPorNombre("Eligio Garcia Agusto");
   if(prueba2 != null){
   System.out.println(prueba2.toString());
   }else{System.out.println("Ese nombre no esta registrado");}
   
   RegistroAgenda prueba3 = base1.dameRegistroPorTelefono(54471499);
   if(prueba3 != null){
   System.out.println(prueba3.toString());
   }else{System.out.println("Ese telefono no esta registrado");}
  
   RegistroAgenda prueba4 = base2.dameRegistroPorTelefono(55552112);
   if(prueba4 != null){
   System.out.println(prueba4.toString());
   }else{System.out.println("Ese telefono no esta registrado");}
   
   RegistroAgenda prueba5 = base2.dameRegistroPorTelefono(55552190);
   if(prueba5 != null){
   System.out.println(prueba5.toString());
   }else{System.out.println("Ese telefono no esta registrado");}
     
   RegistroAgenda prueba6 = base1.dameRegistroPorNombre("Veronica Lilian");
   if(prueba6 != null){
   System.out.println(prueba6.toString());
   }else{System.out.println("Ese nombre no esta registrado");}
   
   RegistroAgenda prueba7 = base3.dameRegistroPorNombre("Rosa Esther");
   if(prueba7 != null){
   System.out.println(prueba7.toString());
   }else{System.out.println("Ese nombre no esta registrado");}
   
   RegistroAgenda prueba8 = base3.dameRegistroPorTelefono(55557890);
   if(prueba8 != null){
   System.out.println(prueba8.toString());
   }else{System.out.println("Ese telefono no esta registrado");}
   
  }
}

/* </UsoBaseDeDatosAgenda.java> */
