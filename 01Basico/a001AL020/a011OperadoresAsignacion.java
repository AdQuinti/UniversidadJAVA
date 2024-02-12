package a001AL020;

public class a011OperadoresAsignacion {
    public static void main(String[]args) {
        int a = 10, b = 2;
        var c = a + 5 - b;
        System.out.println("c = "+c);
        
        a += 1; // operador composición o de incremento
        System.out.println("a = "+a);
        
        a += 3; // a = a + 3
        System.out.println("a = "+a);
        
        a -= 2; // a = a - 2
        System.out.println("a = "+a);
        
        a *= 3; // a = a + 3
        System.out.println("a = "+a);
        
        a /= 2; // a = a + 3
        System.out.println("a = "+a);
        
        a %= 2; // a = a + 3
        System.out.println("a = "+a);
    }
}
