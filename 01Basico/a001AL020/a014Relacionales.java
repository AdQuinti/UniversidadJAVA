package a001AL020;

public class a014Relacionales {
    public static void main (String args[]) {
        var a = 3;
        var b = 2;
        
        var c = a >= b; // mayor que > o mayor o igual >=
        System.out.println(a +" >= "+  b+" = " + c); // devuelve true
        
        int edad = 30, adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}
