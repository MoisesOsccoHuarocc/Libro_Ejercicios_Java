/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_02_alg;
import java.util.Scanner;
/**
 *
 * @author Coms-Lap
 */
public class EJEMPLO_02_ALG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0; //contadores
        int i;
       
        //Leemos los valores por teclado y los guardamos en el array                                              
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
  
        //se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
  
        //mostrar resultados
        System.out.println("Positivos: " + pos);                                                                  
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
 
}
    
    

