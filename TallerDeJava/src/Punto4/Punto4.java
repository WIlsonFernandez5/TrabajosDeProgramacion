
package Punto4;

import java.util.Scanner;

public class Punto4 {
    
    public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
           double radio, longitud, area;
           System.out.println("Introduce radio de la circunferencia:");
           radio = sc.nextDouble();
           longitud = 2 * Math.PI * radio;
           area = Math.PI * radio * radio;
           System.out.println("Longitud de la circunferencia -> " + longitud);                                    
           System.out.println("Area de la circunferencia -> " + area);
         
         
     
     
     
     
     
     }
    
}
