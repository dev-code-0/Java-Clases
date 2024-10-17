/*  1.- Crear un programa en Java que permita registrar el peso de las n personas en un arreglo de datos. Visualizar el peso promedio de las personas. */

package Programas_Tareas;

import java.util.Scanner;

public class Programa_1 {

    public static void main (String[] args){
        
        Scanner lectura = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese la cantidad de personas: ");
        n = lectura.nextInt();
        
        
        double[] pesos = new double[n];
        double sumaPesos = 0;
        
        
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = lectura.nextDouble();
            sumaPesos += pesos[i];
        }
        double promedio = sumaPesos / n;
        
        System.out.println("\nPesos registrados:");
        for (int i = 0; i < n; i++) {
            System.out.println("Persona " + (i + 1) + ": " + pesos[i] + " kg");
        }
        
        System.out.printf("\nEl peso promedio es: "+promedio+" kg", promedio);
        
    }

}
