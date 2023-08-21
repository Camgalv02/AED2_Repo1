import java.util.Scanner;

public class Alumno {

	Scanner teclado;
	String nombre;
	int edad;
	
	public Alumno() // Constructor
	{
	 teclado= new Scanner (System.in);// es el que indica que los datos se van a cargar por teclado
	 
	 System.out.print("Ingrese nombre del alumno: ");
	 nombre = teclado.next();
	 
	 System.out.print("Ingrese la edad del alumno: ");
	 edad=teclado.nextInt();
	
	}
	
	/*public void imprimir()
	{
		System.out.println("Nombre: " + nombre);
		System.out.println();
		System.out.println("Edad:" + edad);
		System.out.println();
	}
	*/
	public void esMayorDeEdad()
	{
		if(edad>=18)
		{
			System.out.println();
			System.out.println("El alumno es mayor de edad");
		}
		else
		{
			System.out.println();
			System.out.println("El alumno NO es mayor de edad");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Alumno a = new Alumno();
		
		//a.imprimir();
		a.esMayorDeEdad();
	}

}
