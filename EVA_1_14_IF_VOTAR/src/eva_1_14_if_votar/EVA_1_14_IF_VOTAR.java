/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_14_if_votar;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_14_IF_VOTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //DECLACION DE VALORES
      double edad ; 
      Scanner captu = new Scanner (System.in);
      //captura 
      System.out.println("INTRODUCE TU FECHA DE nacimiento  ");
      edad = captu.nextDouble();
      if (edad >= 2007){ 
      System.out.println("felizitaciones puedes votar ");
    }else{
              System.out.println("NO PUEDES VOTAR");
              }
    }
    
}
