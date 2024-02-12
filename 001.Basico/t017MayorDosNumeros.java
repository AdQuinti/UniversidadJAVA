
/** EL MAYOR DE DOS NÚMEROS
 * Usuario introduzco dos número por teclado y ver cuál es el mayor de ambos
 * @author AdQuinti
 */

import java.util.Scanner;

public class t017MayorDosNumeros {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona el número1: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Proporciona el número2: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        
        var resultado = num1 > num2 ? num1+" es mayor que "+num2 : num2+" es mayor que "+num1 ;
        System.out.println("El número "+resultado);
    }
}
