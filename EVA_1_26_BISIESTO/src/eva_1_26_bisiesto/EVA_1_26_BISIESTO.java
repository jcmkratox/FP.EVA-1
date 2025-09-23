/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_26_bisiesto;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_26_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
    int num1 = 2000, num2 = 4, num3 = 100, num4 = 400 ;
    int resu, resu2 , resu3 ;
    resu3 = num1 % num3 ;
    resu2 = num1 % num4 ;
    resu = num1 % num2 ;
    System.out.println(resu);
    System.out.println(resu2);
    System.out.println(resu3);
    if (resu == 0 ){
        if (resu2 == 0 ){
            if(resu3 == 0 ){
                
            }else {
                System.out.println("el año");
            }            System.out.println("es bisiesto ");

            
                            
                    
        }else{
            System.out.println("el año");
            System.out.println("es bisiesto ");
            
        }
        System.out.println("puede ser bisiesto ");
        
    }
    }
    
}
