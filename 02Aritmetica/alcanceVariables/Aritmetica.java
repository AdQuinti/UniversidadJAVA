/**
 * ALCANCE DE VARIABLES EN JAVA
 * 
 */
package alcanceVariables;

public class Aritmetica {
    // contructor vacio
    public Aritmetica() { 
        System.out.println("Ejecutando constructor.");
    }
    // constructor con argumentos
    public Aritmetica(int arg1, int arg2) { 
        this.a=arg1;
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
    //ATRIBUTOS DE CLASE
    int a, b;
}


