/* Elevar a la potencia un número */

package Programas_Tarea;

import java.util.Scanner;
import java.lang.Math;

public class Programa_3 {
    
    public static void main(String[] args){
        
        double numBase, resultado; //Declarando variables
        int numExponente;//Declarando variables
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese el número base: ");
        numBase = lectura.nextDouble(); //Ingresa el número base y lo guarda en la variable "numBase"
        
        System.out.print("Ingrese el número exponencial: ");
        numExponente = lectura.nextInt();//Ingresa el número exponencial y lo guarda en la variable "numExponente"
        
        resultado = Math.pow(numBase, numExponente);//Calcula el resultado elevando el primer número por el segundo número
        
        System.out.println("El número " + numBase + " elevado al exponete " + numExponente + " es: " + resultado);//Imprime el resultado
        
    }

}
