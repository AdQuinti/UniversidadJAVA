
public class a003CaracteresEspeciales {
    public static void main(String args[]) {
        var nombre = "Karla";
        
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        // se puede poner repetido \b\b -> retroceso
        System.out.println("Retroceso: \b" + nombre); 
        System.out.println("Comilla simple: \'" + nombre+ "\'");
        System.out.println("Comilla doble: \"" + nombre+ "\" ");
    }
}
