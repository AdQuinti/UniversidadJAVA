package a001AL020;
/** 
 * Tabla utiliza en la web
 * https://en.wikipedia.org/wiki/List_of_Unicode_characters
 * @author AdQuinti
 */
public class a007Caracter {
    public static void main(String args[]) {
        char miCaracter = '\u0021'; // codigo del caracter "!"
        System.out.println("miCaracter = " + miCaracter);
        
        char varCharDecimal = 33; // numero del caracter "!"
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = "+varCharSimbolo);
        
    // AHORA CON VAR
        System.out.println("AHORA CON VAR");
        var varChar = '\u0021'; // codigo del caracter "!"
        System.out.println("varChar = " + varChar);
        
        var varCharDecimal2 = 33; // aqui interpreta q es INT y no CHAR
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolo2 = '!';
        System.out.println("varCharSimbolo2 = "+varCharSimbolo2);
        
    // AHORA CON INT
        System.out.println("AHORA CON INT");
        int variableEnteraSimbolo = '!';
        // lo interpreta con su código decima (del caracter)
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
    // se utiliza paa sabar el codigo de la letra o caracter que queramos
        int letra1 = 'a', letra2 = 'A';
        System.out.println("letra a = "+letra1+"\nletra A = "+letra2);
                            // saldra Num caracter decimal 97 y 65
    }
}
