/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_11_captura;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_11_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // solicitar escaner 
        Scanner imput = new Scanner (System.in);
        // dar datos 
        double dis , tiempo , velos ;
        // calculo de velocidad 
        // solicitar distancia (M)y tiempo (S) 
        //dar variables y scaner 
        System.out.println("calcula la distancia en (metros ): ");
        dis = imput.nextDouble();
        System.out.println("captura el tiempo ( en segundos): ");
        tiempo = imput.nextDouble();
        // realiza calculos 
        velos = dis / tiempo ;
        // mostar resultados 
        System.out.println("la velocidad en (M/S) es: ");
        System.out.println(velos );
        
                
    
    
    
    }
    
}
