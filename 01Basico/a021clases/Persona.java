
package a021clases; //nombre paquete donde trabajamos

/**
 * Class - primeros ejercicios del curso Univ.Java
 * @author AdQuinti
 */

// puede recibir argumentos y mandar valores de retorno
public class Persona { 
//constructor se agrega de forma automatica, aunq no esté puesto
    // Atributos de la class - Global
    String nombre;
    String apellidos;
    
    public void desplegarInformacion() { // metodo dentro de clase
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
    }
    
}
