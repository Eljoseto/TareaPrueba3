/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Tablero {
    int tablero[][];

    public Tablero(int tamaño) {
        this.tablero = new int[tamaño][tamaño];
    }

    public void initTablero() {
        int minas = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 0;
            }
        }
        do {
            int i = (int) (Math.random() * tablero.length);
            int j = (int) (Math.random() * tablero.length);
            if (tablero[i][j] == 0) {
                tablero[i][j] = 9;
                minas++;
            }
        } while (minas <= tablero.length);
        for (int i = 0; i < tablero.length; i++) {
            for (int z = 0; z < tablero.length; z++) {
                int num = 0;
                if (tablero[i][z] != 9) {
                    if (z - 1 >= 0) {
                        if (tablero[i][z - 1] == 9) {
                            num++;
                        }
                    }
                    if (i - 1 >= 0 && z - 1 >= 0) {
                        if (tablero[i - 1][z - 1] == 9) {
                            num++;
                        }
                    }
                    if (i + 1 < tablero.length && z - 1 >= 0) {
                        if (tablero[i + 1][z - 1] == 9) {
                            num++;
                        }
                    }
                    if (z + 1 < tablero.length) {
                        if (tablero[i][z + 1] == 9) {
                            num++;
                        }
                    }
                    if (i + 1 < tablero.length && z + 1 < tablero.length) {
                        if (tablero[i + 1][z + 1] == 9) {
                            num++;
                        }
                    }
                    if (i - 1 >= 0 && z + 1 < tablero.length) {
                        if (tablero[i - 1][z + 1] == 9) {
                            num++;
                        }
                    }
                    if (i + 1 < tablero.length) {
                        if (tablero[i + 1][z] == 9) {
                            num++;
                        }
                    }
                    if (i - 1 >= 0) {
                        if (tablero[i - 1][z] == 9) {
                            num++;
                        }
                    }
                    tablero[i][z] = num;
                }
            }
        }
    }

    public int[][] obtenerMatrizGenerada() {
        return tablero;
    }

    public void printTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
