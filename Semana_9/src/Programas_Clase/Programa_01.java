/*  1.	Crear un programa en Java que permita registrar las edades de los n alumnos en un arreglo de datos. Visualizar la edad promedio. 

Por ejemplo:
n=5
edad1=18
edad2=18
edad3=42
edad4=24
edad5=35

Resultados:
pe=27.4
*/

package Programas_Clase;

import java.util.Scanner;

public class Programa_01 {

    public static void main(String[] args) {
        
        //Declarar variables
        int n, alumnos, edad;
        double promedioEdad, sumaEdades;//pe
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de alumnos: ");
        n = lectura.nextInt();
        
        int[] aedad=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar edad " + (i+1) + ":");
            edad = lectura.nextInt();
            aedad[i] = edad;
        }
        
        sumaEdades = 0.0;
        
        for (int i = 0; i < n; i++) {
            sumaEdades += aedad[i];
        }
        
        promedioEdad = sumaEdades/n;
        
        System.out.println("El promedio de edades es: "+ promedioEdad);
    }
    
}
