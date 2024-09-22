/*  Crear un programa que permita ingresar un número (1-5) entero. Visualizar el número ingresado en palabra.   */

package Programas_Tarea;

import java.util.Scanner;


public class Programa_1 {
    
    public static void main(String[] args) {
        
        int numero;
        String palabra="";
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese un numero del 1 al 5: ");
        numero = lectura.nextInt();
        
        switch(numero){
            
            case 1:
                palabra ="Uno";
                break;
                
            case 2:
                palabra ="Dos";
                break;
                
            case 3:
                palabra="Tres";
                break;
                
            case 4:
                palabra="Cuatro";
                break;
                
            case 5:
                palabra="Cinco";
                break;
                
            default:
                System.out.print("Tiene que ser un numero del 1 al 5");
                
        }
        
        System.out.println("El numero es: "+palabra);
        
    }

}
