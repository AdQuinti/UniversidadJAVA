package a001AL020;
// Mi clase en JAVA
public class a001VariablesDeclaracion {
    public static void main(String args[]) {
        // Definimos variable
        int miVariableEntera = 10;
        String miVariableCadena = "Saludos";
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        System.out.println(miVariableCadena);
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        // var - Inferencia de tipos en Java
        var miVariableEntera2 = 30; // tambien puede referenciar de objetos
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Variable Cadena";
        System.out.println(miVariableCadena2);
        System.out.println((miVariableCadena2).getClass().getSimpleName()); 
        // getClass() -> devuelve tipo de variable, de forma larga
        // getSimpleName -> devuelve tipo de forma corta
        System.out.println(((Object)miVariableEntera2).getClass().getSimpleName());
        // al ser entero antes q convertirlo a Objeto
        
        //Union CADENA o CONCATENACIÓN
        System.out.println(miVariableEntera2+miVariableCadena2);
        
        // FORMAS DECLARAR VARIABLES - peritidas
        var miVariable = 1; // opcion Camell
        var _miVariable = 2; // con "_" al principio
        var $miVariable = 3; // con "$" al principio
        //No permitido caracteres especiales como #
    }
}