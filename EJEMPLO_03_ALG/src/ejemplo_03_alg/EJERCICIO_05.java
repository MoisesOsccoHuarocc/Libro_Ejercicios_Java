/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_03_alg;

import java.util.Arrays;


/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class EJERCICIO_05 {
    public static void main(String[] args) {
        // TODO code application logic here       
        System.out.println("PROGRAMA QUE SUMA TODAS LAS COLUMNAS IMPARES DE UNA MATRIZ 10x10");
        //Definimos la matriz	
        int[][]matriz = new int[10][10];
        int f=0;
        int j=0;
        int suma=0;
        int resta =0;
        int b =1;
        for (f=0 ; f < matriz.length ; f++){
        for (j=0 ; j < matriz.length ; j++){

matriz[f][j]=(int)(Math.random()*100+1);

}
}
for (f=0 ; f < matriz.length ; f++){
System.out.println(Arrays.toString (matriz [f]));

}
for (int i = 0; i < 10; i++) {
    if (i%2!=0) {
        
    
       
    
resta=0;
for (j=0 ; j < matriz.length ; j++){
    
resta = resta + matriz[i][j];
    
}
System.out.println("La suma de la columna "+i+" es:"+resta);

}
    }
    }
    
}