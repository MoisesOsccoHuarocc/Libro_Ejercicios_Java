/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_03_alg;

import java.util.Random;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class EJERCICIO_03 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PROGRAMA QUE SUMA TODAS LAS FILAS DE UNA MATRIZ 10x10");
        //Definimos la matriz	
        Random rd = new Random();
        int i;
        int[][] matriz = new int[10][10];
        // rellenamos matrices
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(19 - 10 + 1) + 10;
            }
        }
        // impresion de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        // Suma de filas
        for (i = 0; i < matriz.length; i++) {
            int sumafil = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumafil += matriz[i][j];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es: " + sumafil);
        }
    }
}
    
    
   

