
package Ejercicios;

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
        String nombreEmpleado;
        double cantidadCV;//Cantidad de computadoras vendidas
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado=leer.nextLine();
        System.out.println("Ingrese la cantidad de computadoras vendidas: ");
        cantidadCV=leer.nextInt();
        
        int CV =Ejercicio4.cmsComputadorasVendidas(0);
        
        
    }
    public static int cmsComputadorasVendidas(int cantidadCV){
        int comisionTotal=cantidadCV*50;
    return comisionTotal;
    }
    public static void obtenerSalarioDevengado(int comisionTotal){
        double devengado=300+comisionTotal;
    }
    public static void SalarioLiquido(double devengado){
        double renta=devengado*0.10;
        double SLiquido=devengado-renta;
    }
}
