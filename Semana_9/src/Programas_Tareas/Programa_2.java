/*  2.- Crear un programa en Java que permita registrar el ingreso económico de las n personas en un arreglo de datos. Visualizar ingreso promedio, ingreso mayor de las personas.*/

package Programas_Tareas;

import java.util.Scanner;

public class Programa_2 {

    public static void main(String[] args){
        
        Scanner lectura = new Scanner(System.in);
        
        int n;
        
        System.out.print("Ingrese la cantidad de personas: ");
        n = lectura.nextInt();
        
        
        double[] ingresos = new double[n];
        double sumaIngresos = 0;
        double ingresoMayor = Double.MIN_VALUE;
        
         for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso económico de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble();
            sumaIngresos += ingresos[i];
            
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }
        
        double promedio = sumaIngresos / n;
        
        System.out.println("\nIngresos registrados:");
        for (int i = 0; i < n; i++) {
            System.out.printf("\nPersona " + (i + 1) + ": " + ingresos[i]);
        }
        
        System.out.printf("\nEl ingreso promedio es: " + promedio);
        System.out.printf("\nEl ingreso mayor es: " +ingresoMayor );
    }

}
