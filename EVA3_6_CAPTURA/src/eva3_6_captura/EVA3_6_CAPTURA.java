/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_6_CAPTURA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      String nombres[];
      int cant;
      int edad[];
      
     System.out.println("cantidad de clientes a capturar");
     cant = captu.nextInt();
     captu.nextLine();
     nombres = new String[cant];
     edad = new int[cant];
      for (int i = 0; i < nombres.length; i++) {
         System.out.println("introduce el nombre del cliente");
         nombres[i] = captu.nextLine();
         System.out.println("introduce la edad del cliente: ");
         edad[i] = captu.nextInt();
         captu.nextLine();
         
      }
       System.out.println("datos capturados");
       for (int i = 0; i < nombres.length; i++) {
           System.out.println("nombres: " + nombres[i] + ", edad: " + edad[i]);
         
      }
   }
   
}
