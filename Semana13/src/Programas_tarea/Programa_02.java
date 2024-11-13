package Programas_tarea;
import java.util.Scanner;
public class Programa_02 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // Solicitar al usuario los valores de las compras
        System.out.print("Ingrese el valor de la compra 1: ");
        double compra1 = lectura.nextDouble();
        System.out.print("Ingrese el valor de la compra 2: ");
        double compra2 = lectura.nextDouble();
        System.out.print("Ingrese el valor de la compra 3: ");
        double compra3 = lectura.nextDouble();
        System.out.print("Ingrese el valor de la compra 4: ");
        double compra4 = lectura.nextDouble();
        // Crear objeto Compras
        Compras compras = new Compras();
        compras.setCompra1(compra1);
        compras.setCompra2(compra2);
        compras.setCompra3(compra3);
        compras.setCompra4(compra4);
        // Mostrar los resultados
        System.out.println("Total de las compras: " + compras.total());
        System.out.println("Promedio de las compras: " + compras.promedio());
        System.out.println("Compra de mayor valor: " + compras.mayor());
        System.out.println("Compra de menor valor: " + compras.menor());
    }}
class Compras {
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    public double getCompra1() {
        return compra1;    }

    public void setCompra1(double compra1) {
        this.compra1 = compra1;    }

    public double getCompra2() {
        return compra2;    }

    public void setCompra2(double compra2) {
        this.compra2 = compra2;    }

    public double getCompra3() {
        return compra3;    }

    public void setCompra3(double compra3) {
        this.compra3 = compra3;    }

    public double getCompra4() {
        return compra4;    }

    public void setCompra4(double compra4) {
        this.compra4 = compra4;    }

    public double total() {
        return compra1 + compra2 + compra3 + compra4;    }

    public double promedio() {
        return total() / 4;    }

    public double mayor() {
        double mayor = compra1;
        if (compra2 > mayor) mayor = compra2;
        if (compra3 > mayor) mayor = compra3;
        if (compra4 > mayor) mayor = compra4;
        return mayor;    }

    public double menor() {
        double menor = compra1;
        if (compra2 < menor) menor = compra2;
        if (compra3 < menor) menor = compra3;
        if (compra4 < menor) menor = compra4;
        return menor;    }
}
