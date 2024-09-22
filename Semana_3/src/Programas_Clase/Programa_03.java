/*Crear un programa en Java que permita ingresar dos números y un tipo de opercación aritmetica (+,-,*,/) visualizar el resultado de la operacion aitmética.*/

package Programas_Clase;

import java.util.Scanner;

public class Programa_03 {
    
    public static void main(String[] args){
        
        //Declarar variables
        double numero1, numero2, resultado=0;
        String operacion;
        
        
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese el primero numero: ");
        numero1 = lectura.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        numero2 = lectura.nextDouble();
        
        System.out.print("Ingrese que operación descea realizar(suma, resta, multiplicacion, division): ");
        operacion = lectura.next();
        
        
        //Calcular el tipo de operación
        if (operacion.equals("suma")) {
            resultado = numero1 + numero2;
            System.out.println("La suma es: " + resultado);
        } 
        else if (operacion.equals("resta")) {
            resultado = numero1 - numero2;
            System.out.println("La resta es: " + resultado);
        } 
        else if (operacion.equals("multiplicacion")) {
            resultado = numero1 * numero2;
            System.out.println("La multiplicación es: " + resultado);            
        } 
        else if (operacion.equals("division")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.println("La división es: " + resultado);
            }if(numero2==0) {
                System.out.println("El número no se puede dividir entre 0");
            }
        }
        else{
            System.out.println("Operacion ingresada no reconocida");
        }
         
    }

}
