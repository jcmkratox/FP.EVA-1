/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_23_compras;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_23_COMPRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String efectivo , credito ;
    Scanner imput = new Scanner (System.in);
    System.out.println("TIENE EFECTIVO ");
    efectivo = imput.nextLine();
    System.out.println("TIENE credito  ");
    credito = imput.nextLine();
    if ((efectivo.equals("si"))||(credito.equals("si"))){
    System.out.println("puedes comprar ");
    }else {
        System.out.println("no puedes comprar");
    }
    
        
    }
    
}
