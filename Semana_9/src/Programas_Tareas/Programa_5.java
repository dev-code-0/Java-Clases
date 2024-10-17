/*       5.- Crear un programa en Java que permita almacenar cinco números en el arreglo  
          a y b. Visualizar los valores del arreglo a y b en forma intercalada al arreglo c.

a[]=10 20 30 40 50
b[]=60 70 80 90 100
c[]=10 60 20 70 30 80……100
*/

package Programas_Tareas;

public class Programa_5 {

    public static void main(String [] args){
        
        // arreglos a y b
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};
        
        // arreglo c 
        int[] c = new int[a.length + b.length];
        
        // los valores de a y b en c
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            c[index++] = a[i];
            c[index++] = b[i];
        }
        
        // Visualizar los arreglos
        System.out.println("Arreglo a:");
        imprimirArreglo(a);
        
        System.out.println("\nArreglo b:");
        imprimirArreglo(b);
        
        System.out.println("\nArreglo c:");
        imprimirArreglo(c);
    }
    
    // Método para imprimir un arreglo
    private static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }

}
