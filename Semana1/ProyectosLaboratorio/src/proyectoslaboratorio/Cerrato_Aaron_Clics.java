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

public class Cerrato_Aaron_Clics {
    public static void main(String[]Args)
    
    {
        Scanner Input = new Scanner(System.in);
        //60 clics -  $0.3 cada uno
        //100 clics - $0.25 cada uno
        //20 clics - $0.8 cada uno
        double clic1 = 60 * 0.3; 
        double clic2 = 100 * 0.25;
        double clic3 = 20 * 0.8;
        
        double CostoTotalC = clic1 + clic2 + clic3;
        double CostoPromedio = CostoTotalC / 180;
        
        String Promedio = String.format("%.2f",CostoPromedio);
        System.out.println("Costo Promedio:Lps."+Promedio);
        double ISV =CostoTotalC * 0.16;
        double TotalISV = CostoTotalC + ISV;
        String Total = String.format("%.2f",TotalISV);
        String CostoTotalCT = String.format("%.2f",CostoTotalC);
        
        System.out.println("Total Sin ISV:Lps."+CostoTotalCT);
        System.out.println("Total + ISV:Lps."+Total);
        
        
        
        
        
        
    }
    
}
