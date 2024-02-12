package a001AL020;

import java.util.stream.IntStream;


/**
 * Bucles: while - Do while - for - for each - forEach con IntStream
 * @author AdQuinti
 */
public class a019Bucle {
    public static void main (String args[]) {
        var contador = 0;
        
    //  WHILE
        System.out.println("CONTADOR while");
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador ++;
        }
        contador = 0;
        
    //  DO WHILE
        System.out.println("\nCONTADOR do while");
        do {
            System.out.println("contador = " + contador);
            contador ++;
        } while (contador < 3);
        
    //  FOR
        System.out.println("\nCONTADOR for");
        for (contador=0; contador < 3; contador++) {
            System.out.println("contador = " + contador);
        }
    //  FOR continue y break
        System.out.println("\nCONTADOR for - continue y break");
        for (contador=0; contador < 3; contador++) {
            if (contador%2 !=0){
                continue;
            }
            System.out.println("contador con continue= " + contador);
        }
        for (contador=0; contador < 3; contador++) {
            if (contador%2 !=0){
                System.out.println("\ncontador con break= " + contador);
                break;
            }
        }
    
    //  FOR EACH - BUCLE MEJORADO
    //SINTAXIS: for (tipoDeDato nombreVariable : nombreDelArray) {código}
        System.out.println("\nCONTADOR for each");
        int[] numbers = {1,  2,  3,  4,  5};
        for (int number : numbers) {
            System.out.println(number);
        }
/**
 *  desde Java 8 con el lanzamiento del API Stream, puedes usar métodos 
 *  como IntStream.range() para trabajar con rangos numéricos.
 * SINTAXIS: IntStream.range(start, end).forEach(i -> { código });
 */        
        IntStream.range(0,  5).forEach(i -> System.out.println(i));
    }
}
