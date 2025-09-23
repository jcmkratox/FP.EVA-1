/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_19_acceso;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_1_19_ACCESO {
    final static String Acceso_usu = "joaquin" ;
    final static String Acceso_contra = "123";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String usario , contra ;
    Scanner captu = new Scanner (System.in);
    System.out.println("*****CONTROL DE ACCESO******");
    System.out.println("RESTARUANTE LA CUCARACHA " );
    System.out.print("usario " );
    usario =captu.nextLine();
    System.out.print("contraseña :" );
    contra = captu.nextLine();
    if (usario.equals(Acceso_usu)){
    if (contra.equals(Acceso_contra)){
        System.out.println("correcto" );
    }else {
                    System.out.println("acceso denegado " );
    }
                }
    else {
        System.out.println("incorrecto");
    }
        
    }
    
    
    }
    