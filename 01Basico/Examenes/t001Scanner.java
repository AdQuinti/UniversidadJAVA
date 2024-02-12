package Examenes;

import java.util.Scanner;

/**
 * Mostrar por pantalla información pedida a usuario de titulo y autor:
 *  titulo + fue escrito por + autor
 */

public class t001Scanner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca nombre del autor del libro: ");
        String autor = scanner.nextLine();
        
        System.out.print("Introduzca nombre del título del libro: ");
        String titulo = scanner.nextLine();
        
        System.out.println(titulo+" fue escrito por "+autor);
    }
}
