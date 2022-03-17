
package Desarrollo;


public class CrearMetodosConParametros {
    public static void main(String[] args) {
        System.out.println("Metodo Void");
        metodoConParametrosVoid(1, 24.34, "Lucas");
        System.out.println("-----------------");
        
        System.out.println("Metodo Int");
        metodoConParametrosInt(1);
        System.out.println("-----------------");
        
        System.out.println("Metodo Double");
        metodoConParametrosDouble(24.34);
        System.out.println("-----------------");
        
        System.out.println("Metodo String");
        metodoConParametrosString("Lucas");
        System.out.println("-----------------");
    }

    private static void metodoConParametrosVoid(int valor_int, double valor_double, String valor_string) {
        System.out.println("Valor Int: "+valor_int);
        System.out.println("Valor Double: "+valor_double);
        System.out.println("Valor String: "+valor_string);
    }

    private static int metodoConParametrosInt(int valor_int) {
        System.out.println("Elvalor de Int es: "+valor_int);
    return valor_int;
    }
    
    private static double metodoConParametrosDouble(double valor_double) {
        System.out.println("Elvalor de Int es: "+valor_double);
    return valor_double;
    }
    
    private static String metodoConParametrosString(String valor_string) {
        System.out.println("Elvalor de Int es: "+valor_string);
    return valor_string;
    }
    
}
