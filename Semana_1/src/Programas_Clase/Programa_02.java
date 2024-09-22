/*6.	Crear un programa que permita ingresar el nombre del empleado, horas trabajadas y su tarifa por hora.   
Determinar el sueldo bruto, descuento (seguro de pensión onp) y el sueldo neto a pagar neto de un empleado.
Fórmulas:
sueldo bruto: horas trabajadas x tarifa por hora 
descuento   : sueldo bruto * 0.13
sueldo neto:  sueldo bruto - descuento

     Datos de Prueba:
     nombre de empleado: Juan
     horas trabajadas: 198
     tarifa por hora: 50

     sueldo bruto: 9900.0
     descuento: 1287.0
     sueldo Neto: 8613.0   

*/

//Paquete de datos
package Programas_Clase;


import java.util.Scanner;

public class Programa_02 {
    public static void main(String args[]){

        //Declaración de variables
        String nombreEmpleado;
        double horasTrabajadas, tarifaPorHora, sueldoBruto, descuento, sueldoNetoPagar;
        
        //Crear un objeto scaner para leer la entrada de datos
        Scanner lectura = new Scanner(System.in);
        
        //Ingresa el nombre del empleado y lo guarda en el String "empleado"
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado= lectura.next();
        
        //Ingresa las horas trabajadas del empleado y las almacena
        System.out.print("Ingrese las horas trabajadas del empleado: ");
        horasTrabajadas= lectura.nextDouble();
        
        //Ingresa la tarifa por hora del empleado
        System.out.print("Ingrese la tarifa por hora: ");
        tarifaPorHora= lectura.nextDouble();
        
        //Calcula el sueldo bruto
        sueldoBruto = horasTrabajadas * tarifaPorHora;
        
        //Calcula el descuento
        descuento = sueldoBruto *0.13;
        
        //Cualcula el sueldo neto a pagar
        sueldoNetoPagar = sueldoBruto - descuento;
        
        //Imprime todo lo solicitado
        System.out.println("El sueldo bruto es: " + sueldoBruto);
        System.out.println("El descuento es: " + descuento);
        System.out.println("El sueldo neto es: " + sueldoNetoPagar);
    }

}
