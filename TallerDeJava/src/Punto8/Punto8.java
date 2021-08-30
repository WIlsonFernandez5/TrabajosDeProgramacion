
package Punto8;

import java.util.Scanner;


public class Punto8 {
     public static void main(String[] args)  {
     
         menu();
     
     }
     
     
         
    public static void menu(){
        
        Scanner read =  new Scanner (System.in);
        int opcion;
        
        do{       
        System.out.println("***MENU DE OPCIONES/METODOS DE ORDENAMIENTOS*");
        System.out.println("1. Mi primer menu");
        System.out.println("2. Hola mundo");
        System.out.println("3. Buenas noches");
        System.out.println("4.Seleccion");
        System.out.println("5.Actividad");
        System.out.println("6.Salir");
        
        opcion = read.nextInt();
        
        switch(opcion){
            
            case 1 -> System.out.println("Hola mundo, mi primer menu");
            
            case 2 -> System.out.println("Hola mundo");
            
            case 3 -> System.out.println("Buenas noches ");
               
            case 4 -> System.out.println("Seleccion");
                
            case 5 -> System.out.println("Actividad"); 
                
            case 6 -> {
                System.out.println("SALIENDO.... GRACIAS POR UTILIZAR EL POGRAMA");
                System.out.println("*WILSON FERNANDEZ*");
                }
            
            default -> System.out.println("SELECCIONE UNA OPCION VALIDA :D");
            
            
        }
       }while(opcion != 6);
             
             
         
    }
      
}
