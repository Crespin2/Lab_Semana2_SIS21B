
package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BilletesCinco {
    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String CantidadDinero;
        try{
            System.out.println("Cantidad: ");
            CantidadDinero=leer.readLine();//Lectura tipo String
            String CantidadCinco=BilletesCinco.obtenerBilletesDeCinco(CantidadDinero);
            System.out.println("Cantidad de Billetes de $5.00: "+CantidadCinco);
        }catch(IOException e){//Tenia error al poner solo "Exception"
            System.out.println(e.getMessage());
        }
    }
    
    public static String obtenerBilletesDeCinco(String CantidadDinero){
        double montoDinero=Double.parseDouble(CantidadDinero);//Convertir a Double
        int billetesCinco=(int)montoDinero/5;//casting de double a int
        String resultado=String.valueOf(billetesCinco);//Casting a String
    return resultado;
    }
}
