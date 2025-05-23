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
                    int cantidadF = 0;
                    do {
                    System.out.println("Cantidad de filas de la piramide:");
                    cantidadF = input.nextInt();
                    
                    if ((cantidadF<0))
                    {
                        System.out.println("Ingrese un numero valido\n");
                    }
                    }
                    while ((cantidadF<0));
                    String piramide = "";
                    int contador = 1;
                    
                    for (int i = 1;i<=cantidadF;i++)
                    {
                        int suma =0;
                        if (!piramide.equals(""))
                        {
                        piramide += "\n";
                        }
                        for (int j = 0;j < i;j++)
                        {
                            piramide += contador + " ";
                            //contador ++;
                            suma +=contador;
                            contador += 2;
                        
                        
                        }
                        piramide += "= " +suma;
                        
                    
                    }
                    System.out.println(piramide);
                    break;
                case 2://Clave
                    String abcMin = "abcdefghijklmnopqrstuvwxyz";
                    String abcMay = abcMin.toUpperCase();
                    String zyxMin = "zyxwvutsrqponmlkjihgfedcba";
                    String zyxMay = zyxMin.toUpperCase();
                    //Perdon inge de ante mano
                    System.out.println("Ingrese el texto a cifrar/descifrar");
                    String texto = input.next();
                    int longTexto = texto.length();
                    String textoF = "";
                    
                    for (int i = 0;i < longTexto;i++)
                    {
                    char caracter = texto.charAt(i);
                        
                    if (Character.isLowerCase(caracter))//Si es min
                        {
                        int posicionLetra = abcMin.indexOf(caracter);
                            
                            textoF += zyxMin.charAt(posicionLetra);
                            
                        }
                        
                        else if (Character.isUpperCase(caracter)) //Si es may
                        {
                        int posicionLetra = abcMay.indexOf(caracter);
                        textoF += zyxMay.charAt(posicionLetra);
                        }
                        
                        else//Por si no es una letra
                        {
                        textoF += caracter;
                        }
                        
                    }//Fin for
                    
                    System.out.println("Su texto final es:"+textoF);
                    break;
                case 3://Piedra , Papel , Tijera
                    boolean seguirPPT = true;
                    
                    System.out.println("Bienvenido a Piedra , Papel y Tijera!");
                    while (seguirPPT)
                    {
                        String eleccion = "";
                        do 
                        {
                        System.out.println("Ingrese su eleccion!");
                        System.out.println("Piedra | Papel | Tijera");
                        
                        eleccion = input.next();
                        if (!(eleccion.equalsIgnoreCase("Piedra")||eleccion.equalsIgnoreCase("Papel")||eleccion.equalsIgnoreCase("Tijera")))
                        {
                            System.out.println("Ingrese una opcion valida"
                            +"\n====================");
                        }
                        }
                        while (!(eleccion.equalsIgnoreCase("Piedra")||eleccion.equalsIgnoreCase("Papel")||eleccion.equalsIgnoreCase("Tijera")));
                        String eleccionMaquina = "";//Talvez agregarlo despues
                        int numeroPPT = r.nextInt(4);//No cuenta el 4
                        while (numeroPPT == 0)
                        {
                        numeroPPT = r.nextInt(3); //Este es para que no se le bugee al ING como la ultima vez 
                        }
                        switch (numeroPPT)
                        {
                            case 1:
                                eleccionMaquina = "Piedra";
                                break;
                            case 2:
                                eleccionMaquina = "Papel";
                                break;
                            case 3:
                                eleccionMaquina = "Tijera";
                                break;
                        }
                        
                        
                        switch (eleccion.toLowerCase())
                        {
                            case "piedra":
                                if (eleccion.equalsIgnoreCase(eleccionMaquina))//Piedra empata con piedra
                                {
                                    System.out.println("====================");
                                    System.out.println("Empate!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                    
                                    
                                }
                                
                                else if (eleccionMaquina.equalsIgnoreCase("Papel"))//Piedra pierde contra papel
                                {
                                    System.out.println("====================");
                                    System.out.println("Perdio!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                    
                                }
                                
                                else if (eleccionMaquina.equalsIgnoreCase("Tijera"))//Piedra gana contra tijera
                                {
                                    System.out.println("====================");
                                    System.out.println("Gano!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                    
                                }
                                break;
                            case "papel":
                                if (eleccion.equalsIgnoreCase(eleccionMaquina))//Papel empata con papel
                                {
                                    System.out.println("====================");
                                    System.out.println("Empate!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                }
                                                                
                                else if (eleccionMaquina.equalsIgnoreCase("Tijera"))//Papel pierde contra tijera
                                {
                                    System.out.println("====================");
                                    System.out.println("Perdio!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                }
                                
                                else if (eleccionMaquina.equalsIgnoreCase("Piedra"))//Papel gana contra piedra
                                {
                                    System.out.println("====================");
                                    System.out.println("Gano!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                }
                                break;
                            case "tijera":
                                if (eleccion.equalsIgnoreCase(eleccionMaquina))//Tijera empata con tijera
                                {
                                    System.out.println("====================");
                                    System.out.println("Empate!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                }
                                                                
                                else if (eleccionMaquina.equalsIgnoreCase("Piedra"))//Tijera pierde contra piedra
                                {
                                    System.out.println("====================");
                                    System.out.println("Perdio!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                }
                                
                                else if (eleccionMaquina.equalsIgnoreCase("Papel"))//Tijera gana contra papel
                                {
                                    System.out.println("====================");
                                    System.out.println("Gano!");
                                    System.out.println("Maquina eligio "+eleccionMaquina);
                                }
                                break;
                            default:
                                System.out.println("Escriba una opcion valida");//Por si por alguna razon pasa el primer loop
                                break;
                        
                        }
                        System.out.println("====================");
                        System.out.println("Desea seguir jugando? Si/No");
                        boolean siNoValido = false;
                        while (!siNoValido)
                        {
                            String siNo = input.next();
                            if (siNo.equalsIgnoreCase("si"))
                            {
                            siNoValido = true;
                            System.out.println("====================");
                            }
                            else if (siNo.equalsIgnoreCase("no"))
                            {
                            siNoValido = true;
                            seguirPPT = false;
                                System.out.println("Gracias por jugar!");
                                System.out.println("====================");
                                
                            }
                            else 
                            {
                                System.out.println("Ingrese Si o No");
                                System.out.println("====================");
                            }
                        
                        }
                        
                    }
                    break;
                case 4://Adivinar
                    int numeroR = r.nextInt(101);//101 porque si no , no genera 100
                    while (numeroR == 0)
                    {
                    numeroR = r.nextInt(101);//Para que no se bugee como la ultima vez XD
                    }
                    int intentosRealizados = 0;
                    
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
                            
                            System.out.println("\nLo encontraste en "+intentosRealizados +" Intentos");
                            break;
                        }
                        else if(numeroI > numeroR)
                        {
                            System.out.println("El numero random es menor al numero ingresado");
                            intentos -=1;
                            intentosRealizados++;
                            System.out.println("Te quedan "+intentos+" intentos!"+
                                            "\n================");
                        }
                        else if (numeroI < numeroR)
                        {
                            System.out.println("El numero random es mayor al numero ingresado");
                            intentos -=1;
                            intentosRealizados++;
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
                    System.out.println("Saliendo...");
                    break;
                default://En caso de no ser valido
                    System.out.println("Ingrese una opcion valida");
                    break;
            }//Fin Switch
                    
        }
    }
    
}
