
package entrada.desde.teclado;

import java.io.BufferedReader;//Importar las clase para lectura desde teclado
import java.io.InputStreamReader;//Son tipos String habra que convertir los datos

public class Calculadora {
    public static void main(String[] args) {
        double cantidad1=0, cantidad2=0;
        //Crear el objeto leer de las clases correspondinetes para obtener los datos
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        try{//Se utiliza el manejador de errores de lo contrario genera error
            System.out.println("Ingresa la cantida 1: ");
            //Hace la lectura desde teclado y lo convierte a Double
            cantidad1=Double.parseDouble(leer.readLine());
            System.out.println("Ingresa la cantidad 2: ");
            cantidad2=Double.parseDouble(leer.readLine());
            //IMPRIMIR EN PANTALLA
            System.out.println("El resultado de la Suma es: "+Calculadora.sumar(cantidad1, cantidad2));
            System.out.println("El resultado de la Resta es: "+Calculadora.restar(cantidad1, cantidad2));
            System.out.println("El resultado de la Multiplicaion: "+Calculadora.multiplicar(cantidad1, cantidad2));
            System.out.println("El resultado de la Division es: "+Calculadora.dividir(cantidad1, cantidad2));
        }catch(Exception e){//Captura del error
            System.out.println(e.getMessage());
        }
        System.out.println(cantidad1+" "+cantidad2);
    }
    
    //Metodo SUMAR
    public static double sumar(double cantidad1, double cantidad2){
        double suma=cantidad1+cantidad2;
    return suma;
    }
    //Metodo RESTAR
    public static double restar(double cantidad1, double cantidad2){
        double resta=cantidad1-cantidad2;
    return resta;
    }
    //Metodo MULTIPLICAR
    public static double multiplicar(double cantidad1, double cantidad2){
        double multiplicacion=cantidad1*cantidad2;
    return multiplicacion;
    }
    //Metodo DIVIDIR
    public static double dividir(double cantidad1, double cantidad2){
        double division=cantidad1/cantidad2;
    return division;
    }
}
