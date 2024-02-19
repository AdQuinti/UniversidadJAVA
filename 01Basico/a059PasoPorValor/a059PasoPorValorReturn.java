/** concepto paso por valor:
 * Para que si devuelva un valor modificado, debemos indicarle q devuelve un int
 * y ponerle return a la función dnd fue modificado
 */
package a059PasoPorValor;

public class a059PasoPorValorReturn {
    public static void main(String[]args) {
        var x = 10;
        System.out.println("x = "+x);
        
        // llamamos metodo y pasamos cm valor variable x, pasamo solo copia
        x = cambioValor(x);
        System.out.println("x Nuevo valor = "+x); // 15

    }
    
    // tiene que ser static pr estar cn el main y int devuelve valor modificado
    public static int cambioValor(int arg1) {
        System.out.println("arg1 = " + arg1);// llega copia del valor
        return arg1 = 15;
    }
}
