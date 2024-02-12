
public class a013Igualdad {
    public static void main (String args[]) {
        var a = 3;
        var b = 2;
        
    // operador de igualdad ==
        var c = (a == b); // devuelve true o false
        System.out.println("c = " + c); // devuelve false
        
    // operador diferente a .... !
        c = a != b; // devuleve true o false
        System.out.println("c = " + c); // devuelve true
        
    // TRABAJANDO CON CADENAS - String
        var cadena1 = "Hola";
        var cadena2 = "Adios";
        var e = cadena1 == cadena2; // compara referencia de la memoria q almacena este objeto
        e = cadena1.equals(cadena2); // es la forma correcta comparar contenido
        System.out.println("e = " + e);
    
    
    
        
    }
    
}
