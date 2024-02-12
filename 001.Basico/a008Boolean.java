/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USR
 */
public class a008Boolean {
    public static void main(String args[]) {
        boolean varBoolean = false;
        System.out.println("varBoolean = "+varBoolean);
        
        if(varBoolean) { // al poner así interpreta q es igual a true
            System.out.println("La bandera es verdadera.");
        } else {
            System.out.println("La bandera es falsa.");
        }
        
        // otro ejemplo
        var edad = 30;
        //var esAdulto = edad >= 18; // devuelve true o false
        // java interpreta q es de tipo boolean
        
        //if(esAdulto) { // al poner así interpreta q es igual a true
        if(edad >= 18) { 
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        
    }
}
