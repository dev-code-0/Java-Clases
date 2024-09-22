/*  elavorar un ejercicio utilizando una estructura condicional multiple   */

//Escribe un programa que visualizar la temperatura ingresada por el usuario


/*si es < 15 es frio
s está 16 y 22 es calido
si es mayor de 22 es caliente*/


package Programas_Tarea;

import java.util.Scanner;

public class Programa_6 {
    
    public static void main(String[] arg){
        
        double temperatura;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura del clima en numero: ");
        temperatura = lectura.nextDouble();
        
        
       if(temperatura <=14){
           System.out.println("El clima es frio");
       } 
       else if(temperatura >= 15 && temperatura <=22){
           System.out.println("El clima es claido");
       } else{
           System.out.println("El clima está caliente");
       }
        
        
    }

}
