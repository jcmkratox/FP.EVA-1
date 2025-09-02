/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre; 
        int edad;
        double promedio ;
        Scanner input = new Scanner(System.in);// creamos el scanner 
        System.out.println("introduce el nombre completo ");
        System.out.println("introduce tu edad ");
        System.out.println("introduce tu promedio ");
        
        //como captura en java 
        nombre = input.nextLine();// nexLine()-- captura texto
        edad = input.nextInt();
        promedio = input.nextInt();
        System.out.println("EL NOMBRE COMPLETO ES ");
        System.out.println(nombre );
        System.out.println("tu edad es ");
        System.out.println(edad);
        System.out.println("tu promedio es ");
                System.out.println(promedio);
        
        // TODO code application logic here
    }
    
}
