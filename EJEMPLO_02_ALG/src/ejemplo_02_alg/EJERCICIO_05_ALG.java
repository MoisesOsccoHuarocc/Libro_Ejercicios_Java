/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_02_alg;
import java.util.Arrays;
/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class EJERCICIO_05_ALG {
    public static void main(String[] args) {
        System.out.println("PROGRAMA QUE MUESTRA LA DIAGONAL PRINCIPAL RELLENA DE 1 DE UNA MATRIZ DE 7x7");
        int[][] matriz = new int[7][7];
        int f;
        
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el número de fila es
        //igual que el número de columna:  matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for (f=0 ; f < matriz.length ; f++){
            matriz[f][f]=1;                           
        }
        
        //Muestro las filas de la matriz haciendo uso de la libreria "Arrays"
        for (f=0 ; f < matriz.length ; f++){
            System.out.println(Arrays.toString(matriz[f]));
        }
    }
}
    

