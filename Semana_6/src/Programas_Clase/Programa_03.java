/*  Crear un programa que permita ingresar una cantidad.
    Visualizar el dígito mayo, la cantidad de dígitos impares y la suma de digitos pares.*/

package Programas_Clase;

import java.util.Scanner;

public class Programa_03 {

    public static void main(String[] args){
        
        //Declarar variables
        int cantidad, digitoMayor, digitosImpares, suma, digitos,r;
        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.println("Ingrese un numero: ");
        cantidad = lectura.nextInt();
        
        digitosImpares = 0;
        suma = 0;
        digitoMayor = 0;
        
        while(cantidad > 0){
            
            digitos = cantidad % 10;
            if(digitos > digitoMayor){
                digitoMayor = digitos;
            }
            
            r = digitos %2;
            if(r == 0){
                suma =+ digitos;
            } else{
                digitosImpares ++;
            }
            
            cantidad = cantidad/10;
            
        }
        
        //Salida de datos
        System.out.println("El digito mayor es: " + digitoMayor);
        System.out.println("La cantidad de dígitos impares es: " + digitosImpares);
        System.out.println("La suma de los digitos pares es: " + suma);
        
    }

}
