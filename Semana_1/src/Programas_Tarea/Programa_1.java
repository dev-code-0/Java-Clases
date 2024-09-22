/*1)	Crear un programa que permita registrar el nombre de un cliente, producto, precio y cantidad. Determinar el subtotal, IGV y total a pagar.

     Datos de Prueba:
     nombre de cliente: Jose
     producto:laptop
     precio:3000
     cantidad:2
     Subtotal:6000
     IGV:1080
     TotalPagar:4920
*/

package Programas_Tarea;

import java.util.Scanner;

public class Programa_1 {
    public static void main (String[] args){
        
    //Decalrar variables    
    int cantidad;
    double precio, subTotal, igv, totalPagar;
    String nombre, producto;
    
    Scanner lectura = new Scanner(System.in);
    
        //ingreso de datos
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = lectura.next();
        
        System.out.print("Ingrese el producto que decea comprar: ");
        producto = lectura.next();
        
        System.out.print("Ingrese el precio del producto: ");
        precio = lectura.nextDouble();
        
        System.out.print("Ingrese la cantidad que decea llevar: ");
        cantidad = lectura.nextInt();
        
        //Calcular datos
        subTotal = precio * cantidad;
        igv = subTotal * 0.18;
        
        totalPagar = subTotal + igv;
        
        //Salida de datos
        System.out.println("\tFactura");
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println("Producto: " + producto);
        System.out.println("El precio es: " + precio);
        System.out.println("La cantidad que lleva es: " + cantidad);
        System.out.println("El subtotal es: " + subTotal);
        System.out.println("El IGV: " + igv);
        System.out.println("Precio total a pagar: " + totalPagar);
        
    
    }
    
   



}
