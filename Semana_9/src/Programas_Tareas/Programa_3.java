/*  3.- Crear un programa en Java que permita registrar las compras de los n personas en un arreglo de datos. Visualizar el total, promedio y compra mayor y menor.*/

package Programas_Tareas;

import java.util.Scanner;

public class Programa_3 {

    public static void main(String[] args){
        
        Scanner lectura = new Scanner(System.in);
        
        int n;
        
        System.out.print("Ingrese el numero de personas: ");
        n = lectura.nextInt();
        
        double[] compras = new double[n];
        double totalCompras = 0;
        double compraMayor = Double.MIN_VALUE;
        double compraMenor = Double.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextDouble();
            totalCompras += compras[i];
            
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        
        double promedio = totalCompras / n;
        
        System.out.println("\nCompras registradas:");
        for (int i = 0; i < n; i++) {
            System.out.printf("\nPersona " +(i + 1) + ": " +  compras[i]);
        }
        
        System.out.printf("\nEl total de compras es: "+ totalCompras);
        System.out.printf("\nEl promedio de compras es: " + promedio);
        System.out.printf("\nLa compra mayor es: " + compraMayor);
        System.out.printf("\nLa compra menor es: " + compraMenor);
        
        
    }

}
