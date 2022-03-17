
package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Clase Scanner para leer los datos en tiempo real
        Scanner leer = new Scanner(System.in);
        //.nexDouble o .nexInt dependiendo del dato para leer el dato ingresado
        System.out.println("Digite el precio de la computadora: ");
        double precio=leer.nextDouble();
        
        double valor_iva = iva_compra(precio);
        double valor_rebaja= rebaja_compra(precio);
        
        double total_compra=precio_compra(precio, valor_iva, valor_rebaja);
        
        System.out.println("La rebaja del 15% es de: "+valor_rebaja);
        System.out.println("El iva es de: "+valor_iva);
        System.out.println("El total de la compra es de: "+total_compra);
        
    }
    
    private static double precio_compra(double precio, double iva, double rebaja){
        double total=0.0;
        total=(precio-rebaja)+iva;
    return total;
    }
    
    private static double iva_compra(double precio){
        double iva=precio*0.13;
    return iva;
    }
    
    private static double rebaja_compra(double precio){
        double rebaja= precio*0.15;
    return rebaja;
    }
    
    
}
