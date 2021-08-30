
package Punto7;

import java.util.Scanner;


public class Punto7 {
    
     public static void main(String[] args)  {
    
        
         Scanner sc = new Scanner(System.in);
         
         float precioCompra, precioVenta;
         float porcentajeUtilidad;
         float gastos;
         String nombre;
         System.out.println("Ingrese el nombre : ") ;
         nombre = sc.next();
         System.out.println("Ingrese el precio de compra");
         precioCompra = sc.nextFloat();
         System.out.println("Ingrese el precio de Venta");
         precioVenta = sc.nextFloat();
         
         
         gastos = precioVenta - precioCompra;
         porcentajeUtilidad = (gastos/precioVenta)*100;
         
         System.out.println("El porcentaje de utilidad de la persona " + nombre + "es de : "+ porcentajeUtilidad);
     }
    
}
