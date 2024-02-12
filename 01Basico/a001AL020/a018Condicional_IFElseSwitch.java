package a001AL020;

import java.util.Scanner;

/**
 * Condicional IF - Else If - Switch (2 formas de ponerlo)
 * @author AdQuinti
 */
public class a018Condicional_IFElseSwitch {
    public static void main(String args[]) {
        var condicion = true;
        
        if (condicion) {
            System.out.println("La condición es verdadera.");
        } else {
            System.out.println("La condición es falsa.");
        }
        
        System.out.println("OTRO EJEMPLO CON IF ELSE\nESTACIONES DEL AÑO");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca num 1 al 12: ");
        int mes = Integer.parseInt(scanner.nextLine());
        var estacion = " desconocida.";
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Inverno";
        } else if ( mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }  else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }
        System.out.println("Estacion " + estacion);
        
        System.out.println("\nOTRO EJEMPLO CON SWITCH");
        
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                break;
        }
        System.out.println("Estación es "+ estacion);
        
        System.out.println("\nOTRO FORMA PONER SWITCH");
        switch (mes) {
            case 1, 2, 12 -> estacion = "Sorticio de Invierno";
            case 3, 4, 5 -> estacion = "Sorticio de Primavera";
            case 6, 7, 8 -> estacion = "Sorticio de Verano";
            case 9, 10, 11 -> estacion = "Sorticio de Otoño";
            default ->  { }
        }
        System.out.println("Estación es "+ estacion);
    }
}
