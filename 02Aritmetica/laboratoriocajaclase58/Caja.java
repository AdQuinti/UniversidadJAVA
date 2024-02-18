
/**
 * Ejercicio Universidad JAVA
 * Se solicita crear una clase llamada Caja con las siguientes características:
 *  - Tener 3 atributos de tipo entero (ancho, alto y profundo)
 *  - Tener 2 constructores, uno vacío y uno con 3 argumentos, uno por cada
 *    atributo de la clase.
 *  - Tener método que calcule el volumen de la caja según la formula de la
 *    lámina anterior.
 *  - Crear una clase de prueba para crear un objeto de tipo caja que tenga
 *    como valores: ancho=3, alto=2, profundo=6 y que mande a imprimir el
 *    volument de la caja según los valores proporcionados anteriormente.
 * 
 *  - TAREAS EXTRAS -
 *     * Probar con el modo debug del IDE y verificar paso a paso.
 *     * Probar con distintos valores y verificar el resultado.
 * @author AdQuinti
 * @date 18/02/2024
 */
package laboratoriocajaclase58;

public class Caja {
int ancho;
    int alto;
    int profundo;

    public Caja() { // constructor
    }

// otro constructor que recibe argumentos
    public Caja(int ancho, int alto, int profundo) { 
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

// calcula Volumen de la CAJA
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
