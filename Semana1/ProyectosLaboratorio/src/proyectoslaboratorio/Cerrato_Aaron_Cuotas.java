/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoslaboratorio;
import java.util.Scanner;


/**
 *
 * @author user
 */
/*  
Plazo de pago (Meses)
Interes mensual
Comision por cuota
Porcentaje de seguro mensual


*/




public class Cerrato_Aaron_Cuotas {
    public static void main(String[]Args)
    {
    Scanner Input = new Scanner(System.in);
    
    System.out.println("***Bienvenido***");
    
    System.out.println("Ingrese la cantidad del prestamo");
    double Prestamo = Input.nextDouble();
    
    System.out.println("Ingrese cuantos meses durara el prestamo");
    int Meses = Input.nextInt();
    //Para los meses
    System.out.println("Ingrese el interes mensual (Ej. 5)");
    double InteresMensual = Input.nextDouble();
    //Para el interes manual
    System.out.println("Ingrese la comision fija (En Lempiras)");
    double ComisionFija = Input.nextDouble();
    //La comision fija
    System.out.println("Ingrese el porcentaje de seguro (Ej. 3)");
    double PorcentajeS = Input.nextDouble();
    //Porcentaje de seguro
    double PorcentajeSFinal = Prestamo * (PorcentajeS/100); 
    //Prestamo * el porcentaje de seguro    
    double InteresMensualF = Prestamo*(InteresMensual/100);
    
    double PagoMensual = (Prestamo/Meses)+(PorcentajeSFinal+ComisionFija+InteresMensualF);
    double TotalPagar = PagoMensual * Meses;
    String Mensual = String.format("%.2f", PagoMensual);
    String Total = String.format("%.2f",TotalPagar);
    
    System.out.println("****CUOTAS MENSUALES****");
    System.out.println("Cuota de pago mensual:HNL."+Mensual+
            "\nTotal a Pagar:HNL."+Total);
    
    
    
    
    
    }
    
}
