
package Punto10;

import java.util.Scanner;


public class Punto10 {
     public static void main(String[] args) {
     
         
        float kilogramos;
        float gramos, libras, toneladas;
        double libra;
        
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Ingrese el peso en kilogramos");
         kilogramos = sc.nextFloat();
         
         
         gramos = kilogramos * 1000;
         
         libra = 2.20 * kilogramos;
         
         libras = (float) libra;
         
         toneladas = kilogramos/1000;
     
         System.out.println("El peso ingresado es : " + kilogramos);
         System.out.println("El peso en gramos es : " + gramos);
         System.out.println("El peso en libras es de : " + libras);
         System.out.println("El peso en toneladas es de : " + toneladas);
     }
    
    
    
}
