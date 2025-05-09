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
public class Cerrato_Aaron_EstructuraCondicional {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguirMenu = true;
        int alreves = 0,perfecto=0,primos=0,votaciones=0;
        boolean numeroValido = false;
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
            int opcion = input.nextInt();
            
            switch (opcion)
            {
                case 1://Palabra Alreves
                    numeroValido = false;
                    int nPalabras = 0;
                    do 
                    {
                    System.out.println("Cantidad de palabras a ingresar:");
                    nPalabras = input.nextInt();
                    if (nPalabras > 0)
                    {
                        numeroValido = true;
                    }
                    }
                    while (!numeroValido);
                    /*Palabra Alreves. Ingresar una cantidad de palabras y luego
                    se ingresa una String desde el teclado, e imprimir al revés
                    a cada palabra que se ingrese, y al final indicar cual ha sido
                    la palabra mas larga y si es palíndromo (Considerar si existe 
                    palabras con la misma cantidad de caracteres). */
                    
                    int longitudLarga = 0;
                    String palabraLarga = "";
                    String palabraAlrevesLarga = "";
                    String texto = "";
                    
                    for (int i=1;i <=nPalabras;i++) //Va revisando cada palabra . una por una
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
                    
                    
                    System.out.println("-----------------------"
                            +"\n"+texto);
                    alreves ++;
                    break;//Fin case
                case 2://Numero Perfecto
                    numeroValido = false;
                    int numeroP = 0;
                    do 
                    {
                    System.out.println("Ingrese un numero:");
                    numeroP = input.nextInt();
                    if (numeroP > 0)
                    {
                        numeroValido = true;
                    }
                    }
                    while (!numeroValido);
                    int divisoress = 0;
                    for (int i = 1;i<(numeroP-1);i++)//No lo puedo empezar en 0
                    {
                        
                        if (numeroP % i ==0) //Osea si el remainder es 0 agrega la i a divisoress
                        {
                            divisoress += i;
                        }
                    }
                    if (numeroP == divisoress)
                    {
                        System.out.println("Numero Perfecto");
                    }
                    perfecto++;
                    break;
                case 3://Primos
                    String divisores = "";
                    int cantDivisores = 0;
                    
                    
                    System.out.println("Ingrese un numero");
                    Random ran = new Random();
                    int numero = ran.nextInt(1,100);
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
                        else //Sino es el primero, agrega "y"
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
                    primos++;
                    break;
                case 4://Votaciones
                    
                    int votantesTotal = 0;
                    numeroValido = false;
                    do {
                    System.out.println("Cuantos votantes hay en el pais?");
                    votantesTotal = input.nextInt();
                    if (votantesTotal > 0)
                    {
                        numeroValido = true;
                    }
                    }
                    while (!numeroValido);
                    int votoAzul=0 , votoRojo=0 , votoNegro=0 , votoAmarillo=0,votoTotal=0,votoNulo=0;
                    double votoPorcentaje=0,votoPorcentajeTotal=0;
                    int votoValido = 0,mayor=0;
                    String ganador = "";
                   // int ganadorPuntos = 0;
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
                                System.out.println("Voto Anulado");
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
                        if (votoValido>= votoPorcentaje) //Revisa si la cantidad de votos valido es mayor o igual al 60%
                        {
                            System.out.println("Planilla Ganadora:"+ganador
                                    +"\nVotos:"+mayor);
                        
                        }
                        else
                        {
                            System.out.println("VOTACION FALLIDA");
                        }
                        votaciones++;
                    break;
                case 5://Salir
                    seguirMenu = false;
                    
                    
                    System.out.println("Cantidad de veces ingresado a cada opcion del menu:");
                    System.out.println("Palabra Alreves :"+alreves+" veces"
                    +"\nNumero Perfecto :"+perfecto+" veces"
                    +"\nPrimos :"+primos+" veces"
                    +"\nVotaciones :"+votaciones+" veces");
                    break;
                default://Por si no ponen un char valido
                    System.out.println("Ingrese una opcion valida");
                    break;
            
            
            
            }
        
        
        
        }

        
    }
    
}