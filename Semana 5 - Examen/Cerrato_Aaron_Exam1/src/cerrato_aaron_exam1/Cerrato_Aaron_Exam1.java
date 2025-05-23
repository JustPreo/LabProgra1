/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cerrato_aaron_exam1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author user
 */
public class Cerrato_Aaron_Exam1 {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        Random r = new Random();
        
        while (menu)
        {
            System.out.println("======Menu======"
                    + "\n  1.Piramide"
                    + "\n  2.Clave"
                    + "\n  3.Piedra , Papel , Tijera!"
                    + "\n  4.Adivinar"
                    + "\n  5.Salir");
            
            System.out.println("=================="+"\nIngrese una opcion");
            int opcion = input.nextInt();
            
            switch (opcion)
            {
                case 1://Piramide
                    break;
                case 2://Clave
                    break;
                case 3://Piedra , Papel , Tijera
                    break;
                case 4://Adivinar
                    int numeroR = r.nextInt(100);
                    System.out.println("Numero:"+numeroR);
                    break;
                case 5://Salir
                    menu = false;
                    System.out.println("A");
                    break;
                default://En caso de no ser valido
                    System.out.println("AAAAAAAA");
                    break;
            }//Fin Switch
                    
        }
    }
    
}
