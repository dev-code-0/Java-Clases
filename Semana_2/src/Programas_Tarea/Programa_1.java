/*
 Calcular la raiz cuadrada de un número.
 */

package Programas_Tarea;

import java.util.Scanner;
import java.lang.Math;


public class Programa_1 {
    
    public static void main (String[] args){
        
        double numero, raizCuadrada; //Declarar variables
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        numero = lectura.nextDouble();//Ingresa el número y lo guarda en la variable "numero"
        
        raizCuadrada= Math.sqrt(numero); //Calcula la raíz cuadrada del número ingresado
        
        System.out.println("La raíz cuadrada del número es: " + raizCuadrada);//Imprime el resultado
        
    }

}
