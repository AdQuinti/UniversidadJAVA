/**
 * Cuando se utilice return al metodo hay que quitarle void e indicarle de que
 * tipo vamos a devolver valor int, String o object (para ello ponemos directamente
 * el nombre del objeto, en el caso del ejemplo es Persona).
 * En misma lina dnd enviamos valor a modificar al metodo cambiarValor le igualamos
 * esa linea a la propiedad objetcto persona1 y es la q recibirá el valor ya
 * modificado. (en linea 22)
 * 
 * 
 */
package a061return;

import a021clases.Persona;

public class PasoPorReferencia {
    public static void main (String [] args) {
        Persona persona1 = new Persona(); //instancia
        persona1.nombre = "Juan"; //modificamos atributo
        System.out.println("persona1 nombre = " + persona1.nombre);
    // para ejemplo comentar todo lo de arriba - 3 lineas anteriores y linea 23
        // Persona persona1 = null; // para probar el null del return en if
        persona1 = cambiarValor(persona1); //mandamos valor y lo recibimos
        System.out.println("persona1 cambio = "+persona1.nombre);//valor modificado
        
    }

    /* le indicamos q regresa un Object (Persona) */
    public static Persona cambiarValor(Persona persona) { //recibe (class Variable)
        // podemos utilizar return varias veces en mismo metodo, de esta forma
        if(persona == null){ // si no apunta a un objeto
            return persona;// que vuelva
            //aqui ya no se puede añadir más y dá error
        }
        persona.nombre = "Karla"; // se pone aqui para q no dé fallo
        return persona; // lo recibe persona1 (en linea 22)
        //aqui ya no se puede añadir más y dá error
    }
    /*
    // si ponemos como void - java te crea metodo return para poder enviar modificacion
    public static void cambiarValor(Persona persona) { //recibe (class Variable)
        persona.nombre = "Karla";
        return; // lo crea así implicitamente sin indicarle nada y ni necesidad de ponerlo. Internamente
    } */
}