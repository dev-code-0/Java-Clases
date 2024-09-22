/*  Crear un programa que permita ingresar un número (1,2,3,4,6,12) entero. Visualizar el nombre del periodo anual   */

package Programas_Tarea;

import java.util.Scanner;

public class Programa_4 {
    
    public static void main(String[] args){
        
        int numero;
        String periodo="";
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese un numero (1, 2, 3, 4, 6, 12): ");
        numero = lectura.nextInt();
        
        switch(numero){
            
            case 1:
                periodo="Mensual";
                break;
                
            case 2:
                periodo="Bimestral";
                break;
                
            case 3:
                periodo="Trimestral";
                break;
                
            case 4:
                periodo="Cuatrimestral";
                break;
                
            case 6:
                periodo="Semestral";
                break;
               
            case 12:
                periodo="Semestral";
                break;
                
            default:
                System.out.println("Numero ingresado es incorrecto");
            
        }
        
        System.out.println(periodo);        
        
    }

}
