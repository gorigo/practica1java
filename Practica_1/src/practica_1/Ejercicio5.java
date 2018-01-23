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
 * 5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de
 *la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. 
 */
public class Ejercicio5 {
    int lista1[] = new int[10];
    int lista2[] = new int[10];
    int lista3[] = new int[20];
    int count;
    int countLista1 = 0;
    int countLista2 = 0;
    Scanner entrada = new Scanner(System.in);
    int numero;
    
    public void init() {
        System.out.println("Escribe 10 números");
        for (int i = 0; i<lista1.length;i++) {
            System.out.println("Introduce un número:");
            numero = entrada.nextInt();
            lista1[i] = numero;
        }
        System.out.println("Escribe 10 números más");
        for (int i=0; i<lista2.length;i++) {
            System.out.println("Introduce un número:");
            numero = entrada.nextInt();
            lista2[i] = numero;
        }
        }
    public void imprimir() {
        for (count = 0;count<21;count+=1) {
            if(count==0 || count==3 || count==5 ||count==7 || count==9 || count==11 || count==13 || count==15 ||count==17 || count==19) {
                    System.out.print(lista1[countLista1]+",");
                    countLista1+=1;
            
        }
            else if(count==2 || count==4 || count==6 ||count==8 || count==10 || count==12 || count==14 || count==16 ||count==18 || count==20 ) {
                    System.out.print(lista2[countLista2]+",");
                    countLista2+=1;
            }
        }
    }
}


        
