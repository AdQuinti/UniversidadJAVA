
import java.util.Scanner;


public class a004Scanner {
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre:");
    // METODO SCANNER
        Scanner consola = new Scanner(System.in); // leer info de consola
        var usuario = consola.nextLine(); //metodo linea completa de consola
        
        System.out.println("Usuario = "+usuario);
        
        System.out.println("Escribe un título:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: "+titulo+ " " +usuario);
    }
}
