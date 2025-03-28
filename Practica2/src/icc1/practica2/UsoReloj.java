/* -*- jde -*- */
/* <UsoReloj.java> */

package icc1.practica2;

/**
 * <p>La clase UsoReloj sirve (como su nombre indica), para hacer
 * uso de las clases Reloj y VistaRelojAnalogico.<p>
 * Sólo tiene una función, <code>main</code>, donde se hace el uso de las
 * clases Reloj y GraficosDeReloj.
 */
public class UsoReloj {
    /**
     *  Entrada en ejecución.
     * @param args argumentos opcionales para la ejecución
    **/
    
    public static void main(String[] args) {

        // Declaramos reloj, una variable de la interfaz Reloj.
        Reloj reloj;
        // Declaramos vista, una variable de la interfaz VistaReloj.
        VistaReloj vista;

        // Instanciamos reloj como un objeto de la clase ClaseReloj.
        reloj = new ClaseReloj();
        // Instanciamos vista como objeto de la clase VistaRelojAnalogico.
        vista = new VistaRelojAnalogico(reloj);
        vista = new VistaRelojAnalogico(reloj, 600, 650);
        vista.espera(1);                // Esperamos un segundo.
        vista.actualiza();              // Actualizamos los gráficos.
        vista.espera(1);                // Esperamos un segundo.
        reloj.avanzaSegundo();          // Avanzamos el Reloj un segundo.
        vista.actualiza();
        vista.espera(1);
        reloj.avanzaMinuto();           // Avanzamos el Reloj un minuto.
        vista.actualiza();
        vista.espera(1);
        reloj.avanzaHora();             // Avanzamos el Reloj una hora.
        vista.actualiza();
        vista.espera(1);
        reloj.ponTiempo(3,25,12);
        vista.actualiza();
        vista.espera(5);
    }
}

/* </UsoReloj.java> */
