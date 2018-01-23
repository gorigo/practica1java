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
 * 6. Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y
 *mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3
 *de la B, etc. 
 */
public class Ejercicio6 {
    int lista1[] = new int[12];
    int lista2[] = new int[12];
    int lista3[] = new int[24];
    int count;
    int countLista1 = 0;
    int countLista2 = 0;
    int countLista3 = 0;
    Scanner entrada = new Scanner(System.in);
    int numero;
    
    public void init() {
        System.out.println("Escribe 12 números");
        for (int i = 0; i<lista1.length;i++) {
            System.out.println("Introduce un número:");
            numero = entrada.nextInt();
            lista1[i] = numero;
        }
        System.out.println("Escribe 12 números más");
        for (int i=0; i<lista2.length;i++) {
            System.out.println("Introduce un número:");
            numero = entrada.nextInt();
            lista2[i] = numero;
        }
        }
    public void imprimir() {
        for (count = 0;count<21;count+=1) {
            if(count==0 || count==1 || count==2 ||count==6 || count==7 || count==8 || count==12 || count==13 ||count==14 || count==18 || count==19 ||count==20) {
                    lista3[countLista3] = lista1[countLista1];
                    countLista1+=1;
                    countLista3+=1;
            
        }
            else if(count==3 || count==4 || count==5 ||count==9 || count==10 || count==11 || count==15 || count==16 ||count==17 || count==21 || count==22 || count==23 ) {
                    lista3[countLista3] = lista2[countLista2];
                    countLista2+=1;
                    countLista3+=1;
            }
        }
        System.out.println("La lista definitiva es la siguiente: ");
        for (int i=0;i<lista3.length;i++)
        System.out.print(lista3[i]+",");
    }
    
}
