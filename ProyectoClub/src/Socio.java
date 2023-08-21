import java.util.Scanner;

public class Socio {
	
	Scanner teclado;
	String nombre;
	int antiguedad;
	
	public void cargarDatos()
	{
		teclado=new Scanner (System.in);
		
		System.out.print("Ingrese Nombre del Socio: ");
		nombre=teclado.next();
		
		System.out.print("Ingrese la antiguedad del Socio: ");
		antiguedad =teclado.nextInt();
	}
	
	
	public void imprimirDatos(String socio)
	{
		System.out.print("Nombre del Socio: "+nombre);
		System.out.println();
		System.out.print("Antiguedad del Socio "+ antiguedad);
	}
	

}
