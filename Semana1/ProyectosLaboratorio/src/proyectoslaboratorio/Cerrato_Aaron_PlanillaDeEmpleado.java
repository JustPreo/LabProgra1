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


/* Objetivo del programa
Conociendo las horas laboradas al mes y la tarifa por hora
Sacar el salario mensual
Pedir Nombre de empleado
Horas trabajadas en el mes


*/
public class Cerrato_Aaron_PlanillaDeEmpleado {
    public static void main(String[]Args)
    {
    Scanner Input = new Scanner(System.in);
    Input.useDelimiter("\n");
    System.out.println("***Bienvenido***");
    System.out.println("Ingrese el nombre completo del empleado");
    //Scanner.useDelimeter("\n");
    String nombre = Input.next();
    System.out.println("Ingrese las horas trabajadas en el mes");
    int HorasMes = Input.nextInt();
    Input.nextLine();
    System.out.println("Ingrese la tarifa por hora(En Lempiras)");
    double TarifaHora = Input.nextDouble();
    
    //Calcular las variables
    double PagoMensual = HorasMes * TarifaHora;
    
    double PagoSemanal = PagoMensual/4;
    
    System.out.println("----- Boleta del Empleado -------");
    System.out.println("Nombre del empleado: "+nombre+
            "\nHoras de Trabajo Mensual: "+HorasMes+
            "\nTarifa por Hora :Lps."+TarifaHora+
            "\nSalario del Empleado Semanal:Lps."+PagoSemanal);
    
    
    
    
    
    
    
    
    
    
    }
    
}
