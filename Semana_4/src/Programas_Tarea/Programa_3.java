/*  Crear un programa que permita ingresar un número (1-6) entero. Visualizar el número en inglés.  */

package Programas_Tarea;

import java.util.Scanner;


public class Programa_3 {
    
    public static void main(String[] args){
        
        int numero;
        String numIngles="";
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese un numero del 1 al 6: ");
        numero = lectura.nextInt();
        
        switch(numero){
            
            case 1:
                numIngles="One";
                break;
                
            case 2:
                numIngles="Two";
                break;
                
            case 3:
                numIngles="Three";
                break;
                
            case 4:
                numIngles="Four";
                break;
                
            case 5:
                numIngles="Five";
                break;
                
            case 6:
                numIngles="Six";
                break;
                
                default:
                System.out.print("Tiene que ser un numero del 1 al 6");
                
        }
        
        System.out.println("El numero en ingles es: " + numIngles);
        
    }

}
