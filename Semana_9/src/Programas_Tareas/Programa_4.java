/*  4.- Crear un programa en Java que permita almacenar en un arreglo de datos cinco nombres de personas ingresadas y realizar una búsqueda mediante un nombre ingresado. 
    Visualizar un mensaje indicando si la persona existe o no existe y la posición del número en el arreglo de datos.*/

package Programas_Tareas;

import java.util.Scanner;

public class Programa_4 {

    public static void main(String[] args){
        
        Scanner lectura = new Scanner(System.in);
        
        int posicion;
        String[] nombres = new String[5];
        String nombreBuscado;
        boolean encontrado;

        // Ingresar nombres
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = lectura.nextLine();
        }

        // Realizar búsqueda
        System.out.print("\nIngrese el nombre a buscar: ");
        nombreBuscado = lectura.nextLine();

        encontrado = false;
        posicion = -1;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        // Mostrar resultado
        if (encontrado) {
            System.out.println("La persona '" + nombreBuscado + "' existe en el arreglo.");
            System.out.println("Se encuentra en la posición: " + posicion);
        } else {
            System.out.println("La persona '" + nombreBuscado + "' no existe en el arreglo.");
        }
        
    }

}
