/**
 * Crear sistema de calificaciones, como sigue:
 * Usuario proporciona valor entre 0 y 10.
 *  - Si está entre 9 y 10: imprimir una A
 *  - Si está entre 8 y menor a 9: imprimir una B
 *  - Si está entre 7 y menor a 8: imprimir una C
 *  - Si está entre 6 y menor a 7: imprimir una D
 *  - Si está entre 0 y menor a 6: imprimir una F
 *   - Cualquier otro valor debe imprimir: Valor desconocido
 * @author AdQuinti
 */
package Examenes;

import java.util.Scanner;

public class t005Calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una nota entre  0 y  10: ");
        int valor = sc.nextInt();

        // Utilizamos una expresión ternaria para determinar el rango de la calificación
        switch ((valor >=  9) ?  1 : (valor >=  8) ?  2 : (valor >=  7) ?  3 : (valor >=  6) ?  4 : (valor >=  0) ?  5 :  0) {
            case  1:
                System.out.println("A");
                break;
            case  2:
                System.out.println("B");
                break;
            case  3:
                System.out.println("C");
                break;
            case  4:
                System.out.println("D");
                break;
            case  5:
                System.out.println("F");
                break;
            default:
                System.out.println("Valor desconocido");
                break;
        }
        
/*        switch ((valor >=  9) ?  1 : (valor >=  8) ?  2 : (valor >=  7) ?  3 : (valor >=  6) ?  4 : (valor >=  0) ?  5 :  0) {
            case  1 -> System.out.println("A");
            case  2 -> System.out.println("B");
            case  3 -> System.out.println("C");
            case  4 -> System.out.println("D");
            case  5 -> System.out.println("F");
            default -> System.out.println("Valor desconocido");
        }*/

// OTRA FORMA DE PONERLO
/*System.out.println("Proporciona un valor entre 0 y 10:");
        int calificacion = Integer.parseInt(scanner.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion >= 8 && calificacion < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >= 7 && calificacion < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >= 6 && calificacion < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("F");
        //Si no esta en el rago, imprimir: Valor desconocido
        else
            System.out.println("Valor desconocido");*/
    }
}
