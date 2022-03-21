
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        /*Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la Importación) para un vehículo del año 2010
        utilizando la siguiente fórmula:
        DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25
        Depreciación = Valor Vehículo en USA * 0.10
        El programa deberá permitir ingresar vía teclado los valores para el valor del vehículo en USA, flete y seguro. Por el momento
        el porcentaje de la depreciación será constante. Para efectos de prueba puede utilizar los siguientes valores: 
        Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100.
        Imprimir los valores capturados así como el monto del DAI*/
        Scanner leer=new Scanner(System.in);
        double valorVehiculoUSA, valorFlete, valorSeguro;
        NumberFormat formato= new DecimalFormat("$#,###.##");
        
        System.out.println("Ingrese el valor del vehivulo: ");
        valorVehiculoUSA=leer.nextDouble();//Captura el dato tipo Double
        System.out.println("ingrese el valor del flete: ");
        valorFlete=leer.nextDouble();
        System.out.println("ingrese el valor del seguro: ");
        valorSeguro=leer.nextDouble();
        
        double valorDepreciacion=Ejercicio2.obtenerDepreciacion(valorVehiculoUSA);
        double valorDai=Ejercicio2.obtenerDai(valorVehiculoUSA, valorDepreciacion, valorFlete, valorSeguro);
        
        System.out.println("El valor de la Depreciacion es de: "+formato.format(valorDepreciacion));
        System.out.println("El valor del DAI es de: "+ formato.format(valorDai));
    }
    //CALCULO DE LA DEPRECIACION
    public static double obtenerDepreciacion(double valorVehiculoUSA){
        double Depreciacion=valorVehiculoUSA*0.10;
    return Depreciacion;
    }
    
    //CALCULO DEL DAI
    public static double obtenerDai(double valorVehiculoUSA, double Depreciacion, double valorFlete, double valorSeguro){
        double DAI=(valorVehiculoUSA-Depreciacion-valorFlete-valorSeguro)*0.25;
    return DAI;
    }
}
