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
public class Cerrato_Aaron_Pagos {
    public static void main (String[]args)
    {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    //Pedir informacion personal
        System.out.println("Nombre:");
        String nombre = input.next();
        System.out.println("Apellido:");
        String apellido = input.next();
        System.out.println("Codigo:");
        int codigo = input.nextInt();
        boolean codigoValido = (codigo > 0) ? true: false; //Supongo que no existe el codigo 0 
        if (!codigoValido)
        {
            System.out.println("No se permite ese valor");
            System.exit(0);
        }
        System.out.println("Horas Trabajadas:");
        int horasTrabajadas = input.nextInt();
        boolean horasValido = (horasTrabajadas >= 0) ? true: false; // Osea tecnicamente alguien puede no trabajar y ya
        if (horasValido==false)
        {
            System.out.println("No se permite ese valor");
            System.exit(0);
            
        }
        
        System.out.println("Informacion de Categorias\n" +
                            "Categoria 1 - $40 por hora extra\n" +
                            "Categoria 2 - $50 por hora extra\n" +
                            "Categoria 3 - $85 por hora extra.\n" +
                            "Categoria 4 - $0");
        
        System.out.println("Categoria Trabajador:");
        int categoria = input.nextInt();
        int pagoHoraExtra = 0;
        double pagoNormal = 35.99;
        //Mayor de 40 se consideran horas extra 
        //Las primeras 15 extra son las unicas que se pagan
        switch (categoria)         
        {
            case 1://Categoria 1
                pagoHoraExtra = 40;
                break;
            case 2://Categoria 2
                pagoHoraExtra = 50;
                break;
            case 3://Categoria 3
                pagoHoraExtra = 85;
                break;
            case 4://Categoria 4
                pagoHoraExtra = 0;
                break;
            default: //Cuando no es valido
                System.out.println("Categoria Invalida");
                System.exit(0);
        
        }
        int horasExtra = 0;
        double pagoDeHorasExtra = 0;
        double pagoHorasNormales = 0;
        if (horasTrabajadas > 40)
        {
            horasExtra = horasTrabajadas - 40;
                if (horasExtra <= 15)
                {
                    pagoDeHorasExtra = horasExtra * pagoHoraExtra;
                    
                }
                else if (horasExtra > 15)
                {
                pagoDeHorasExtra = 15 * pagoHoraExtra;
                }
             pagoHorasNormales = 40 * pagoNormal;
        }
        else if (horasTrabajadas <= 40)
        {
        pagoHorasNormales = horasTrabajadas * pagoNormal;
        }
        //PRINT FINAL
        double total = pagoHorasNormales + pagoDeHorasExtra;
        
        System.out.println("---Informacion Pago---"+
                "\nNombre completo:"+nombre+" "+apellido+
                "\nCodigo:"+codigo+
                "\nHoras Trabajadas:"+horasTrabajadas+" Horas"+
                "\nCategoria:"+categoria+
                "\nHoras Extra:"+horasExtra+" Horas"+
                "\nPago por horas extra:$"+String.format("%.2f",pagoDeHorasExtra)+
                "\nPago de horas normales:$"+String.format("%.2f",pagoHorasNormales)+
                "\nTotal salario:$"+String.format("%.2f",total));
            
            
        
    
    
    }
    
}
