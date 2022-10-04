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
public class E_03 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir el radio de una circunferencia y calcular su longitud.
        {
         Scanner sc = new Scanner(System.in);
         double l,r; // longitud y radio
         System.out.print("Introduce el radio de una circunferencia: ");
         r= sc.nextDouble();
         l=2*Math.PI*r;

         System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    
}
    }
}
