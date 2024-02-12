package a001AL020;

/**
 * Label o Etiqueta 
 * Se le pone a un continue o break para indicar q se salta a otro punto 
 * del código del programa. No es aconsejable y ni recomendado a utilizar
 * pero hay programas antiguos que ya lo poseen.
 * @author AdQuinti
 */
public class a020ForLabel {
    public static void main (String args[]) {
        var contador = 0;
                
    //  FOR continue y break
        System.out.println("\nCONTADOR for - continue y break");
        inicio: // asi se declara y pone
        for (contador=0; contador < 3; contador++) {
            if (contador%2 !=0){
                continue inicio;
            }
            System.out.println("contador con continue= " + contador);
        }/*
        for (contador=0; contador < 3; contador++) {
            if (contador%2 !=0){
                System.out.println("\ncontador con break= " + contador);
                break inicio;
            }
        }*/
        
    }
}
