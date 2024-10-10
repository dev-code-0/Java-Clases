/*  Suma de los primeros numeros    */

package Programas_Tarea;

import java.util.Scanner;

public class Programa_02 {

    public static void main(String[] args) {
        
        int n, suma=0;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        n = lectura.nextInt();
        
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + n + " números es: " + suma);
    }
    
}
