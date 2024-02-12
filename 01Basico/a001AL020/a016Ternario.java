package a001AL020;

/**
 * OPERADOR TERNARIO
 * Es como un if pero en una sola linea.
 * SINTAXIS-> condicion ? rama-si : rama-no;
 */
import java.util.Scanner;

public class a016Ternario {
    public static void main(String args[]) {
        var resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("PAR O IMPAR\nIntroduce un número: ");
        int num = Integer.parseInt(scanner.nextLine());
        resultado = (num % 2 == 0) ? "número par." : "número impar.";
        System.out.println("El número "+num+" es un "+resultado);
    }
}
