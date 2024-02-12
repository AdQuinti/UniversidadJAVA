package a001AL020;
/** PRECEDENCIA DE OPERADORES EN JAVA
 * Orden en que se evaluan los operadores cuando se van procesando
 * @author AdQuinti
 */
public class a017PrecedenciaOperadores {
    public static void main(String args[]){
        int x = 5, y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3; // 4+((5*6)/3)
        System.out.println("resultado = " + resultado); // 14
        
        resultado = (4 + 5) * 6 / 3; // 18
        System.out.println("resultado = " + resultado);
    }
}
