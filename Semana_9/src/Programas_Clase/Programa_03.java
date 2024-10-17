/*  3.	Crear un programa en Java que permita registrar los sueldos de los n empleados en un arreglo de datos. Visualizar sueldo promedio, sueldo mayor.*/

package Programas_Clase;

import java.util.Scanner;

public class Programa_03 {

    public static void main(String[] args){
        
        //Declarar variables
        int i,n;
        double sueldo, sumaSueldos,sueldoMayor,sp;
        Scanner lectura=new Scanner(System.in);
        //Entrada
        System.out.print("Ingresar el numero de empleados:");
        n=lectura.nextInt();
        double[] asueldos=new double[n];
        for(i=0;i<n;i++){
            System.out.print("Ingrese el sueldo del empleado "+(i+1)+":");
            sueldo=lectura.nextDouble();
            asueldos[i]=sueldo;
        }
        //Proceso
        sumaSueldos=0.0;
        sueldoMayor=asueldos[0];
        for(i=0;i<n;i++){
            sumaSueldos+=asueldos[i];
            if(asueldos[i]>sueldoMayor){
            sueldoMayor=asueldos[i];
            }
        }
        sp=sumaSueldos/n;
        //Salida
        System.out.println("El sueldo promedio es:"+sp);
        System.out.println("El sueldo mayor es:"+sueldoMayor);
        
    }

}
