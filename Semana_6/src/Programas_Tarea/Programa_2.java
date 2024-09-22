/*  verificar si un número es primo */

package Programas_Tarea;

import java.util.Scanner;

public class Programa_2 {

    public static void main(String[] args){
        
        //Declarar variables
        int numero, divisor=2;
        boolean primo = true;
        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.println("Ingresar un número: ");
        numero = lectura.nextInt();
        
        //Si el divisor es <= a la mitad del numero se ejecutara el ciclo
        while (divisor <= numero /2) {
            
            //El numeor no es primo si hay un divisor que de 0
            if (numero % divisor ==0) {
                
                //cambia a falso
                primo = false;
                
                //termina el ciclo
                break;
                
            }
            
            //aumenta el divisor
            divisor++;
            
        }
        
        //el primo y numero es mayor a 1, entoces es número primo
        if (primo && numero > 1) {
            System.out.println(numero + " es primo");
        } else {
            
            //si no no es numero primo
            System.out.println(numero + " no es primo");
        }
        
    }

}
