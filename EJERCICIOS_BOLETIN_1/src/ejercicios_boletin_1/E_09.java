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
public class E_09 {
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir dos números y mostrarlos ordenados de mayor a menor.
        {
         Scanner sc = new Scanner(System.in);
         int n1,n2;

         System.out.print("Introduce un numero: ");
         n1=sc.nextInt();
         System.out.print("Introduce otro numero: ");
         n2=sc.nextInt();

         if(n1>n2)
         System.out.println(n1 + " y " + n2);
         else
         System.out.println(n2 + " y " + n1); 
 }
}
    
}
