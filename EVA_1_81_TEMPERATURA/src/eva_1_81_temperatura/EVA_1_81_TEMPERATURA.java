/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_81_temperatura;

/**
 *
 * @author jcmkr
 */
public class EVA_1_81_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DE FAHRENHET A CELSIUS
        double Cel, fah ,kelvin;
        //CEL = 5(fAH- 32) / 9 
        fah = 65;
        Cel = (5 * (fah - 32)) /9 ;
        System.out.println("65 en celsius es : ");
        System.out.println( Cel );
        //CELSIUS A FAHRENHEIT
        // fah = 9*CEl / 5 + 32
        fah = (9 * Cel) / 5 + 32 ; 
        System.out.println(fah );
        //Celsius  a kelvin  
        // k= cel + 273.15
        kelvin = Cel + 273.15;
        System.out.println(kelvin);
        // TODO code application logic here
    }
    
}
