/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_03_alg;
import java.util.Random;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class EJEMPLO_03_ALG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PROGRAMA QUE SUMA LA DIAGONAL PRINCIPAL Y SECUNDARIA DE UNA MATRIZ 10x10");
        //Definimos la matriz	
                Random rd = new Random();
        int i;
        int sumDiagP = 0;
        int sumDiagS = 0;
        int[][] matriz = new int[10][10];
        // rellenamos matrices
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(19-10+1) + 10;
            }
        }
        // impresion de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        // Suma de Diagonal principal de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    sumDiagP += matriz[i][j];
                }
            }
        }
        // Suma de Diagonal secundaria de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == (matriz.length - 1)) {
                    sumDiagS += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal primaria es: " + sumDiagP);
        System.out.println("La suma de la diagonal secundaria es: " + sumDiagS);
        // Producto de las diagonales
        int prod = sumDiagP + sumDiagS;
        System.out.println("La suma de las diagonales es: " + prod);
 
    }
}
    

