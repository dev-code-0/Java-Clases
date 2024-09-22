/*  Crear un programa que permita ingresar un número (1-10) entero. Visualizar el número en romanos.    */

package Programas_Tarea;

import java.util.Scanner;


public class Programa_2 {
    
    public static void main(String[] args){
        
        int numero;
        String romano="";
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese un numero del 1 al 10: ");
        numero = lectura.nextInt();
        
        switch(numero){
            
            case 1:
                romano ="I";
                break;
                
            case 2:
                romano="II";
                break;
                
            case 3:
                romano ="III";
                break;
                
            case 4:
                romano="IV";
                break;
                
            case 5:
                romano="V";
                break;
                
            case 6:
                romano="VI";
                break;
                
            case 7:
                romano="VII";
                break;
                
            case 8:
                romano="VIII";
                break;
                
            case 9:
                romano="IX";
                break;
                
            case 10:
                romano="X";
                break;
                
            default:
                System.out.print("Tiene que ser un numero del 1 al 10");
        }
        
        System.out.println("El numero en romano es: "+romano);
        
    }

}
