/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Lab4 {
    public static void main(String[] args) 
    {
    int posiciones =0;
    int resultado = (9/2)+2;
        System.out.println(resultado);    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el texto a modificar:");
        String frase = leer.next();
        boolean valido = false;
        while (!valido)
        {
        System.out.println("Ingrese posiciones a desplazar:");
        posiciones = leer.nextInt();
            if (posiciones>=0)
            {
            valido = true;
            }
        
        }
        String minABC = "abcdefghijklmnopqrstuvwxyz";
        String mayABC = minABC.toUpperCase();
        int longitudFrase = frase.length();
        String fraseCompleta = "";
        for (int i = 0;i<longitudFrase;i++) //i se inicializa en 0 para que pueda compararse con la longitud de la frase
        {
            char letra = frase.charAt(i);//Consigo la letra
            if (Character.isUpperCase(letra)) //Si es upperCase
            {
                int posicionLetraABC =mayABC.indexOf(letra);

                fraseCompleta += mayABC.charAt((posicionLetraABC+posiciones)%26);
                
            }
            else if (Character.isLowerCase(letra))//Si no es upper case
            {
                int posicionLetraABC =minABC.indexOf(letra);

                fraseCompleta += minABC.charAt((posicionLetraABC+posiciones)%26); // el %26 es para poder darle vuelta
                       
            }
            else //Si es algun caracter extra
            {
                System.out.println(letra);
                fraseCompleta += letra;
            }
        }
        
        System.out.println("La frase encriptada es:"+fraseCompleta);
    }  
}