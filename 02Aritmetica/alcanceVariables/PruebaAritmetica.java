
package alcanceVariables;

public class PruebaAritmetica {

    public static void main(String[] args) {
        // variables locales pq se crean en este metodo y se destruyen cuando acaban
        // se puede utilizar var cuand es una linea y son locales
        var a = 10;
        var b = 2;
        // main solo puede llamar a métodos static pq él lo es, no a otros
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();  // Instancia clase a objeto
        System.out.println("Aritmetica a: "+aritmetica1.a);
        System.out.println("Aritmetica b: "+aritmetica1.b);
        // sale a y b con valores por defecto que es cero
        
        // llamamos constructor que recibe argumentos
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("Aritmetica a: "+aritmetica2.a);
        System.out.println("Aritmetica b: "+aritmetica2.b);
        
/* UNSO MEMORIA EN JAVA */ 
// no es común utilizarlo y pq es pesado -null- y System.gc
        // anula referencia a metodo y puede borrarse de memoria automaticamente
        aritmetica1 = null;
        System.gc();
// llamada recolector borrado memoria, no quiere decir q se ejecute en este momento

    }
    
    public static void miMetodo() {
        //a = 10; //-> da error pq está fuera del alcance dnd fue definida
        System.out.println("OTRO METODO");
    }
            
    
}
