/*  Suma de los primeros 100 números positivos*/

package Programas_Tarea;

public class Programa_1 {

    public static void main(String [] args){
        
        //Declarar variables, suma inica en 0 y contador en 1;
        int suma=0, contador=1;
        
        //si contador es menor o igual a 100, se seguira ejecutando
        while (contador <= 100) {            
            suma += contador;
            contador++;
        }
        
        //Salida de datos
        System.out.println("La suma de la 100 primeros numeros positivos es: " + suma);
    } 

}
