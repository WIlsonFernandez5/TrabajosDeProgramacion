
package Punto11;

import java.util.Scanner;

public class Punto11 {
    public static void main(String[] args) {
     
         
       int numero = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero positivo ");
        numero = sc.nextInt();
        
        int miles = numero / 1000;
        int centenas = (numero -(miles*1000))/100;
        int decenas = (numero - (miles*1000 + centenas * 100))/10;
        int unidades = numero - (miles*1000 + centenas*100 + decenas*10);
        
        System.out.println("Mil : " + miles);
        System.out.println("Centenas : " + centenas);
        System.out.println("Decenas : " + decenas);
        System.out.println("Unidades : "+ unidades);
        
    }
    
}
