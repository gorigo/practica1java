/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

/**
 *
 * @author Hal 9000
 * 
 */
import java.util.Scanner;

public class Practica_1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Selecciona el ejercicio que deseas ver:");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.init();
                ejercicio1.imprimir();
                break;
            case 2:
                Ejercicio2 ejercicio2 = new Ejercicio2();
                ejercicio2.init();
                ejercicio2.imprimir();
                break;
            case 3:
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.init();
                ejercicio3.imprimir();
                break;
            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.init();
                ejercicio4.imprimir();
                break;
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.init();
                ejercicio5.imprimir();
            case 6:
                Ejercicio6 ejercicio6 = new Ejercicio6();
                ejercicio6.init();
                ejercicio6.imprimir();
                break;
                
                
            
        }
        }
        
        
        
        
    }
    

