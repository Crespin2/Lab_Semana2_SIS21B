
package Desarrollo;

public class MiSegundaAplicacionJava {
    public static void main(String[] args) {
        //Se hace el llamdo de cada uno de los parametros
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
        
    }

    private static void metodoConVoid() {
        System.out.println("Contenido del metodo con Void");
    }

    private static int metodoConInt() {
        System.out.println("Contenido del metodo con Int");
        return 0;
    }
    
    private static double metodoConDouble() {
        System.out.println("Contenido del metodo con Doouble");
        return 0;
    }
    
    private static String metodoConString() {
        System.out.println("Contenido del metodo con String");
        return "";
    }
    
}
