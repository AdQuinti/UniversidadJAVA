package a001AL020;

public class a012OperadoresUnarios {
    public static void main(String[]args) {
        var a = 3;
        var b = -a; // guarda valor negativo que haya en a, luego -3
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        var c = true;
        var d = !c; // guarda valor distinto a que haya en c, luego false
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
    // incremento
    //1. preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
    //2. postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        // Decremento
    //1. predecremento (simbolo antes de la variable)
        e = 3;
        f = --e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
    //2. postdecremento (simbolo despues de la variable)
        g = 5;
        h = g--;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}
