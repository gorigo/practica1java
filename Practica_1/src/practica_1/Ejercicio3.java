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
 * 3. Leer 5 números por teclado y a continuación realizar la media de los 
 * números positivos, la media de los negativos y contar el número de ceros. 
 */
public class Ejercicio3 {
    float lista[] = new float[5];
    Scanner entrada = new Scanner(System.in);
    float numero;
    float positivos;
    float negativos;
    float totalNegativos;
    float totalPositivos;
    float totalCeros = 0;
    float totNeg;
    float totPos;
    int ceros;
    
    public void init() {
        System.out.println("Escribe 5 números");
        for (int i = 0; i<lista.length;i++) {
            System.out.println("Introduce un número:");
            numero = entrada.nextInt();
            lista[i] = numero;
        }
    
        for (int i = 0; i<lista.length;i++) {
            if (lista[i]<0) {
                negativos = negativos-lista[i];
                totNeg++;
            }
            else if(lista[i]>0) {
                positivos = positivos+lista[i];
                totPos++;   
            }
            else if(lista[i]==0) {
                ceros = +1;
                
            }
            
        }
        totalNegativos = negativos/totNeg;
        totalPositivos = positivos/totPos;
        }
    public void imprimir() {
        System.out.println("La media de números positivos es: " + totalPositivos);
        System.out.println("La media de números negativos es: -" + totalNegativos);
        System.out.println("La cantidad de ceros es: " + ceros);
    }
    }
        
    

