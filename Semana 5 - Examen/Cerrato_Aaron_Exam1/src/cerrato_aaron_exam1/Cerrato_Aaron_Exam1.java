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
            
            System.out.println("================"+"\nIngrese una opcion");
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
                    
                    int intentos = 10;
                    while (intentos != 0)
                    {
                        System.out.println("Ingrese un numero");
                        int numeroI = input.nextInt();
                        if (numeroI == numeroR)
                        {
                            System.out.println("\n================");
                            System.out.println("FELICIDADES!");
                            System.out.println("Adivinaste el numero");
                            
                            System.out.println("\nTerminaste con "+intentos+" intentos restantes!");
                            break;
                        }
                        else if(numeroI > numeroR)
                        {
                            System.out.println("El numero random es menor al numero ingresado");
                            intentos -=1;
                            System.out.println("Te quedan "+intentos+" intentos!"+
                                            "\n================");
                        }
                        else if (numeroI < numeroR)
                        {
                            System.out.println("El numero random es mayor al numero ingresado");
                            intentos -=1;
                            System.out.println("Te quedan "+intentos+" intentos!"+
                                            "\n================");
                        }
                    
                    }
                    
                    if (intentos == 0)
                    {
                        System.out.println("Suerte la proxima");
                        System.out.println("El numero era: "+numeroR);
                    }
                    
                    break;
                case 5://Salir
                    menu = false;
                    break;
                default://En caso de no ser valido
                    System.out.println("Ingrese una opcion valida");
                    break;
            }//Fin Switch
                    
        }
    }
    
}
