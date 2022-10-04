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
public class E_10 {
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir tres números y mostrarlos ordenados de mayor a menor.

        {
         Scanner sc = new Scanner(System.in);
         int a,b,c;
         System.out.print("Introduzca primer numero: ");
         a=sc.nextInt();
         System.out.print("Introduzca segundo numero: ");
         b=sc.nextInt();
         System.out.print("Introduzca tercer numero: ");
         c=sc.nextInt();
         if(a>b && b>c)
         System.out.println( a+", "+b+", "+c);
             else{
             if(a>c && c>b)
             System.out.println(a+", "+c+", "+b);

                 else{
                 if(b>a && a>c)
                 System.out.println(b+", "+a+", "+c);
                     else{
                     if(b>c && c>a) 
                     System.out.println(b+", "+c+", "+a);
                         else{
                         if(c>a && a>b)
                         System.out.println(c+", "+a+", "+b);
                             else{
                             if(c>b && b>a)
                             System.out.println(c+", "+b+", "+a);
                             }
                         }
                      }
                 }
             }
         }
}
    
}
