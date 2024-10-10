/*  Tabala de multiplicar   */

package Programas_Tarea;

import java.util.Scanner;

public class Programa_03 {

    public static void main (String[] args){
        
        int numero;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese un numero para desarrollar una tabla de multiplicar: ");
        numero = lectura.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
    }

}
