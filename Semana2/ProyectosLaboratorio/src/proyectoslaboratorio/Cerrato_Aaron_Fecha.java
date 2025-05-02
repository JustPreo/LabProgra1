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
Hacer un programa que pueda solicitar dos fechas desde el teclado (formato de la fecha es Día/Mes/Año) 
y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.(Usar substring())
*/
public class Cerrato_Aaron_Fecha {
    public static void main(String[]Args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int diaMes = 30;
        int diaYear = 365;
        //Idea - darle un valor tipo mes = 30 , dia = 1 , year = 365 y replicar lo mismo que hicimos con lo de tiempo)?
        
        System.out.println("Ingrese la primera fecha (La fecha menor) dd/mm/yyyy");
        String primeraF = input.next().trim();
        
        if (primeraF.length()!=10||primeraF.charAt(2)!='/'||primeraF.charAt(5)!='/')
        {
            System.out.println("Primera Fecha Invalida");
            System.exit(0);
        }
        int dia1 = Integer.parseInt(primeraF.substring(0,2));
        int mes1 = Integer.parseInt(primeraF.substring(3,5));
        int year1 = Integer.parseInt(primeraF.substring(6,10));
        
        if (dia1 > 30 || mes1 > 12 || dia1 < 1 || mes1 < 1)
        {
            System.out.println("Primera Fecha Invalida");
            System.exit(0);
        }
        
        System.out.println("Ingrese la segunda fecha (La fecha mayor) dd/mm/yyyy");
        String segundaF = input.next().trim();
        
        if (segundaF.length()!=10||segundaF.charAt(2)!='/'||segundaF.charAt(5)!='/') //Valido que los char sean como quiero que sea
        {
            System.out.println("Segunda Fecha Invalida");
            System.exit(0);
        }

        int dia2 = Integer.parseInt(segundaF.substring(0,2));
        int mes2 = Integer.parseInt(segundaF.substring(3,5));
        int year2 = Integer.parseInt(segundaF.substring(6,10));
        
        if (dia2 > 30 || mes2 > 12||dia2 < 1 || mes2 < 1)
        {
            System.out.println("Primera Fecha Invalida");
            System.exit(0);
        }
        
        //Convertir a dias FECHA 1
        int diasTotal1 = (year1 * diaYear)+(mes1 * diaMes) + dia1;
        int diasTotal2 = (year2 * diaYear)+(mes2 * diaMes) + dia2;
        
        
        
        int diferenciaDias = diasTotal2 - diasTotal1;
        String diasTexto = (diferenciaDias == 1) ? "dia":"dias";
        System.out.println("La diferencia de dias entre esas dos fechas es de: " + diferenciaDias+ " "+diasTexto);
        
        
        


    }
    
}
