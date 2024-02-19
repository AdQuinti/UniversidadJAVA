
package laboratoriocajaclase58;

/**
 * @author AdQuinti
 * @date 18/02/2024
 * Parte del ejercicio con enunciado en Caja.java
 */
public class PruebaCaja {
    public static void main(String args[]) {
    // DECLARACION VARIABLES
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;

        Caja caja1 = new Caja(); // instanciamos
        caja1.ancho = medidaAncho; // valores de class Caja()
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        int resultado = caja1.calcularVolumen(); //recogemos valor return

        System.out.println("resultado volumen de caja 1:" + resultado);

        Caja caja2 = new Caja(2, 4, 6); // envio otros valores de prueba
        System.out.println("resultado volumen de caja 2:" + caja2.calcularVolumen());
    }
}