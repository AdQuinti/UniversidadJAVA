// CLASE 063
package a062this;

public class PalabraThis {
     public static void main (String[]agrs) {
        Persona persona = new Persona("Juan","Perez");
        System.out.println("persona = " + persona); 
//sale -> persona = a062this.Persona@15aeb7ab
    
// si imprimimos valores independientemente
        System.out.println("persona nombre: "+persona.nombre);
        System.out.println("persona apellido: "+persona.apellido);
    }
    
}

class Persona {
    String nombre;
    String apellido;
    
// Persona al ser object HEREDA del tipo object todas sus propiedades y cualidades
    Persona(String nombre, String apellido) { // constructor
// aunq no se vea hay una llamada al contructor de la clase padre super()-> es vacio y reserva espacio memoria
        //super(); // llamada implicita al constructor de la clase padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        //mandamos imprimir object persona dentro del a misma Class Persona
        System.out.println("Objeto persona usando this: "+this);
// se ejecuta primero pq es el constructor

/** run:
 *       Objeto persona usando this: a062this.Persona@15aeb7ab
 *       persona = a062this.Persona@15aeb7ab
 *       persona nombre: Juan
 *       persona apellido: Perez */
    new Imprimir().imprimir(this); // es = -> Imprimir imprimir = new Imprimir();
    /* debido a q estamos en constructor this apunta al objeto tipo Persona, 
       luego pasamos su referencia de tipo Persona (en linea 6) y la pasamos
       al metodo Imprimir */
    }
}

class Imprimir {
    
    //no necesario, se crea interamente y automaticamente
    /*
    public Imprimir() { // CONSTRUCTOR
        super(); // llamada a clase Padre -> Object - para reservar memoria
    }*/
    
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: "+persona); 
// se manda a consola el objeto q se creo en primeras lineas, Persona
        System.out.println("impresión objeto actual (this): "+this);
/* this imprime aquí el objeto del tipo Imprimir q apunta en la linea 48 q 
   no necesariamente debe estar escrita, pq se crea automaticamente */
        
    }
}

/** SALE SIGUIENTE CODIGO POR CONSOLA
 * run:
 * Objeto persona usando this: a062this.Persona@15aeb7ab (linea 28)
 * persona desde imprimir: a062this.Persona@15aeb7ab (linea 52) // misma ubicacion memoria
 * impresión objeto actual (this): a062this.Imprimir@6acbcfc0 (linea 54)
 * persona = a062this.Persona@15aeb7ab (linea 7)
 * persona nombre: Juan (linea 11)
 * persona apellido: Perez (linea 12)
 */