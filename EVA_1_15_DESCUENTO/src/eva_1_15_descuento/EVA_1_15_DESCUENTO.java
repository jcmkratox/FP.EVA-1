/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_15_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner (System.in);
           double precio ,desc ;
       System.out.println("DAR EL PRECIO TOTAL" );
       precio = captu.nextDouble();
       if (precio >= 1000){
       desc = (precio * 0.85 );
       System.out.println("este es el total con descuento ");
       System.out.println(desc);
        
       
       
     
     
       
      }
               
       
    }
    
}
