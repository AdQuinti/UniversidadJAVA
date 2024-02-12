
public class a015Condicionales {
    public static void main (String args[]) {
        var a = 10;
        var bvalorMinimo = 0;
        var valorMaximo = 10;
    
    // CONDICIONAL Y -> &&
        var resultado = a > 0 && a <= 10;
        System.out.println("resultado = " + resultado); // true
    
    // CONDICIONAL ó -> ||
        resultado = a > 0 || a <= 10;
        System.out.println("resultado = " + resultado); // true
    }
}
