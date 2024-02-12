package a001AL020;

public class a005TemaPrimitivo {
    public static void main(String args[]) {
        /**
         * TIPOS PRIMITIVOS ENTEROS: byte, short, int, long
         * Los 8 bytes se almacenaran en 32bits, luego no ahorra
         * int -> es el más comunmente utilizado
         */
        byte numeroByte = (byte)129; //obliga convertir num int a tipo byte
        //puede dar fallo y no nos muestre todo el valor por convertirlo
        System.out.println("Valor variable: "+numeroByte);
        System.out.println("Valor mínimo byte: "+Byte.MIN_VALUE);
        System.out.println("Valor máximo byte: "+Byte.MAX_VALUE);
        
        //short numeroShort = 32768;
// error presición cuando superamos su valor de tipo short, tenemos riesgo perdida presición
        short numeroShort = (short)32768;// se le puede obligar
        System.out.println("NumeroShort = "+numeroShort);
        System.out.println("Valor mínimo short: "+Short.MIN_VALUE);
        System.out.println("Valor máximo short: "+Short.MAX_VALUE);
        
        //int numeroInt = 2147483648; //superamos su valor de tipo int 32bits
        // aunq le intentemos forzar sigue dando error
        int numeroInt = (int)2147483648L;// al forzar pierde presición
        //Hay que poner L al final y es tipo LONG de 64 bits
        System.out.println("Numero int = "+numeroInt);
        System.out.println("Valor mínimo int: "+Integer.MIN_VALUE);
        System.out.println("Valor máximo int: "+Integer.MAX_VALUE);
        
        long numeroLong = (long)9223372036854775808D;// al forzar pierde presición
        //Hay que poner F o D de tipo float o double
        System.out.println("Numero long = "+numeroLong);
        System.out.println("Valor mínimo long: "+Long.MIN_VALUE);
        System.out.println("Valor máximo long: "+Long.MAX_VALUE);
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = "+numeroFloat);
        System.out.println("Valor mínimo float: "+Float.MIN_VALUE);
        System.out.println("Valor máximo float: "+Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        // se puede poner o no la D al final para indicar q es double
        System.out.println("numeroDouble = "+numeroDouble);
        System.out.println("Valor mínimo double: "+Double.MIN_VALUE);
        System.out.println("Valor máximo double: "+Double.MAX_VALUE);
    }
}
