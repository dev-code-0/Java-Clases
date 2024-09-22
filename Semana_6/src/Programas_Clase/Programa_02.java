/*  Crear un programa que permita ingresar una cantidad.
    visualizar la cantidad invertida.
    ejemplo:
    caditad=123
    cantidadInvertida=321*/

package Programas_Clase;

import java.util.Scanner;

public class Programa_02 {
    
    public static void main(String[] args){
        
        //Declarar variables
        int numero, numeroInvertido, digitos;
        
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.println("Ingrese un número mayor: ");
        numero = lectura.nextInt();
        
        //Calcular numero invertido
        numeroInvertido = 0;
        digitos=0;
        
        while(numero > 0){
            digitos = numero%10;            
            numeroInvertido = (numeroInvertido * 10) + digitos;        
            numero = numero/10;
        }
        
        //Salida de datos
        System.out.println("La cantidad invertida es: " + numeroInvertido);      
                
    }
}
