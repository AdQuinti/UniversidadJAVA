// primera clase de this y explicación primera  - CLASE 062 - 
package a062this;

public class PalabraThis1 {
    public static void main (String[]agrs) {
        Persona1 persona = new Persona1("Juan","Perez");
// creamos variable y un objeto tipo String de esta clase
        //Persona persona = new Persona(new String ("Juan"),"Perez")
/** new String ("Juan") -> indica q esta en una apartado memoria unica y 
 *      aunque repitamos el objeto identico, se guardaria en otro espacio
 *      memoria unico y distinto al anteiror.
 * "Perez" -> espacio de memoria pullstring o de cadena reutilizable, devolveri
 *       misma referencia creada en pullstring*/
        System.out.println("persona = " + persona); 
//sale -> persona = a062this.Persona@15aeb7ab
/** objeto (persona) esta en el paquete (a062this) de class Persona y
 * @15aeb7ab -> indica posicion memoria donde está el objeto */
    
// si imprimimos valores independientemente
        System.out.println("persona nombre: "+persona.nombre);
        System.out.println("persona apellido: "+persona.apellido);
    }
    
}

/* cm solo puede a ver en un mismo archivo una clase public al resto
 * se inicia con class directamente */

// a esta clase solo se le puede acceder dentro dl mismo package dnd está
class Persona1 { //modificador de acceso predeterminado es default o package
    String nombre; //los atributos tambien son default o package
    String apellido;
    
//modificador de acceso predeterminado es default o package
    Persona1(String nombre, String apellido) { // constructor
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
