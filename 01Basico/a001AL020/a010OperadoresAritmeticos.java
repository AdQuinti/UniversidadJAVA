package a001AL020;

public class a010OperadoresAritmeticos {
    public static void main(String[]args) {
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("Resultado suma "+a+" + "+b+" = "+resultado);
        resultado = a - b;
        System.out.println("Resultado resta "+a+" - "+b+" = "+resultado);
        resultado = a * b;
        System.out.println("Resultado multi "+a+" x "+b+" = "+resultado);
        var resultado2 = 3D / b; //la D indica Double
        System.out.println("Resultado divi "+a+" / "+b+" = "+resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo "+a+" % "+b+" = "+resultado);
        if(a%2 == 0) // comprobar si es par o impar variable a ó b
            System.out.println("Es número par.");
        else
            System.out.println("Es número impar.");
    }
}
