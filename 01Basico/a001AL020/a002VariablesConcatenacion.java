package a001AL020;
// con boton derecho format en NetBeans se coloca el codigo con tabulacion
public class a002VariablesConcatenacion {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("Union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j); // se realiza suma numeros
        System.out.println(i + j + usuario); // evalua izq a der.
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j)); // modifica prioridad
    }
}
