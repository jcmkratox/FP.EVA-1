/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_13_if;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner captu = new Scanner (System.in);

        //DECARACION DE VARIABLES 
        double califa ;
        //captura 
        System.out.println("introduce tu califacacion ");
        califa = captu.nextDouble();
        //ESTRUCTURA DE CONTROL IF - HEN - ELSE 
        // IF SOLO EVALUA VERDADERO (TRUE ) O FALSO(FALSE )
        if (califa >= 70) {
            //AQUI A LO QUE CORRESPONDE A VERDARERO
            System.out.println("felicitaciones , aredistaste ");
              
        }else{    // SECCION FALSO (OPCIONAL) 
            System.out.println("zotes ");
        }
    }
    
}
