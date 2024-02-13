/**
 * Clases van nombradas con primera en Mayuscula y los atributos o metodos van
 * nombradas todo en minusculas.
 * 
 * public --> significa q podemos acceder a él
 * void --> está vacio (realiza operacion que creemos)
 * int --> maneja datos enteros (num)
 * class --> clase
 */
package operaciones;

public class Aritmetica {
    //public Aritmetica() { // contructor
    /* Se crea automaticamente, y reserva espacio memoria para utilizar
        objetos de esta clase. */
    //}
       
    // Metodo
    public void sumar() { 
        // Declaracion variables locales del metodo sumar()
        int resultado = a + b;
        System.out.println("Resultado Class Sumar "+a+" + "+b+" = " + resultado);
    }
    // metodo regresa suma
    public int sumarConRetorno() {
        //Declaracion Local
//        int resultado = a + b;
//        return resultado; // retorna resultado
        return a + b; // se puede poner en una linea y es opcional poner parentesis (a+b)
    }
    
    public int sumarConArgumentos(int arg1,int arg2) { // recibe argumentos o parametros
        // asignacion argumentos recibidos a nuevos atributos o valores
        a = arg1; 
        b = arg2;
        //return a + b; // regresa tipo entero
/* se puede reciclar return de funcion sumarConRetorno pq es igual a este
   return. por eso se llama a la funcion anterior */
        return sumarConRetorno();// toma valores ya modificado para envio
    }
    //Atributos de la clase - Declaracion Variales Globales
    int a, b;
}


