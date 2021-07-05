package Logica;

import Vista.*;

public class principal {
    // Creacion de los frame
    public static dificultad v_dificultad = new dificultad();
    // Juego
    public static ventana_juego v_juego = new ventana_juego();
    // Dificultad
    public static int dificultad_int = 0; // 0: principiante 9x9, 1: intermedio 16x16, 2: avanzado 32x32

    public static void main(String[] args) {
        v_juego.setVisible(true);
    }

}
