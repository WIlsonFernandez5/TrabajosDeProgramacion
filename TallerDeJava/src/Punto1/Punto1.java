
package Punto1;

import java.util.Scanner;


public class Punto1 {
    
     public static void main(String[] args) {
        
        // 1
        
        //declaración de variables
        int num1, num2,resultado=0 ;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.println("Introduce un número entero: ");
        num1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        num2 = sc.nextInt();      //lee un entero por teclado
        
        //mostrar resultado
        System.out.println("Ha introducido los números: " + num1 + " y " + num2); 
        System.out.printf("num1 = %d\n", num1 ); //---a
        System.out.printf("El valor de %d + %d es %d\n", num1, num2, ( num1 + num2 ) ); //--b
        //System.out.printf("x=%.2f", num1 ); //--c
        System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) );
        

     
        
    }
    
    
    
}
