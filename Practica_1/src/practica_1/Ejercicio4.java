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
 * 4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
 * último, el segundo, el penúltimo, el tercero, etc. 
 */
public class Ejercicio4 {
    int lista1[] = new int[5];
    int lista2[] = new int[5];
    Scanner entrada = new Scanner(System.in);
    int numero;
    int count;
    int countLista1 = 0;
    int countLista2 = 4;
    
    public void init() {
        System.out.println("Escribe 10 números");
        for (int i = 0; i<lista1.length;i++) {
            System.out.println("Introduce un número:");
            numero = entrada.nextInt();
            lista1[i] = numero;
        }
        for (int i = 0; i<lista2.length;i++) {
            System.out.println("Introduce un número:");
            numero = entrada.nextInt();
            lista2[i] = numero;
        }
    
    }
    public void imprimir() {
        for (count = 0;count<11;count+=1) {
            if(count==0 || count==3 || count==5 ||count==7 || count==9) {
                    System.out.print(lista1[countLista1]+",");
                    countLista1+=1;
            
        }
            else if(count==2 || count==4 || count==6 ||count==8 || count==10) {
                    System.out.print(lista2[countLista2]+",");
                    countLista2-=1;
            
        }
            
        }
    }
}
