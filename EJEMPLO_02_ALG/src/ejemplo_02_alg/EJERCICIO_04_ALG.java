/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_02_alg;
import java.util.Scanner;
/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class EJERCICIO_04_ALG {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PROGRAMA QUE MUESTRA LA SUMA DE CADA FILA Y DE CADA COLUMNA DE LA MATRIZ 3X3");
        int[][] num = new int[3][3];
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese los numeros:");
        for (int i = 0; i < num.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num.length; j++) {//Dimensión Dos.
                  num[i][j]=numero.nextInt();              
            }            
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
        
        System.out.println("\nSuma Fila.");
        int suma=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                  suma += num[i][j];              
            }
            System.out.println("Fila " + i + " =" + suma);
            suma=0;
        }
        System.out.println("\nSuma Columna");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                  suma += num[j][i];              
            }
            System.out.println("Columna " + i + " =" + suma);
            suma=0;
        }
        
    }
}
