
package Punto6;

import java.util.Scanner;


public class Punt06 {
       public static void main(String[] args)  {
    
        
         Scanner sc = new Scanner(System.in);
         
         int peso;
         float altura;
         float resultadoBMI;
         String nombre;
         System.out.println("Ingrese el nombre : ") ;
         nombre = sc.next();
         System.out.println("Ingrese el peso : ");
         peso = sc.nextInt();
         System.out.println("Ingrese la altura : ");
         altura = sc.nextFloat();
         
         resultadoBMI = peso / altura*altura;
         
         //mostrar resultado
        System.out.println("La persona " + nombre + " tiene el resultado del BMI en :" + resultadoBMI ); 
    


    
    }
    
}
