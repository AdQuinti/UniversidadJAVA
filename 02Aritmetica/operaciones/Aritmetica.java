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
    // arg se podria poner a y b respectivamente para saber q valores recibe concretamente
    public int sumarConArgumentos(int arg1,int arg2) { // recibe argumentos o parametros
        // aqui a A y B se le asgina nuevos valores q vienen de Funcion PruebaAritmetica
        this.a = arg1; // this apunta a direccion memoria a y b
        this.b = arg2; // el uso de this es opcional
        // this solo se puede utlizar en la clase q estmaos trabajando
        //this hace referencia a un atributo d nuestra clase y no variable local
        //return a + b; // regresa tipo entero
/* se puede reciclar return de funcion sumarConRetorno pq es igual a este
   return. por eso se llama a la funcion anterior */
        return this.sumarConRetorno();// toma valores ya modificado para envio
    }
    //Atributos de la clase - Declaracion Variales Globales
    int a, b;
}


