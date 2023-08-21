import java.util.Scanner;

public class Lados {

	private Scanner teclado;
	int lado;
	
	
	public void inicializar()
	{
		teclado = new Scanner (System.in);
		System.out.print("Ingrese valor del lado: ");
		lado=teclado.nextInt();
		System.out.println();
		
	}
	
	public void perimetro()
	{
		
		int perimetro;
		perimetro= lado * 4;
		System.out.print("El perímetro del cuadrado es: " + perimetro);
		System.out.println();
		
	}
	
	public void imprimirSuperficie()
	{
		
		int superficie;
		superficie = lado * lado;
		System.out.print("La superficie del cuadrado es: " + superficie);
		System.out.println();
		
	}
	
	
	
	public static void main(String[] args) {
		
		Lados l = new Lados();
		l.inicializar();
		l.perimetro();
		l.imprimirSuperficie();
		

		
	}

}
