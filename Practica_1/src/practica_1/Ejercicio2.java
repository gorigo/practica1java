/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;
import java.util.Scanner;
/**
 *
 * @author Hal 9000
 * 2. Leer 5 números y mostrarlos en orden inverso al introducido. 
 */
public class Ejercicio2 {
    int lista[] = new int[5];
    Scanner entrada = new Scanner(System.in);
    int numero;
    public void init() {
        System.out.println("Escribe 5 números");
        for (int i = 0; i<lista.length;i++) {
            System.out.println("Introduce un número:");
            numero = entrada.nextInt();
            lista[i] = numero;
        }
        
    }
    public void imprimir(){
        System.out.println("Los números que has introducido son:");
        for(int i = 4;i>=0;i--){
            System.out.println(lista[i]);
        }
    }
}

