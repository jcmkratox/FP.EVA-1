/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_16_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner imput = new Scanner (System.in);
     double dato1 , dato2 ;
     System.out.println("DAME UN NUMERO ");
     dato1 = imput.nextDouble();
     System.out.println("DAME un segundo numero ");
     dato2 = imput.nextDouble();
     
     if(dato1 > dato2 ){
         System.out.println("EL NUMERO MAYOR ES ");
         System.out.println(dato1);
     }else{
          System.out.println("EL NUMERO MAYOR ES ");
         System.out.println(dato2);
        
     }
    }
    
}
