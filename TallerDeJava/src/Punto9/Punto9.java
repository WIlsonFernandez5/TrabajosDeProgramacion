
package Punto9;

import java.util.Scanner;

public class Punto9 {
     public static void main(String[] args)  {

        
        int diasViaje;
        int totalKilometros;
        int costoLitroGasolina;
        int promedioKilometrosGasolina;
        int pagoParqueoDias;
        int pagoPeajesDias;
        
        int resultadoKilometros, resultadoGasolina, resultadoPagoParqueo, resultadoPagoPeaje, resultadoPromedioKiGa;
        
        Scanner sc =  new Scanner (System.in);
        
        System.out.println("Ingrese los dias de viaje :");
        diasViaje = sc.nextInt();
        System.out.println("Ingrese el costo por litro de gasolina :");
        costoLitroGasolina = sc.nextInt();
        System.out.println("Ingrese el pago de estacionamiento por dias :");
        pagoParqueoDias = sc.nextInt();
        System.out.println("Ingrese el pago de peajes por dias :");
        pagoPeajesDias = sc.nextInt();
        
        resultadoKilometros = diasViaje * 1000;
        
        resultadoGasolina = costoLitroGasolina * diasViaje;
        
        resultadoPagoParqueo = pagoParqueoDias * diasViaje;
        
        resultadoPagoPeaje = pagoPeajesDias * diasViaje;
        
        resultadoPromedioKiGa = resultadoKilometros / resultadoGasolina; 
        
        
        System.out.println("Los Kilometros totales recorridos son: " + resultadoKilometros);
        System.out.println("Costo total de la gasolina es de : " + resultadoGasolina);
        System.out.println("El costo total de pago de parqueo es de :" + resultadoPagoParqueo);
        System.out.println("EL costo toltal de peajes es de : " + resultadoPagoPeaje);
        System.out.println("El promedio de kilometros por gasolina es de "+ resultadoPromedioKiGa);
    }  
}
