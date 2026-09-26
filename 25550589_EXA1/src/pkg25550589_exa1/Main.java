/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25550589_exa1;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner captu = new Scanner (System.in );
      int edad , canti ;
       String nombre ,  menbresia  , nombreproducto  ;
       double iva  ,  total,pago , cambio, precio, impor    ;
       // CAPTURAR DATOS 
       System.out.println("captura el nombre DEL cliente ");
        nombre = captu.nextLine();
        System.out.println("captura la edad");
        edad = captu.nextInt();
        System.out.println("captura el producto");
         nombreproducto = captu.next();
        System.out.println("datos cantidad comprada ");
        canti = captu.nextInt();
        System.out.println("datos precio u/n");
        precio = captu.nextDouble();
        System.out.println("datos menbresida ");
        menbresia = captu.next();
        // EXPRECIONES Y ASIGATURA 
        impor = (precio * canti );
        iva = (impor * 0.16);
        total = (impor + iva);
        System.out.println("total + iva " +total );
        //proceso de pago y cambio 
        System.out.println("cuanto pago el cliente ");
        pago = captu.nextDouble();
        cambio = ( pago - total );
        // recibo 
        System.out.println("====================================");
        System.out.println("           RESUMEN DE COMPRA        ");
        System.out.println("====================================");
        System.out.println("");
        System.out.println("");
        System.out.println("cliente: " + nombre );
        System.out.println("edad: " + edad );
        System.out.println("producto: " + nombreproducto );
        System.out.println("cantidad: "+ canti );
        System.out.println("precio unitario: " + precio );
        System.out.println("tiene menbresia: " + menbresia);
        System.out.println("");
        System.out.println("importe: "+ impor );
        System.out.println("iva: " + iva );
        System.out.println("total: "+ total);
        System.out.println("");
        System.out.println("pago: " + pago );
        System.out.println("cambio: " + cambio );
        System.out.println("====================================" );
        
        
        
        
    }
    
}
