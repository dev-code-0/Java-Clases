/*  elvorar ejercicios utilizando una estructura de condicional simple  */

//Crea un programa que permita que el usuario ingrese su edad y verificar si adolecente, joven, adulto o persona mayor

package Programas_Tarea;

import java.util.Scanner;

public class Programa_4 {
    
    public static void main(String[] args){
        
        int edad;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        edad = lectura.nextInt();
        
        if(edad <= 11){
            System.out.println("Eres un niño");
        }
        if (edad >= 12 && edad<=18) {
            System.out.println("Eres un adolecente");
        }
        if (edad >=19 && edad <=30) {
            System.out.println("Usted es una persona joven");
        }
        if(edad >=31 && edad <=60){
            System.out.println("Usted es una persona adulta");
        }
        if(edad >= 61){
            System.out.println("Usted es una persona mayor");
        }
        
    }

}
