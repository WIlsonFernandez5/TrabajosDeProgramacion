
package Punto3;

import java.util.Scanner;


public class Punto3 {
    
    
         public static void main(String[] args) {
     
            
         //declaración de variables
       
        Scanner sc = new Scanner(System.in);
         float num1,num2,num3 ;
        float resultadosuma, resultadopromedio,resultadoproducto, resultadocociente, resultadomodulo; 

        //leer el primer número
        System.out.println("Introduce un número decimal: ");
        num1 = sc.nextFloat();      //lee un numero por teclado

        //leer el segundo número
        System.out.println("Introduce otro número decimal: ");
        num2 = sc.nextFloat();      //lee un numero por teclado
        
        //leer el tercer número
        System.out.println("Introduce otro número decimal: ");
        num3 = sc.nextFloat();      //lee un numero por teclado
        
        
        //mostrar resultado
        System.out.println("Ha introducido los números: " + num1 + " y " + num2 + " y " + num3); 
        
        resultadosuma = num1 + num2 + num3;
        
        resultadopromedio = (num1 + num2 + num3) / 3; 
        
        resultadoproducto = num1 * num2 * num3;
        
        resultadocociente = num1 / num2 / num3;
        
        resultadomodulo = num1%num2%num3;
        
        System.out.println("El resultado de la suma es de " + resultadosuma);
         
        System.out.println("El resultado del promedio es:  " + resultadopromedio);
        
        System.out.println("El resultado del producto es : " + resultadoproducto);
        
        System.out.println("El resultado del cociente es : " + resultadocociente);
        
        System.out.println("El resultado del modulo es : " + resultadomodulo);
         
     
     
     
     }
    
}
