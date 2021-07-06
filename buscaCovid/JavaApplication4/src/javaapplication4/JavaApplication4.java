/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Cucho
 */
public class JavaApplication4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero(0);
        int dif;
        do {
            System.out.println("1- Facil");
            System.out.println("2- Normal");
            System.out.println("3- Dificil");
            System.out.print("Inserte nivel de dificultad: ");
            dif = sc.nextInt();
        } while (dif < 1 || dif > 3);
        switch(dif){
            case 1:
                tablero = new Tablero(9);
                break;
            case 2:
                tablero = new Tablero(16);
                break;
            case 3:
                tablero = new Tablero(32);
                break;
        }
        tablero.initTablero();
        tablero.printTablero();
    }
    
}
