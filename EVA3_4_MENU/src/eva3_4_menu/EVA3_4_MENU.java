/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_menu;

/**
 *
 * @author Usuario
 */
public class EVA3_4_MENU {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String[] menu = {"tacos", "tortillas", "tamales", "tlacoyos", "tlayudas", "Pizza"};
                              //0          1          2              3                  4           6
    System.out.println("cantidad de elementos de arreglo: " + menu.length);
    for(int i = 0; i < menu.length; i++) {
        System.out.println(menu[i]);
    }
                             
   }
   
}
