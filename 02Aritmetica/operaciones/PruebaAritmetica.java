
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();  // Instancia de la clase
        // ya podemos utilziar atributos y metodos de class Aritmetica()
        aritmetica1.a = 3; // asignamos valor
        aritmetica1.b = 2;
        aritmetica1.sumar();
        // declaramos variable q devuelve valor con misma propiedad q metodo
        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado de "+aritmetica1.a+" + "+aritmetica1.b+" = " + resultado);
        
        // llamada metodo y paso de parametros (argumentos q recibe)
        resultado = aritmetica1.sumarConArgumentos(5,8);
        System.out.println("Resultado con argumentos = " + resultado); // 13
        
    }
    
}
