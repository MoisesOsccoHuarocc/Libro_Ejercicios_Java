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
public class E_02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir el radio de un círculo y calcular su área. A=PI*r^2.
        {
         Scanner sc = new Scanner(System.in);
       
         double a,r; // área y radio
         System.out.print("Introduce el radio de un circulo: ");
         r= sc.nextDouble();
         a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)

         System.out.println("El area de una circunferencia de radio " + r+ " es: " + a);
 
 }
}    
}
