
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*Una agencia de venta de autos paga a su personal de ventas un salario de $800,00 más una comisión de $170,00 por auto 
        vendido más un 5% del valor de venta. Diseñar un programa para  calcular  el  salario  de  un  vendedor  en  un  determinado  
        mes,  conociendo  el  nº  de automóviles vendidos y el total del monto de ventas. Imprimir el nombre del vendedor y el salario 
        devengado por este.*/
        //Declarar Variables 
        NumberFormat F=new DecimalFormat("$#,###.##");
        Scanner leer=new Scanner(System.in);
        String nombreEmpleado;
        double comision = 0, totalMontoVentas = 0;
        double cAutosVendidos;//Cantidad de Autos vendidos
        double devengado;
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado=leer.nextLine();
        System.out.println("Ingrese la catidad del Autos vendidos: ");
        cAutosVendidos=leer.nextInt();
        
        double VComision=Ejercicio3.obtenerComision(cAutosVendidos);
        double VMTotal= Ejercicio3.obtenerMontoTotal(totalMontoVentas, cAutosVendidos);
        double salarioDevengado=Ejercicio3.obtenerDevengado(VComision, VMTotal);
        
        System.out.println("El nombre del empleado es: "+nombreEmpleado);
        System.out.println("La comision es de: "+F.format(VComision));
        System.out.println("El monto total de las ventas es de: " + F.format(VMTotal));
        System.out.println("El salrio Devengado del empleado es de: "+F.format(salarioDevengado));
    }
    //Metodo para la comision
    public static double obtenerComision(double cAutosVendidos){
        double comision=cAutosVendidos*170;
    return comision;
    }
    //Metodo para obtener el 5% del monto total
    public static double obtenerMontoTotal(double TotalVentas, double cAutosVendidos){
        Scanner leer2=new Scanner(System.in);
        double TVentas = 0;
        for(int x=1;x<=cAutosVendidos; x++){
            
            System.out.println("Ingrese el valor del auto #"+x+": ");
            TVentas=leer2.nextDouble();
            TotalVentas+=TVentas;
        }
        System.out.println("Monto total de ventas: "+TotalVentas);
        double totalMontoVentas=TotalVentas*0.05;
    return totalMontoVentas;
    }
    //Metodo para obtener el salario devengado del empleado
    public static double obtenerDevengado(double VComision, double VMTotal){
        double devendago = VComision+VMTotal+800;
    return devendago;
    }
}
