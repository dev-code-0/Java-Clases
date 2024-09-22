/*  : (Utilizar estructuras selectivas - switch).

Crear un programa en Java que permita ingresar un número (1-6) y tipo de idioma (1(español),2(inglés),3(portugués)-4(francés)). 
Visualizar el número seleccionado traducido al idioma indicado.

          Ejemplo:
numero=5
idioma=1

Resultado:
traducido=”cinco”
*/

package Programas;

import java.util.Scanner;


public class Pregunta4 {
    
    public static void main(String[] args){
        
        //Declarar variables
        int numero, idioma;
        String traducido= "";
        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.println("Ingrese un numero del 1 al 6: ");
        numero = lectura.nextInt();
        
        //Muestrar opciones
        System.out.println("\tIngrese un tipo de idioma");
        System.out.println("1: español");
        System.out.println("2: ingles");
        System.out.println("3: portugues");
        System.out.println("4: frances");
        idioma = lectura.nextInt();
        
        //opciones segun el idioma elegido
        switch (idioma) {
            case 1:
                //opcion 1 traduce al español
                switch (numero) {
                    case 1:
                        traducido = "uno";
                        break;
                    case 2:
                        traducido = "dos";
                        break;
                    case 3:
                        traducido = "tres";
                        break;
                    case 4:
                        traducido = "cuatro";
                        break;
                    case 5:
                        traducido = "cinco";
                        break;
                    case 6:
                        traducido = "seis";
                        break;
                    default:
                        traducido = "Numero incorrecto";
                }
                break;
            case 2:
                //opcion 2 traduce al ingles
                switch (numero) {
                    case 1:
                        traducido = "one";
                        break;
                    case 2:
                        traducido = "two";
                        break;
                    case 3:
                        traducido = "three";
                        break;
                    case 4:
                        traducido = "four";
                        break;
                    case 5:
                        traducido = "five";
                        break;
                    case 6:
                        traducido = "six";
                        break;
                    default:
                        traducido = "Numero incorrecto";
                }
                break;
            case 3:
                //opcion 3 traduce al portugues
                switch (numero) {
                    case 1:
                        traducido = "um";
                        break;
                    case 2:
                        traducido = "dois";
                        break;
                    case 3:
                        traducido = "três";
                        break;
                    case 4:
                        traducido = "quatro";
                        break;
                    case 5:
                        traducido = "cinco";
                        break;
                    case 6:
                        traducido = "seis";
                        break;
                    default:
                        traducido = "Numero incorrecto";
                }
                break;
            case 4:
                //opcion 4 traduce al frances
                switch (numero) {
                    case 1:
                        traducido = "un";
                        break;
                    case 2:
                        traducido = "deux";
                        break;
                    case 3:
                        traducido = "trois";
                        break;
                    case 4:
                        traducido = "quatre";
                        break;
                    case 5:
                        traducido = "cinq";
                        break;
                    case 6:
                        traducido = "six";
                        break;
                    default:
                        traducido = "Numero incorrecto";
                }
                break;
            default:
                traducido = "Numero fuera del idioma";
        }
        
        //Salida de datos
        System.out.println("Traducio: " + traducido);

        
    }

}