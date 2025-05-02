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
public class Cerrato_Aaron_Clases {
    
    public static void main (String []args)
            
    {
    //Ingresar Fecha Actual
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la fecha de hoy"
                + "\nFormato:[Nombre Dia],dd/mm:");
        String fechaString =input.next();
        
        //Esto busca por asi decirlo el "Espacio" o la separacion entre nombre dia y dd/mm
        int espacio = fechaString.indexOf(',');
        String diaSemana = fechaString.substring(0,espacio).trim().toLowerCase();
        //Boolean diaValido = null;
        if (!diaSemana.equalsIgnoreCase("lunes")
                &&!diaSemana.equalsIgnoreCase("martes")
               &&!diaSemana.equalsIgnoreCase("miercoles")
                &&!diaSemana.equalsIgnoreCase("jueves")
                &&!diaSemana.equalsIgnoreCase("viernes")) //Lo hice asi para poder leerlo bien XD
        {
        
            System.out.println("Dia Invalido");
            System.exit(0);
        
        }
        
        
        if (espacio==-1)//Revisa si hay minimo un espacio (,)
        {
        System.out.println("Formato Invalido");
        System.exit(0);
        }
        //Pongo la variable y despues el la variable que voy a usar para editar , y revisar individualmente cada char con split
        String fecha = fechaString.substring(espacio + 1).trim();
        //Ahora verifico si hay 5 chars (dd/mm)
        if (fecha.length()!= 5 || fecha.charAt(2)!= '/')
        {
            System.out.println("Formato Invalido , tiene que ser dd/mm");
            System.exit(0);
        }
        //Basicamente paso de string a un int con Integer.parseInt
        int diaFecha = Integer.parseInt(fecha.substring(0,2));
        int mesFecha = Integer.parseInt(fecha.substring(3,5));
        
        if (diaFecha <1 ||diaFecha>31 ||mesFecha < 1 ||mesFecha>12)
        {
            System.out.println("Dia o mes fuera de rango");
        }
        
        
        
        if (diaSemana.equalsIgnoreCase("lunes")||diaSemana.equalsIgnoreCase("martes")||diaSemana.equalsIgnoreCase("miercoles"))
        {
            Boolean diaExamen = null;
            System.out.println("Es un dia de examen?");
            String siNo = input.next();
            if (siNo.equalsIgnoreCase("si"))
            {
            diaExamen = true;
            }
            else if (siNo.equalsIgnoreCase("no"))
            {
            diaExamen = false;
            }
            else 
            {
                System.out.println("Tenia que ingresar si o no");
                System.exit(0);
            }
            if (diaExamen == true)
            {
            System.out.println("Ingrese la cantidad de estudiantes que aprobaron:");
            int aprobados = input.nextInt();
            System.out.println("Ingrese la cantidad de estudiantes que no aprobaron");
            int noAprobados = input.nextInt();
            
            if (aprobados <0 ||noAprobados<0)
            {
                System.out.println("No puede tener numeros negativos");
                System.exit(0);
            }
            int totalEstudiantes = aprobados + noAprobados;
            double porcentajeAprobados = (aprobados*100)/totalEstudiantes;
            
            System.out.println("Porcentaje de estudiantes aprobados:"+porcentajeAprobados+"%");
            }
            System.exit(0);
        }
        
        else if(diaSemana.equalsIgnoreCase("jueves"))//practica hablada
        {
            System.out.println("Ingrese el porcentaje de asistencia:");
            int porcentajeAsistencia = input.nextInt();
            if (porcentajeAsistencia <0 )
            {
                System.out.println("No puede tener numeros negativos");
                System.exit(0);
                
            }            
            
            if (porcentajeAsistencia > 50)
            {
                System.out.println("Asistio la mayoria");
            }
            else
            {
                System.out.println("No asistio la mayoria");
            }
            System.exit(0);
        }
        else if (diaSemana.equalsIgnoreCase("viernes") && (diaFecha==1 && mesFecha ==1)||(diaFecha==1 && mesFecha==7))//Viajeros
        {
            System.out.println("Comienzo de nuevo ciclo:");
            System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo:");
            int cantidadAlumnos = input.nextInt();
            System.out.println("Introduzca el precio (En Dolares) por cada alumno");
            double precioAlumno = input.nextDouble();
                        if (cantidadAlumnos <0 ||precioAlumno<0)
            {
                System.out.println("No puede tener numeros negativos");
                System.exit(0);
            }
            double ingresoTotal = precioAlumno * cantidadAlumnos;
            System.out.println("Ingreso total:$"+ingresoTotal);
        
        }
    }//Fin main
    
}//Fin Class
