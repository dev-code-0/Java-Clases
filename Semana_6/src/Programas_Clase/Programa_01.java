/*  Crear un programa que nos permita ingresar una cantidad. Visualizar el número de digitos de la cantidad ingresada
    ejemplo:
    cantidad = 1234
    resultado : cantidad =4*/  

package Programas_Clase;

import java.util.Scanner;

public class Programa_01 {

    public static void main(String[] args) {
        
        //Declarar variables
        int numero, digitos;
        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese la un numero alto: ");
        numero = lectura.nextInt();
        
        //Proceso de datos
        digitos = 0;
        while(numero >0){
            
            //variable contador
            digitos ++;
            numero =numero/ 10;
                        
        }
        
        //Salida de datos
        System.out.println("La cantidad de digitos del número es: " + digitos);
        
    }
    
}

