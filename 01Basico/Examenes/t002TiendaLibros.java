/*
 * Tienda libros, capturar siguiente información: nombre (string), id(int),
 * precio (double) y envioGratuito (boolean).
 * imprimir un mensaje dando todos los datos.
 */
package Examenes;

import java.util.Scanner;
/**
 * Tienda libros - Ejercicio de Universidad Java
 * @author AdQuinti
 */
public class t002TiendaLibros {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar y capturar datos
        System.out.print("Proporciona el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Proporciona el id: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Proporciona el precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Proporciona el envío gratuito: ");
        boolean envio = Boolean.parseBoolean(scanner.nextLine());
        
        // Imprime por pantalla
        System.out.println(nombre+" #"+id);
        System.out.println("Precio: $"+precio);
        System.out.println("Envío Gratuito: "+envio);   
    }
}
