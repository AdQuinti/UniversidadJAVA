
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
    }
}
