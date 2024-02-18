/**
 * CONSTRUCTORES sirve para crear los objetos con distintos valores desde
 * la creación. Podemos tener uno o varios, y a tener varios se le llama
 * sobrecarga de constructores.
 * contructor - public pq se le accede a él desde otras clases y no se le indica
 * void pq non regresa nada
 * Su utilidad entre otras, cuando están vacios es que reservan espacio de
 * memoria
 */
package constructores;

public class Aritmetica {
    // contructor - public pq se le accede a él desde otras clases
    public Aritmetica() { 
        System.out.println("Ejecutando constructor.");
        /* no necesario inicializar variables pq por defecto pr ser atributos de
        la clase se lo pone él -> cero
        a=0;
        b=0;
        */
    }
/** SOBRECARGA CONSTRUCTORES
 * cuando hay dos o más constructores dentro de la misma clase
 */
    public Aritmetica(int arg1, int arg2) { //recibe dos argumentos
        this.a=arg1; // tributo de la clase -> this.a
        this.b=arg2;
        System.out.println("Ejecutando constructor con argumentos.");
    }
       
    // Metodo
    public void sumar() { 
        int resultado = a + b;
        System.out.println("Resultado Class Sumar "+a+" + "+b+" = " + resultado);
    }
    // metodo regresa suma
    public int sumarConRetorno() {
        return a + b;
    }
    public int sumarConArgumentos(int a,int b) { // recibe argumentos
        this.a = a;
        this.b = b; 
        return this.sumarConRetorno();
    }
    //Declaracion Globales
    int a, b;
}


