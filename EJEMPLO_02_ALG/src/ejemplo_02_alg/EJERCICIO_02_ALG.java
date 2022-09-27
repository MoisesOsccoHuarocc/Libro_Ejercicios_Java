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
public class EJERCICIO_02_ALG {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PROGRAMA QUE CALCULA LA ALTURA MEDIA DE N PERSONAS");
        Scanner sc = new Scanner (System.in);
        int i, N;
        int contMas = 0, contMenos = 0;
        double media = 0;
        // Leer el número de personas
        do {
            System.out.println("Numero de personas: ");
            N = sc.nextInt();
        } while (N <= 0);
        // Se crea el array de tamaño N
        double[] alto = new double[N];
        // Leer alturas
        System.out.println("Lectura de altura de las personas: ");
        for (i = 0; i < N; i++) {
            System.out.print("personas " + (i + 1) + " = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i]; // se suma la estatura leida para calcular la media
        }
        // calcular la media
        media = media / N;
        // reccoremos el array para ver cuantos hay mas altos que la media y cuantos mas
        // bajos
        for (i = 0; i < alto.length; i++) {
            if (alto[i] > media) { //si la estatura es mayor que la media
                contMas++;
            } else if (alto[i] < media) { //si es menor
                contMenos++;
            }
        }
        //mostrar resultados
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura superior a la media: " + contMas);
        System.out.println("Personas con estatura inferior a la media: " + contMenos);
    
}
}
