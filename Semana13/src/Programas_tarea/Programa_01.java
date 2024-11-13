package Programas_tarea;
import java.util.Scanner;
public class Programa_01 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // Solicitar los datos
        System.out.print("Ingrese el ingreso mensual: ");
        double ingresoMensual = lectura.nextDouble();
        System.out.print("Ingrese otros ingresos: ");
        double otrosIngresos = lectura.nextDouble();
        System.out.print("Ingrese los gastos mensuales: ");
        double gastosMensuales = lectura.nextDouble();
        // Crear objeto Empleado
        Empleado empleado = new Empleado();
        empleado.setIngresoMensual(ingresoMensual);
        empleado.setOtrosIngresos(otrosIngresos);
        empleado.setGastosMensuales(gastosMensuales);
        // Mostrar los resultados
        System.out.println("Ahorro Mensual: " + empleado.ahorroMensual());
        System.out.println("Ahorro Semestral: " + empleado.ahorroSemestral());
        System.out.println("Ahorro Anual: " + empleado.ahorroAnual());
    }}
class Empleado {
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    public double getIngresoMensual() {
        return ingresoMensual;    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;    }

    public double getOtrosIngresos() {
        return otrosIngresos;    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;    }

    public double getGastosMensuales() {
        return gastosMensuales;    }

    public void setGastosMensuales(double gastosMensuales) {
        this.gastosMensuales = gastosMensuales;    }
    
    public double ahorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;    }

    public double ahorroSemestral() {
        return ahorroMensual() * 6;    }

    public double ahorroAnual() {
        return ahorroMensual() * 12;    }
}
