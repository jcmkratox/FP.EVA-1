/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_28_moneda;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_28_MONEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner imput = new Scanner (System.in);
    int usario ;
    System.out.println("Elige aguila o sello (1/0):");
    usario = imput.nextInt();
    //como nacamos la modenda
    
    if(Math.random()< 0.5){
        System.out.println("agula ");
    if(usario < 0.5){
    System.out.println("as ganado ");
    }
    }else 
        System.out.println("sello ");
        System.out.println("no ganaste ");    
        }
}
   
