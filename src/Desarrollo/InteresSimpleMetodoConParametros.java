
package Desarrollo;
public class InteresSimpleMetodoConParametros {
    public static void main(String[] args) {
        double CantidadPrestada, tiempo, tasaDeInteres;
        CantidadPrestada=1500.00;
        tiempo=0.75;//9 meses equivale a 9/12 años=2/4 o 0.75
        tasaDeInteres=0.08;
        //Envio de parametros al metodo
        double valorInteresSimple=calcularInteresSimple(CantidadPrestada, tiempo, tasaDeInteres);
        System.out.println("El interes es de: $"+valorInteresSimple);//Muestra el resultado
    }
    public static double calcularInteresSimple(double CantidadPrestada, double tiempo, double tasaDeInteres){
        double interesSimple;
        interesSimple=CantidadPrestada*tiempo*tasaDeInteres;//Efectua la operacion dentro del metodo
    return interesSimple;    
    }
   
}
