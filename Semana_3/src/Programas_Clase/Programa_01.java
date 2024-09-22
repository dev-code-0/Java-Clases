/*  utilizando condicionales simples    
    Crear un  programa que permita ingresar cuatro números enteros. Visualizar el número mayor.*/

package Programas_Clase;

import java.util.Scanner;
    
public class Programa_01 {

    public static void main(String[] args) {
        
        //Declarar variables
        int numero1, numero2, numero3, numero4, mayor;
        
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese el primer número: ");
        numero1= lectura.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = lectura.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        numero3 = lectura.nextInt();
        
        System.out.print("Ingrese el cuarto número: ");
        numero4 = lectura.nextInt();
        
        //Calcular el numero mayor
        mayor=numero1;
        
        if(numero2>mayor){
            mayor=numero2;
        }
        if(numero3 >mayor){
            mayor=numero3;
        }
        if(numero4>mayor){
            mayor=numero4;
        }
        
        //Salida de datos
        System.out.println("El número mayor es: " + mayor);
    }

}
