package matriz.covid;

import java.util.Random;

/**
 *
 * @author Cucho
 */
public class RandomMatriz {

    private int filas, columnas;
    private int tablero[][] = new int[filas][columnas];

    Random r = new Random();

    public RandomMatriz(int filas, int columnas) {
        this.columnas = columnas;
        this.filas = filas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public int[][] randomVirus() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[r.nextInt() * filas][r.nextInt() * filas] = 4; // el 4 es para diferenciar el virus

            }
        }

        return tablero;
    }

    public int[][] randomTablero() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[filas][columnas] = (int) (r.nextInt() * 4); // toma numeros 3ntre el 3 y 1 para realizar la matriz, sin contar los virus     
            }
        }

        return tablero;
    }
}
