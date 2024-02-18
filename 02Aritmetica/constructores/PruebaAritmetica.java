
package constructores;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();  // Instancia clase a objeto
        System.out.println("Aritmetica a: "+aritmetica1.a);
        System.out.println("Aritmetica b: "+aritmetica1.b);
        // sale a y b con valores por defecto que es cero
        
        // llamamos constructor que recibe argumentos
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("Aritmetica a: "+aritmetica2.a);
        System.out.println("Aritmetica b: "+aritmetica2.b);
    }
    
}
