
package Punto5;

import java.util.Scanner;


public class Punto5 {
    public static void main(String[] args)  {
         
         Scanner sc = new Scanner(System.in);
    
            
         System.out.println("Introduzca un caracter ");
         char caracter1 = sc.next().charAt(0);
         
         int numero = Integer.valueOf(caracter1); //convertimos el caracter a numero
         
         System.out.println("El codigo es :" + numero);
         
     }
}
