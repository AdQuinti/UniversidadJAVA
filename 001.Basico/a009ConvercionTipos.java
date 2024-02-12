
import java.util.Scanner;

public class a009ConvercionTipos {
    public static void main(String args[]) {
    // convertir tipo String a tipo int
        System.out.println("\nConvertir a tipo int");
        var edad = "20"; // interpreta q es String
        var edad1 = Integer.parseInt(edad); // convierte cadena String a int
        System.out.println("Edad "+edad+" + 1 = "+(edad1+1));
        
    // convertir a Double
    System.out.println("\nConvertir a tipo Double");
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = "+valorPI);
        
        var consola = new Scanner(System.in);
        System.out.print("Proporcione edad: ");
        edad1 = Integer.parseInt(consola.nextLine());
    // si se pone un texto dará error
        System.out.println("Edad = "+edad1);
        
    // convertir a String
    System.out.println("\nConvertir a tipo String");
        var edadTexto = String.valueOf(edad1);//convierte a String
        System.out.println("edadTexto = "+edadTexto+1);
    //saldra num puesto y el uno añadido, pr ej: num1 -> 441
    
    // como recuperar un caracter de una cadena
    System.out.println("\nConvertir a tipo char");
        var caracter = "hola";// lo interpreta como String
    // se crea tipo String y no char q solo guarda un caracter
        var caracter1 =caracter.charAt(2); //convertir tipo a CHAR
    //se lo toma como un array y debemos indicar valor q debe devolver
        System.out.println("Letra = "+caracter1);
        
        var consola1 = new Scanner(System.in);
//        System.out.print("PRoporciona tu edad: ");
//        edad1 = Integer.parseInt(consola1.nextLine());
//        System.out.println("edad = "+edad1);
        
        var edadTexto2 = String.valueOf(10);
        System.out.println("edadTexto = "+edadTexto);
        
        var caracter2 = "hola".charAt(1);
        System.out.println("caracter = "+caracter2);
        
        System.out.print("Proporciona un caracter: ");
        caracter2 = consola1.nextLine().charAt(0);
        System.out.println("caracter = "+caracter2);
        
    }
}
