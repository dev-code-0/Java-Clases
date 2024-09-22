/* (Utilizar procesos secuenciales).

Crear un programa en Java que permita ingresar las ventas del primer semestre del año. 
Visualizar el total, promedio ventas realizadas.
     Ejemplo:
     venta1=100
     venta2=200
     venta3=300
     venta4=400
     venta5=500
     venta6= 600
     Resultados:
     tv=2100
     pv=350
*/


package Programas;
import java.util.Scanner;

public class Pregunta1 {

    public static void main(String[] args) {
        
        //Delarar variaables
        int venta1, venta2, venta3, venta4, venta5, venta6, total, promedio;
        
        Scanner lectura = new Scanner(System.in);
        
        //Muestra de titulo
        System.out.println("\tIngresando las ventas del primer semestre");
        
        //Entrada de datos
        System.out.print("Ingrese la primar venta: ");
        venta1 = lectura.nextInt();
        
        System.out.print("Ingrese la segunta venta: ");
        venta2 = lectura.nextInt();
        
        System.out.print("Ingrese la tercera venta: ");
        venta3 = lectura.nextInt();
        
        System.out.print("Ingrese la cuarta venta: ");
        venta4 = lectura.nextInt();
        
        System.out.print("Ingrese la quinta venta: ");
        venta5 = lectura.nextInt();
        
        System.out.print("Ingrese la sexta venta: ");
        venta6 = lectura.nextInt();
        
        //Calcular datos
        total = venta1+venta2+venta3+venta4+venta5+venta6;
        promedio = total/6;
        
        //Salida de datos
        System.out.println("El total de las ventas es: " + total);
        System.out.println("el promedio del total de las ventas es: " + promedio);
        
        
    }

}