package examen;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Examen {
    

  public static void main (String [] args){
            Scanner obtener = new Scanner(System.in);
	int estudiantes,i,notaMayor,notaMenor,nota,sumaNotas;
 
	System.out.print("Ingrese la cantidad de estudiantes: ");
	estudiantes = obtener.nextInt();
 
notaMayor = 0;
notaMenor = 100;
sumaNotas = 0;
 
 
	for(i = 1; i <= estudiantes; i++)
	{
	System.out.print("Ingrese la nota para el estudiante: " + i + " : ");
	nota = obtener.nextInt();
 
	sumaNotas = sumaNotas + nota;
	if(nota > notaMayor)
	{
	notaMayor=nota;
	}
	if(nota < notaMenor)
{
notaMenor=nota;
}
}
 
	System.out.print("La nota mayor es: " + notaMayor + "\n");
	System.out.print("La nota menor es: " + notaMenor + "\n");
 
DecimalFormat df = new DecimalFormat("#.00");
 
System.out.print("El promedio es: " + df.format((double)sumaNotas/estudiantes) + "\n");
	}
}