/*  (Utilizar estructuras condicionales – if).

Crear un programa en Java que permita registrar cinco sueldos de empleados, Visualizar el total, promedio y sueldo menor.

     Ejemplo:
     sueldo1:3500
     sueldo2:2800
     sueldo3:4500
     sueldo4:5000
     sueldo5:1025

Resultados:
totalsueldo:16825
promediosueldo:3365
menor=1025
*/
package Programas;

import java.util.Scanner;


public class Pregunta3 {
    
    public static void main(String[] args){
        
        //Declarar variables
        int sueldo1, sueldo2, sueldo3, sueldo4, sueldo5, sueldoTotal, promedio, sueldoMenor;
        
        Scanner lectura = new Scanner(System.in);
        
        //Entradad e datos
        System.out.print("Ingrese el primer sueldo: ");
        sueldo1 = lectura.nextInt();
        
        System.out.print("Ingrese el segundo sueldo: ");
        sueldo2 =lectura.nextInt();
        
        System.out.print("Ingrese el tercer sueldo: ");
        sueldo3 = lectura.nextInt();
        
        System.out.print("Ingrese el cuarto sueldo: ");
        sueldo4 = lectura.nextInt();
        
        System.out.print("Ingrese el quiento sueldo: ");
        sueldo5 = lectura.nextInt();
        
        //Calcular datos
        sueldoTotal = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        
        promedio = sueldoTotal / 5;
        
        //Calcular el sueldo menor
        sueldoMenor = sueldo1;
        
        if (sueldo2 < sueldoMenor) {
            sueldoMenor = sueldo2;
        }
        if(sueldo3 < sueldoMenor){
            sueldoMenor = sueldo3;
        }
        if(sueldo4 < sueldoMenor){
            sueldoMenor = sueldo4;
        }
        if(sueldo5 < sueldoMenor){
        sueldoMenor = sueldo5;
    }
        //Salida de datos
        System.out.println("El sueldo total es: " + sueldoTotal);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El sueldo menor es: " + sueldoMenor);
        
        
    }

}