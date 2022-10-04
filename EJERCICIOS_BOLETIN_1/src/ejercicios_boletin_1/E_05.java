/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_boletin_1;
import java.util.Scanner;
/**
 *
 * @author MOISES
 */
public class E_05 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir un número e indicar si es positivo o negativo.
        {
         Scanner sc = new Scanner(System.in);
         int num;
         System.out.print("Introduce un numero: ");
         num=sc.nextInt();

         if( num < 0)
         System.out.println("Negativo");
         else
         // suponemos que el 0 es positivo.
         System.out.println("Positivo");

    
}
    }
}
