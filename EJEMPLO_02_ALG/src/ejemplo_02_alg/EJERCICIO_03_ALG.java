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
public class EJERCICIO_03_ALG {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PROGRAMA QUE MUESTRA LA MEDIA DE 10 NUMEROS ENTEROS");
        Scanner sc = new Scanner(System.in);
        int[]numeros = new int[10];
        int pos = 0, neg = 0; //contadores para pos y neg
        int i;
        double sumaPos = 0, sumaNeg = 0; //suma pos y neg
        //Leemos los valores por teclado y guardamos en el array
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
        //se reccorre el array para sumar positivos y negativos
        System.out.println("Lecutra de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) { //sumar pos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) { //sumar neg
                sumaNeg += numeros[i];
                neg++;
            }
        }
        //mostrar resultados
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
    
}
}
