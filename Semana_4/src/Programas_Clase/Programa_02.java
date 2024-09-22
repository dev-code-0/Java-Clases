/*  2.-Crear un programa en Java que permita ingresar un número entero (1-7). Visualizar el nombre del día de la semana */

package Programas_Clase;

import java.util.Scanner;

public class Programa_02 {
    
    public static void main(String[] args){
        
        //Declarar variables
        int numero;
        String dia="";
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese un numero del 1 al 7: ");
        numero = lectura.nextInt();
               
        //Elegir día de la semana
        switch(numero){
            
            case 1:
                dia="Lunes";
                break;
                
            case 2:
                dia="Martes";
                break;
                
            case 3:
                dia="Miercoles";
                break;
            
            case 4:
                dia="Jueves";
                break;
            
            case 5:
                dia="Viernes";
                break;
                
            case 6:
                dia="Sabado";
                break;
                
            case 7:
                dia="Domingo";
                break;
                
            default:
                System.out.println("Numero incorrecto");
        }
        
        //Salida de datos
        System.out.println("El dia es: "+dia);
        
    }

}
