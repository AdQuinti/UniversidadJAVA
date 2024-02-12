package a021clases;

/**
 * main de la class persona
 * @author AdQuinti
 */
public class PruebaPersona {
    
    public PruebaPersona (){} // constructor
        
    public static void main(String[] args) {
    // atributos de la clase
        //tipo igual q a funcion en class Persona q llamamos
        Persona persona1;
        // creación obejto
        persona1 = new Persona(); // llamamos a constructor aunq no se creo fisicamente en class Persona
        /* reserva memoria para crear objeto y vuelve referencia a persona1,
        ya podemos acceder a metodos y atributos definidos en la class*/
        persona1.nombre="Juan"; //modificamos valor nombre del objeto Persona()
        persona1.apellidos="Perez";
        // desplegue información de la clase -saca por pantalla
        persona1.desplegarInformacion();
    
        // creamos otro objeto
        Persona persona2 = new Persona();  // INSTANCIA objeto Class
        System.out.println("persona1 = " + persona1);
        // persona1 = a020clases.Persona@15aeb7ab
        // @15aeb7ab -> referencia memoria del objeto
        System.out.println("persona2 = "+persona2);
        // sale -> persona2 = a020clases.Persona@15aeb7ab
        
        //sacamos por pantalla directamente sin asignar datos
        persona2.desplegarInformacion();
        // saldrá null q es lo q se asigna por defecto en tipo Object
        // modificamos valores del objeto Persona()
        persona2.nombre="Karla";
        persona2.apellidos="Lara";
        persona2.desplegarInformacion();
        
        
        
        
    }
}
