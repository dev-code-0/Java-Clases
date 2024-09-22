/*  Crear un programa Java que permita ingresar el capital inicial, tasa de interés y periodo (tiempo). 
Visualizar del Interés Compuesto.

Para calcula el valor futuro (VF) de una inversión utilizando la fórmula del interés compuesto.

         Fórmula matemática:   
         vf=va*(1 + i) ^ n
          I=vf-va

va = es el capital inicial, 
i = es la tasa de interés
n = es el tiempo en meses.
           Ejemplo:
 
 va= 5400
  i= 1.42%
 n= 4
        
 Resultado:
  vf= 5713.32
   I= 313.32
*/

package Programas;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Pregunta2 {   
    public static void main(String[] args){    
        
        //Declarar variables
        double capitalInicial, tasaInteres, periodo, interesCompuesto, valorFuturo;
        
        Scanner lectura =new Scanner(System.in);
        
        //Elegir los decimales deceado
        DecimalFormat decimal = new DecimalFormat("####.##");
        
        //Entradad e datos
        System.out.print("Ingrese el capital inicial: ");
        capitalInicial = lectura.nextDouble();
        
        System.out.print("Ingrese la tasa de interés: ");
        tasaInteres = lectura.nextDouble();
        
        System.out.print("Ingrese el peridodo: ");
        periodo = lectura.nextDouble();
        
        //Calcualr datos
        tasaInteres = tasaInteres / 100;
        
        valorFuturo = capitalInicial * Math.pow((1 + tasaInteres), periodo);
        
        interesCompuesto = valorFuturo - capitalInicial;
        
        //Salida de datos
        System.out.println("El valor futuro es: " + decimal.format(valorFuturo));
        System.out.println("El interes compuesto es: " + decimal.format(interesCompuesto));
        
    }

}