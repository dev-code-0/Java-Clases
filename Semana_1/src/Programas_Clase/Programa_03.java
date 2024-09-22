/*
 8.	Crear un programa que permita registrar el nombre del vendedor, sueldo mensual y además se va aplicar un 10% de comisión por las tres ventas realizadas.
Determinar la comisión y el pago total que recibirá a fin mes el vendedor.

Fórmulas:
comsion: (venta1+ venta2 +venta3) *0.10
      pagototal: sueldomensual + comision

     Datos de Prueba:
     nombre de vendedor:Carlos
     sueldo Mensual:3500
     venta 1:1000
     venta 2:2000
     venta 3:3000  

     La comisión de la venta es              :600.0
     El sueldo neto del vendedor es       :4100.0

 */

package Programas_Clase;

import java.util.Scanner;

public class Programa_03 {
    
    public static void main(String args[]){
        
        //Declarar variables
        int venta1, venta2, venta3;
        double sueldoMensual, pagoTotal, comision;
        String  nombre;
        
        Scanner lectura = new Scanner (System.in);
        
        //Ingresonde datos
        System.out.print("Ingrese el nombre del vendedor: ");
        nombre = lectura.next();
        
        System.out.print("Ingrese el sueldo mensual del empleado: ");
        sueldoMensual = lectura.nextDouble();
        
        System.out.print("Ingrese la venta 1: ");
        venta1 = lectura.nextInt();
        
        System.out.print("Ingrese la venta 2: ");
        venta2 = lectura.nextInt();
        
        System.out.print("Ingrese la venta 3: ");
        venta3 = lectura.nextInt();
        
        comision = (venta1 + venta2 + venta3) * 0.10;
        pagoTotal = sueldoMensual + comision;
        
        //Salida de datos
        System.out.println("La comision de la venta es: \t\t" + comision);
        System.out.println("El sueldo mensual del vendedor es: \t" + pagoTotal);
    }

}
