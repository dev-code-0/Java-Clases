/*  2.	Crear un programa en Java que permita almacenar en un arreglo de datos con cinco números ingresados y realizar una búsqueda mediante un número ingresado. Visualizar un mensaje indicando si el número existe o no existe. 

Ejemplo:
anumeros[5]=10 20 30 40 50
nbus=30
Resultado:
mensaje=”Si existe el número”
*/

package Programas_Clase;

import java.util.Scanner;

public class Programa_02 {

    public static void main (String[] args){
        
        //Declarar variables
        int [] anumeros = new int[5];
        String mensaje=" ";
        int numero, nbus;
        
        Scanner lectura = new Scanner(System.in);
        
        for (int i = 0; i < anumeros.length; i++) {
            System.out.print("Ingrese un numero " + (i+1)+": ");
            numero = lectura.nextInt();
            anumeros[i] = numero;
        }
        
        System.out.print("Ingresar numero a buscar: ");
        nbus=lectura.nextInt();
        
        for (int i = 0; i < anumeros.length; i++) {
            if (nbus==anumeros[i]) {
                mensaje = "Si existe el numero";
                break;
            }else{
                mensaje = "Numero no existe";
            }
        }
        System.out.println(mensaje);
    }

}
