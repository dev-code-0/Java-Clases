/*   levorar un ejercicio utilizando una estructura de condicional doble  */

//Crea un programa que permita que el usuario ingrese si tiene licencia de conducir o no y según lo ingresado visualizar si está permitido conducir o no.

package Programas_Tarea;

import java.util.Scanner;

public class Programa_5 {
    
    public static void main(String[] args){
        
        String licencia;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Usted tiene lecencia de conducir? ");
        licencia = lectura.next();
        
        if(licencia.equalsIgnoreCase("si")){
            System.out.println("Usted está permitido conducir");
        } else{
            System.out.println("Usted no está permitido conducir");
        }
        
        
    }

}
