
/** TAREA - RECTANGULO
 * Se solicita calcular el área y perímetro de un Rectángulo
 * @author AdQuinti
 */

import java.util.Scanner;

public class t017Rectangulo {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("DATOS DE UN RECTÁNGULO\nProporciona el alto: ");
        int alto = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Proporciona el ancho: ");
        int ancho = Integer.parseInt(scanner.nextLine());
        
        var area = ancho * alto;
        var perimetro =  2 * (ancho + alto);
        System.out.println("Datos del réctangulo proporcionado por usuario:");
        System.out.println("Área: "+area);
        System.out.println("Perímetro: "+perimetro);
    }
}
