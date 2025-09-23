/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_24_califas;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        double califa    ;
        System.out.println("Cual es tu califacion ");
        califa = imput.nextDouble();
 
        if(califa <= 59 && califa >= 0){
            System.out.println("Sacaste una F");
        }else if(califa <= 69 && califa < 59 ){
            System.out.println("Sacaste una D");
        }else if(califa <= 79 && califa < 69){
            System.out.println("Sacaste una C");
        }else if(califa <= 89 && califa < 79){
            System.out.println("Sacaste una B");
        }else if(califa <= 100 && califa < 89){
            System.out.println("Sacaste una A");
        }else{
            System.out.println("no calificacion ");
        }
            
            
    }
    
}
