/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_boletin_1;
import java.util.Scanner;
/**
 *
 * @author MOISES
 */
public class EJERCICIOS_BOLETIN_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
        // debe indicarlo
        {
             double a,b,c; // coeficientes ax^2+bx+c=0
             double x1,x2,d; // soluciones y determinante
             Scanner sc = new Scanner(System.in);
             System.out.println("Introduzca primer coeficiente (a):");
             a= sc.nextDouble();
             System.out.println("Introduzca segundo coeficiente: (b):");
             b= sc.nextDouble();
             System.out.println("Introduzca tercer coeficiente: (c):");
             c= sc.nextDouble();
             // calculamos el determinante
             d=((b*b)-4*a*c);
             if(d<0)
             System.out.println("No existen soluciones reales");
             else{
             // queda confirmar que a sea distinto de 0.

             // si a=0 nos encontramos una división por cero.

             x1=(-b+Math.sqrt(d))/(2*a);
             x2=(-b-Math.sqrt(d))/(2*a);
             System.out.println("Solucion: " + x1);
             System.out.println("Solucion: " + x2);
 }
 }
}
}

    
    

