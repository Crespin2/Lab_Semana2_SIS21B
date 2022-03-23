
package Ejercicios;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Escriba un programa para calcular el salario b ruto de un empleado. Para calcular el salario del empleado debemos de hacer los descuentos 
        por llegadas tardías así como la  retención de la renta que es el 10% del salario menos el descuento por llegada tardía. Debe de crear una  fórmula  
        para  determinar  el  salario  por  minuto  y  calcular  el  monto  por  las  llegadas tardías y descontarlo al salario, luego debe de descontar el 
        monto de la renta. El programa deberá permitir ingresar el nombre del empleado, el salario mensual. El programa deberá de imprimir el nombre del 
        empleado, el descuento por llegadas tardías, la retención de la renta y finalmente el salario bruto.*/
        Scanner leer=new Scanner(System.in);
        NumberFormat formato=new DecimalFormat("$#,###.##");
        //las horas laborales son de 44 semanales 
        String NombreEmpleado;
        double salarioMensual;
        double llegadasTardias;
        
        System.out.println("Ingrese el nombre del empleado: ");
        NombreEmpleado=leer.nextLine();
        System.out.println("Ingrese el Salario Mensual del empleado: ");
        salarioMensual=leer.nextDouble();
        System.out.println("Ingrese las horas tardias (En minutos): ");
        llegadasTardias=leer.nextDouble();
        
        double salarioXmin=Ejercicio5.obtenerSxMin(salarioMensual);
        double LLT=Ejercicio5.obtenerDPLLTardia(salarioXmin, llegadasTardias);
        double Renta=Ejercicio5.renta(salarioMensual);
        double SL=Ejercicio5.salarioLiquido(Renta, LLT, salarioMensual);
        
        System.out.println("---------IMPRIMIENDO DATOS-----------");
        System.out.println("El nombre del empleado es: "+NombreEmpleado);
        System.out.println("El salario mensual por min es: "+formato.format(salarioXmin));
        System.out.println("Descuento por horas tardias: "+formato.format(LLT));
        System.out.println("La renta es de: "+formato.format(Renta));
        System.out.println("El salario Liquido es de: "+formato.format(SL));
    }
    //Metodo para obtener el descueto por llegada tardia(salario por minuto)
    public static double obtenerSxMin(double salarioMensual){
        double Sxmin=salarioMensual/10560;//son los minutos de multiplicar 44h laborales en la semama por 4 semanas del mes
    return Sxmin;
    }
    
    public static double obtenerDPLLTardia(double salarioXmin, double llegadasTardias){//MxllegadaTardias = minuto por llegada tardia
        double LLTardias=salarioXmin*llegadasTardias;
    return LLTardias;
    }
    
    public static double renta(double salarioMensual){
        double RENTA=salarioMensual*0.10;
    return RENTA;
    }
    public static double salarioLiquido(double RENTA, double LLT, double salarioMensual){
        double SLiquido=salarioMensual-RENTA - LLT;
    return SLiquido;
    }
}
