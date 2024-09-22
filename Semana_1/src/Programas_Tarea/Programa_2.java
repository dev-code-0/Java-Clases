/*  2)	Crear un programa que permita registrar cinco sueldos de empleados, Determinar el total de sueldos y el sueldo promedio.

     Datos de Prueba:
     Sueldo 1:3500
     Sueldo 2:2800
     Sueldo 3:4500
     Sueldo 4:5000
     Sueldo 5:1025

Total de Sueldo:16,2825
Promedio de sueldo:3,365
*/

package Programas_Tarea;

import java.util.Scanner;

public class Programa_2 {
    
    public static void main(String[] args){
        
        //Declarar variables
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5, totalSueldo, sueldoPromedio;
        
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese el sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        
        System.out.print("Ingrese el segundo sueldo: ");
        sueldo2 = lectura.nextDouble();
        
        System.out.print("Ingrese el tercer sueldo: ");
        sueldo3 = lectura.nextDouble();
        
        System.out.print("Ingrese el cuarto sueldo: ");
        sueldo4 = lectura.nextDouble();
        
        System.out.print("Ingrese el quinto sueldo: ");
        sueldo5 = lectura.nextDouble();
        
        //Calcular datos
        totalSueldo = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        
        sueldoPromedio = totalSueldo / 5;
        
        //Salida de datos
        System.out.println("\tSueldos");
        System.out.println("El total de sueldos es: " + totalSueldo);
        System.out.println("El promedio de los sueldo es: " + sueldoPromedio);
        
        
    }

}
