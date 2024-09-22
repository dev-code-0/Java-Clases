/*Crear un programa en Java que permita ingresar la 3 claificaciones de un alumno y visualizar el promedio y su condición*/

package Programas_Clase;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa_02 {
    
    public static void main(String[] args){
        
        //Declaración de variables
        double nota1, nota2, nota3, promedio;
        String condicion, nombre;
        
        Scanner lectura = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("##.##");
        
        //Entrada de datos
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = lectura.next();
        
        System.out.print("ingrese la primera nota: ");
        nota1 = lectura.nextDouble();
        
        System.out.print("Ingrese la segunda nota: ");
        nota2 = lectura.nextDouble();
        
        System.out.print("Ingrese la tercera nota: ");
        nota3 = lectura.nextDouble();
        
        promedio = (nota1+ nota2+ nota3)/3;
        
        if(promedio >=14){
            condicion = "aprobado";
        }
        else{
            condicion = "desaprobado";
        }
            
        
        //Salida de datos
        System.out.println("El promedio del alumno "+nombre+ " es: " + formato.format(promedio)+ " y esta: " + condicion);
    }

}
