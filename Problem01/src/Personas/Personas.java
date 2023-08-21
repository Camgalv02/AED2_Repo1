package Personas;

import java.util.Scanner;

public class Personas {
	
			//Scanner es una libreria
	private Scanner teclado; //variable para ingresar un dato 
	private String nombre;
	private int edad;
	
	public void inicializar()
	{
		teclado=new Scanner (System.in);
		
		System.out.print("ingrese un nombre: ");  // es como el c.print
		nombre= teclado.next(); //es como el c.readLine
		
		System.out.print("ingrese su edad: ");
		edad= teclado.nextInt();
	}
	
	public void esMayorDeEdad()
	{
		
		if(edad>=18)
			
			System.out.print("Es mayor de edad");
		
		else
			
			System.out.print("No es mayor de edad");
		
	}
	
	
	public static void main(String[] args) {
		
		Personas p= new Personas(); 
		p.inicializar();
		System.out.println("");
		p.esMayorDeEdad();
	}

}
