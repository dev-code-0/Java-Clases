/*  3.-Diseñar un programa que permita ingresar un número entero (1-12). Determinar el nombre del mes del año.  */

package Programas_Clase;

import java.util.Scanner;

public class Programa_03 {
    
    public static void main(String[] args){
        
        //Declarar variables
        int numero;
        String mes="";
        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese un numero del 1 al 12: ");
        numero = lectura.nextInt();
        
        switch(numero){
            case 1:
                mes="Enero";
                break;
                
            case 2:
                mes="Febrero";
                break;
                
            case 3:
                mes="Marzo";
                break;
                
            case 4:
                mes="Abril";
                break;
                
            case 5:
                mes="Mayo";
                break;
                
            case 6:
                mes="Junio";
                break;
                
            case 7:
                mes="Julio";
                break;
                
            case 8:
                mes="Agosto";
                break;
                
            case 9:
                mes="Septimebre";
                break;
                
            case 10:
                mes="Octubre";
                break;
                
            case 11:
                mes="Noviembre";
                break;
                
            case 12:
                mes="Diciembre";
                break;
                
            default:
                System.out.println("Numero incorrecto");
        }
        
        //Salida d datos
        System.out.println(mes);
        
    }

}
