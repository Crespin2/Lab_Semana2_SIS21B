
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        /*-. Una  empresa  de  venta  de  computadoras  paga  a  su  personal  de  ventas  
        un  salario  de $300,00 más una comisión de $50,00 por computadora vendida. Diseñar 
        un programa para calcular  el  salario  de  un  vendedor  en  un  determinado  mes,  
        conociendo  el  nº  de computadoras vendidas. Al salario devengado se debe de retener 
        el 10% en concepto de renta. Imprimir el nombre del vendedor, el salario devengado y 
        la retención de la renta. */
        
        Scanner leer=new Scanner (System.in);
        double comision;
        double compuVendidas;
        String nombreEmpleado;
        
        System.out.println("Ingrese el nombre del Empleado: ");
        nombreEmpleado=leer.nextLine();
        System.out.println("Ingrese la cantidad del computadoras vendidas: ");
        compuVendidas=leer.nextDouble();
        
        double CCVendidas=Ejercicio4.obtenerComision(compuVendidas);
        double SDevengado=Ejercicio4.obtenerDevengado(CCVendidas);
        double Renta=Ejercicio4.obtenerRenta(SDevengado);
        double SLiquido=Ejercicio4.obtenerLiquido(Renta, SDevengado);
        
        NumberFormat formato=new DecimalFormat("$#,###.##");
        
        System.out.println("--------IMPRIMIENDO DATOS-------------");
        System.out.println("El nombre del empleado es: "+nombreEmpleado);
        System.out.println("La comision por computadoras vendidas es de: "+formato.format(CCVendidas));
        System.out.println("El salario devengado es de: "+formato.format(SDevengado));
        System.out.println("La renta es de: "+formato.format(Renta));
        System.out.println("El salario liquido es de: "+formato.format(SLiquido));
    }
    //Metodo para obtener la comision por computadora vendida
    public static double obtenerComision(double compuVendidas){
        double comision=compuVendidas*50;
    return comision;
    }
    //Metodo para obtener el salario devengado
    public static double obtenerDevengado(double CCVendidas){
        double devengado=300+CCVendidas;
    return devengado;
    }
    //Metodo para la renta
    public static double obtenerRenta(double SDevengado){
        double renta=SDevengado*0.10;
    return renta;
    }
    //Metodo para obtener el salario Liquido
    public static double obtenerLiquido (double Renta, double SDevengado){
        double liquido=SDevengado-Renta;
    return liquido;
    }
}
