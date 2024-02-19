/** concepto paso por valor:
 * Si pasamos un valor de un método primitivo a otro  * metodo solo se pasa
 * la copia del valor.
 */
package a059PasoPorValor;

public class PasoPorValor {
    public static void main(String[]args) {
        var x = 10;// se utiliza var pq es una variable local a este metodo
        /* no se puede modificar esta variable local en otro metodo pq solo se
        pasa la copia del valor a otro metodo primitivo */
        System.out.println("x = "+x);
        
        // llamamos metodo y pasamos cm valor variable x, pasamo solo copia
        cambioValor(x);
        System.out.println("x Nuevo valor = "+x); // 10
        // pese a q debería mostrar valor modificado, muestra valor original,
        // pq no puede ser modifcado en otra funcion.
    }
    
    // tiene que ser static pr estar cn el main y void pq no envia nada
    public static void cambioValor(int arg1) {
        System.out.println("arg1 = " + arg1);// llega copia del valor
        arg1 = 15;
    }
}
