package a001AL020;
/**
 * Si le damos a modo prueba fallo Debug, en la pestaña q nos sale abajo
 * de variable, podemos ver cm nos va reconociendo el tipo de nuestras 
 * variables que vamos declarando
 * @author AdQuinti
 */
public class a006Var {
        public static void main(String args[]) {
            var numeroEntero = 10;
            System.out.println("numeroEntero = "+numeroEntero);
            
            var numeroDouble = 10.0;
            System.out.println("numeroDouble = "+numeroDouble);
            
            var numeroFloat = 10.0F; // para que coja tipo hay que poner F
            System.out.println("numeroFloat = "+numeroFloat);
        }
}
