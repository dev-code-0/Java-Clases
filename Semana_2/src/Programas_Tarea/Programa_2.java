/* Un número aleatorio del 1 al 100 */

package Programas_Tarea;

import java.util.Scanner;
import java.lang.Math;

public class Programa_2 {
    
    public static void main(String[] args){
        
        int numAleatorio;//Declara la variable
        
        numAleatorio = (int)(Math.random()* 100)+1;//Clacula un número al azar del 1 al 100
        
        System.out.println("El numero aleatorio es: " + numAleatorio);//imprime el resultado
        
    }

}
