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
public class Cerrato_Aaron_Tiempo {
    public static void main(String[]args)
    {
    int horaS = 3600;//1 hora = 3600 segundos
    int minutoS = 60;//1 minuto = 60 segundos
    //Valor no puede ser menor a 0
    Scanner input = new Scanner(System.in);
        System.out.println("Introducir los segundos a convertir a Horas,Miutos,Segundos:");
        int numeroDigitado = input.nextInt();
        
        String mensajeValidacion = (numeroDigitado <= 0) ? "No se permite ese valor": "";
        System.out.println(mensajeValidacion);
        
        if (numeroDigitado > 0)
        {
               int horasConvertidas = numeroDigitado/horaS;
               int segundosRestantes = numeroDigitado % horaS;
               int minutos = segundosRestantes / minutoS;
               int segundos = segundosRestantes % minutoS;  
               
               String horaTexto = (horasConvertidas ==1) ? "hora" : "horas";
               String minutosTexto = (minutos==1) ? "minuto":"minutos";
               String segundosTexto = (segundos ==1) ? "segundo":"segundos";
               System.out.println(horasConvertidas+" "+horaTexto+" "+minutos+" "+minutosTexto+" "+segundos+" "+segundosTexto);
        }
        
        
 
        
        
    
    
    
    
    
    }
    
}
