/* -*- jde -*- */
/* <UsoReloj.java> */

package icc1.practica1;

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
    // Declaramos y definimos tiempoSistema, una variable para acceder
    // a la hora en la computadora.
    TiempoSistema tSistema = new TiempoSistema(reloj);

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
    tSistema.actualizaReloj();   // Leemos la hora del sistema
    vista.actualiza();
    tSistema.funcionaUnRatito(vista, 10); // Hechamos a andar el reloj 10 segs
  }
}

/* </UsoReloj.java> */
