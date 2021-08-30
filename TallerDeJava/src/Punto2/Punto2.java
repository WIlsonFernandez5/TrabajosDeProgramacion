
package Punto2;

import java.util.Scanner;


public class Punto2 {
    
    public static void main(String args[]) {
        
       Scanner entrada = new Scanner(System.in);
       
       int num1;
       int num2;
       int suma;
       int producto;
       int diferencia;
       
        System.out.println(" ingrese primer numero entero "); 
        num1 = entrada.nextInt();
        
        System.out.println(" ingrese segundo numero entero ");
        num2 = entrada.nextInt();
        
        suma = num1 + num2;
        producto = num1 * num2;
        diferencia = num1 - num2;
        
        System.out.printf(" la suma de los numeros es: %d\n ", suma);
        System.out.printf(" el producto de los numeros es: %d\n ", producto);
        System.out.printf(" la diferencia de los numeros es: %d\n ", diferencia);
        
        
        
       
  
    }
    
}
