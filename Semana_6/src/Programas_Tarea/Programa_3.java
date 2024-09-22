/*  La raiz cuadrada entera de un numero    */

package Programas_Tarea;

import java.util.Scanner;

public class Programa_3 {

    public static void main(String[] args){
        
        //Declarar variables
        int numero, raiz=0;
        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese un numero: ");
        numero = lectura.nextInt();
        
        //Redondea la raiz cuadrada
        while (raiz * raiz <= numero) {            
            raiz++;
        }
        
        //Salida de datos
        System.out.println("La raiz cuadrada entera de " + numero +" es: " + (raiz-1));
    }

}
