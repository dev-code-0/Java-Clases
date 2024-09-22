/*Crear un programa que permita registrar el nombre del empleado, cargo, ingreso y gasto mensual.Determinar el ahorro mensual y anual proyectado.
Fórmulas:
ahorro mensual: ingreso – gasto
ahorro anual     : ahorro mensual * 12

	 Datos de Prueba:
nombre de empleado: Pedro
ingresos del empleado: 5000
gastos del empleado: 3000

ahorro mensual: 2000.0
ahorro anual: 24000.0*/

package Programas_Clase;

import java.util.Scanner;

public class Programa_01 {

    
    public static void main(String[] args) {
        
        // Declaración de variables
        String empleado="";
        double ingreso, gastoMensual, ahorroMensual, ahorroAnual;
        
        //Crear un objeto scaner para leer la entrada de datos
        Scanner lectura = new Scanner(System.in);
        
        
        //Ingresa el nombre del empleado y lo guarda en el String "empleado"
        System.out.print("Nombre del empleado: ");
        empleado = lectura.nextLine();
        
        //Ingresa los ingresos del empleado y lo guarda en el double "ingreso"
        System.out.print("Ingresos del empleado: ");
        ingreso = lectura.nextDouble();
        
        //Ingresa los gastos mensuales del empleado y lo guarda en el double "gastoMensual"
        System.out.print("Gastos del empleado: ");
        gastoMensual=lectura.nextDouble();
        
        //Calcula el ahorro mensual
        ahorroMensual = ingreso - gastoMensual;
        
        //Cualcula el ahorro anual
        ahorroAnual = ahorroMensual*12;
        
        //Imprime el ahorro mensual
        System.out.println("El ahorro mensual es: " + ahorroMensual);
        
        //Imprime el ahorro anual
        System.out.println("El ahorro anual es: " + ahorroAnual);
    }

}
