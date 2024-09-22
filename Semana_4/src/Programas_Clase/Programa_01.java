/*  1.- Crear un programa en Java que permita ingresar dos números enteros y una opción del (1,2,3,4), realizar una operación aritmética de suma, resta, multiplicación y división.
Visualizar el resultado de dicha operación. */

package Programas_Clase;

import java.util.Scanner;


public class Programa_01 {

    public static void main(String[] args) {
        
        //declarar variables
        int opcion;
        Double numero1, numero2, resultado;
        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese un numero: ");
        numero1 = lectura.nextDouble();
        
        System.out.print("Ingrese otro numero: ");
        numero2 = lectura.nextDouble();
        
        //Muestra de opciones
        System.out.println("\tSeleccione una opcion");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        opcion = lectura.nextInt();
        
        //Depende de la opción que elige el usuario, desarrollar
        switch (opcion) {
            case 1:
                
                resultado = numero1 + numero2;
                System.out.println("La suma es: "+resultado);
                break;
                
            case 2:
                resultado = numero1-numero2;
                System.out.println("La resta es: " + resultado);
                break;
                
            case 3:
                resultado=numero1 * numero2;
                System.out.println("La multiplicacion es: "+resultado);
                break;
                
            case 4: 
                resultado = numero1/numero2;
                System.out.println("La division es: " + resultado);
                break;
                
            default:
                System.out.println("Opción incorrecta");;
        }
        
    }

}
