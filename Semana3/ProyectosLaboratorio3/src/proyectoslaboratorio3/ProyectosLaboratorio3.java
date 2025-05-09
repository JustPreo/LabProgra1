/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoslaboratorio3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author user
 */
public class ProyectosLaboratorio3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguirMenu = true;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        
        while (seguirMenu)
        {
            System.out.println("-----Menu-----"+
                    "\n1.Palabra Alreves"+
                    "\n2.Numero Perfecto"+
                    "\n3.Primos"+
                    "\n4.Votaciones"+
                    "\n5.Salir");
            System.out.println("Eliga una opcion:");
            char opcion = input.next().charAt(0);
            
            switch (opcion)
            {
                case '1'://Palabra Alreves
                    System.out.println("Cantidad de palabras a ingresar:");
                    int nPalabras = input.nextInt();
                    
                    
                    /*Palabra Alreves. Ingresar una cantidad de palabras y luego
                    se ingresa una String desde el teclado, e imprimir al revés
                    a cada palabra que se ingrese, y al final indicar cual ha sido
                    la palabra mas larga y si es palíndromo (Considerar si existe 
                    palabras con la misma cantidad de caracteres). */
                    int longitudLarga = 0;
                    String palabraLarga = "";
                    String palabraAlrevesLarga = "";
                    String texto = "";
                    
                    for (int i=1;i <=nPalabras;i++)
                    {
                        String palabraAlreves = "";
                        System.out.println("Ingrese la palabra");
                        String palabra = input.next();
                        int longitud = palabra.length();
                        
                        for (int h=0;h<longitud;h++)
                        {
                            char letra = palabra.charAt(h);
                            palabraAlreves = letra + palabraAlreves;
                        
                        }//Fin for h
                        
                        System.out.println("Palabra alreves:"+palabraAlreves);

                        //----------------------------------------------
                        if (longitud>longitudLarga)
                        {
                        longitudLarga = longitud;
                        palabraLarga = palabra;
                        palabraAlrevesLarga = palabraAlreves;
                        
                        texto = "La palabra mas larga es:"+palabraLarga+
                            "\nLongitud:"+longitudLarga+
                            "\nPalabra Alreves:"+palabraAlrevesLarga;
                        
                        if (palabraLarga.equalsIgnoreCase(palabraAlrevesLarga))//Revisa si es palindromo
                        {
                            texto= texto + "\nEs Palindromo";
                            
                        }
                        
                        }
                        else if (longitud == longitudLarga)
                        //Revisara si es la misma long y si es la misma comparara si son palindromo
                        {
                        texto = texto + "\nOtra palabra larga es:"+palabra+
                            "\nLongitud:"+longitud+
                            "\nPalabra Alreves:"+palabraAlreves;
                        if (palabra.equalsIgnoreCase(palabraAlreves))//Revisa si es palindromo
                        {
                            texto= texto + "\nEs Palindromo";
                            
                        }
                        }
                    
                    }//Fin for i
                    
                    
                    System.out.println("-----------------------"+"\n"+texto);
                    
                    break;//Fin case
                case '2'://Numero Perfecto
                    
                    break;
                case '3'://Primos
                    String divisores = "";
                    int cantDivisores = 0;
                    
                    
                    System.out.println("Ingrese un numero");
                    Random ran = new Random();
                    int numero = ran.nextInt(100)+1;//El +1 para evitar 0
                    //Genera desde el 0-100
                    System.out.println("Numero:"+numero);
                    for (int i=1;i <=numero;i++)
                    {
                    if (numero % i == 0)
                    {
                        if (divisores.equals("")) //Revisa si es el primer numero
                        {
                        divisores = divisores + i;
                        
                        }
                        else //Sino , agrega y
                        {
                        divisores = divisores + " y "+i;
                        }
                    cantDivisores +=1;
                    }
                    }
                    
                    if (cantDivisores == 2) //Primo
                    {
                        System.out.println("Numero primo "+numero+" solo tiene dos divisiones");
                        System.out.println("Divisores de "+numero+" son:"+divisores);
                    }
                    else //No Primo
                    {
                        System.out.println("Numero "+numero+" no es primo");
                        System.out.println("Divisores de "+numero+" son:"+divisores);
                    
                    }
                    break;
                case '4'://Votaciones
                    System.out.println("Cuantos votantes hay en el pais?");
                    int votantesTotal = input.nextInt();
                    int votoAzul=0 , votoRojo=0 , votoNegro=0 , votoAmarillo=0,votoTotal=0,votoNulo=0;
                    double votoPorcentaje=0,votoPorcentajeTotal=0;
                    int votoValido = 0,mayor=0;
                    String ganador = "";
                    //Iniciar variables
                    
                    for (int i = 0;i < votantesTotal;i++)
                    {
                        System.out.println("Ingrese por cual equipo votara:");
                        System.out.println("AZUL | ROJO | NEGRO | AMARILLO");
                        String voto = input.next().toLowerCase();
                        
                        switch (voto)
                        {
                            case "azul":
                                votoAzul ++;
                                votoTotal++;
                                votoValido++;
                                break;
                            case "rojo":
                                votoRojo ++;
                                votoTotal++;
                                votoValido++;
                                break;
                            case "negro":
                                votoNegro++;
                                votoTotal++;
                                votoValido++;
                                break;
                            case "amarillo":
                                votoAmarillo++;
                                votoTotal++;
                                votoValido++;
                                break;
                            default:
                                votoNulo++;
                                votoTotal++;
                                break;
                                
                        }

                    }//Fin for
                    //Determinar ganador con puro if
                    if (votoAzul>mayor)
                    {
                        mayor = votoAzul;
                        ganador = "AZUL";
                    }
                    if (votoRojo>mayor)
                    {
                        mayor = votoRojo;
                        ganador = "ROJO";
                    }
                    if (votoNegro>mayor)
                    {
                        mayor = votoNegro;
                        ganador = "NEGRO";
                    }
                    if (votoAmarillo>mayor)
                    {
                        mayor = votoAmarillo;
                        ganador = "AMARILLO";
                    }
                    
                        votoPorcentaje =votantesTotal * 0.6;
                        if (votoValido>= votoPorcentaje)
                        {
                            System.out.println("Gano:"+ganador);
                        
                        }
                    break;
                case '5'://Salir
                    seguirMenu = false;
                    break;
                default://Por si no ponen un char valido
                    System.out.println("Ingrese una opcion valida");
                    break;
            
            
            
            }
        
        
        
        }
        
        
        
        
        
        
        
        
    }
    
}
