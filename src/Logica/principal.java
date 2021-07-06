package Logica;

import Vista.*;

public class principal {
    // Creacion de los frame
    public static dificultad v_dificultad = new dificultad();
    // Juego
    public static VistaTableroCronometro a = new VistaTableroCronometro();
    // Dificultad
    public static int dificultad_int = 0; // 0: principiante 9x9, 1: intermedio 16x16, 2: avanzado 32x32
    // Tablero
    public static Tablero tablero;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VistaTableroCronometro a = new VistaTableroCronometro();
                a.setVisible(true);
                a.setSize(720, 720);

            }
        });
        /*
         * tablero.initTablero(); tablero.printTablero();
         */
    }

}
