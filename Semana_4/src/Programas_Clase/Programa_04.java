/*  4.-Diseñar un programa que permita ingresar un número entero (1-12). Determinar el nombre de la estación del año.   */

package Programas_Clase;

import java.util.Scanner;


public class Programa_04 {
    
    public static void main(String[] args){
        
        //daclarar variables
        int numero;
        String estacion="";
        
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese un numero del 1 al 12: ");
        numero = lectura.nextInt();
        
        switch(numero){
            
            case 1, 2, 3:
                estacion="Verano";
                break;
            
            case 4, 5,6:
                estacion="Otoño";
                break;
                
            case 7, 8, 9:
                estacion="Invierno";
                break;
                
            case 10, 11, 12:
                estacion="Primavera";
                break;
                
            default:
                System.out.print("Numero incorrrecto");
        }
        
        //salida de datos
        System.out.println(estacion);
    }
    

}
