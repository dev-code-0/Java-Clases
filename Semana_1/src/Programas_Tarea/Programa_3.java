/*  3)	Crear un programa que permita registrar el nombre del empleado, cargo, ingreso y gasto mensual de un empleado. Determinar el ahorro mensual, bimestral, semestral y anual.

         Datos de Prueba:
    nombre de empleado: Jorge
    ingresos del empleado: 4000
    gastos del empleado: 1500
    ahorro mensual: 2500
    ahorro bimestral: 5000
    ahorro semestral: 15000
    ahorro anual: 30000
*/

package Programas_Tarea;

import java.util.Scanner;

public class Programa_3 {
    
    public static void main(String args[]){
        
        //Declarar variables
        String nombre, cargo;
        double ingreso, gastoMensual;
        double  ahorroMensual, ahorroBimestral, ahorroSemestral, ahorroAnual;
        
        Scanner  lectura = new Scanner (System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = lectura.next();
        
        System.out.print("Ingrese el cargo del empleado: ");
        cargo = lectura.next();
        
        System.out.print("Ingrese los ingresos mensuales: ");
        ingreso = lectura.nextDouble();
        
        System.out.print("ingrese los gastos mensuales: ");
        gastoMensual = lectura.nextDouble();
        
        //Calculo de datos
        ahorroMensual = ingreso - gastoMensual;
        ahorroBimestral = ahorroMensual * 2;
        ahorroSemestral = ahorroMensual * 6;
        ahorroAnual = ahorroMensual * 12;
        
        //Salida de datos
        System.out.println("Nombre del Empleado: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Ahorro Mensual: " + ahorroMensual);
        System.out.println("Ahorro Bimestral: " + ahorroBimestral);
        System.out.println("Ahorro Semestral: " + ahorroSemestral);
        System.out.println("Ahorro Anual: " + ahorroAnual);
    }

}
