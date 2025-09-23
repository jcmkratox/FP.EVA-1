/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_12_.operaciones._bopleanas;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_12_OPERACIONES_BOPLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner imput  = new Scanner (System.in);
        int radio = 5;//DECLARACION E INICIALIZO 
        boolean resu;// true false 
        //USO DE OPREDORA BOOLEANOS 
        
        resu = radio > 0;//radio (5) == 0
        System.out.println("radio (5) == 0 es :");
        System.out.println(resu);
        
        resu = radio < 0;//radio (5) == 0
        System.out.println("radio (5) == 0 es :");
        System.out.println(resu);
        
        resu = radio != 0;//radio (5) == 0
        System.out.println("radio (5) == 0 es :");
   
        System.out.println(resu);
    }
    
}
