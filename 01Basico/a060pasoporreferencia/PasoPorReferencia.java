// importamos class de otros paquetes para trabajar con ellos
/** PASO POR VALOR POR REFERENCIA **/
/* Es cuando se puede acceder de otros metodos a un objeto q está en otra clase
*  sin que este en este.
*/

//NOMBRE PAQUETE
package a060pasoporreferencia;

//IMPORT que necesitemos
import a021clases.Persona;

// DEFINICION DE CLASE O CLASES
public class PasoPorReferencia {
    public static void main (String [] args) {
        Persona persona1 = new Persona(); // IMPORTAMOS Class Persona - instanciamos
        // hemos almacenado la referencia, pq es de tipo Object
        persona1.nombre = "Juan"; //modificamos atributo de nombre
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1); //mandmos valor
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
// al contrario de las PRIMITIVAS, con object si devuelve valor modificado
    }
/* persona1 y persona en class CambiaValor estar referenciando o apuntando al
* al mismo objeto. El Object es el del archivo 'Persona.java' en Class Persona()
    - quiere decir que tienen la misma referencia de memoria que la original y
    por eso pueden modificar el objeto. Tambien pq este fue modificado a Public
    y permite su acceso.
*/
    public static void cambiarValor(Persona persona) { //recibe (class Variable)
        persona.nombre = "Karla";
        // no necesario return pr ser de tipo void.
    }
}
