import java.util.Scanner;

public class Triangulo {

	private Scanner teclado;
	private int lado1;
	private int lado2;
	private int lado3;
	
	public void inicializar() //metodo
	{
		teclado=new Scanner (System.in);
		
		System.out.print("Ingresar Primer Lado: ");
		lado1=teclado.nextInt();
		
		System.out.print("Ingresar Segundo Lado: ");
		lado2=teclado.nextInt();
		
		System.out.print("Ingresar Tercer Lado: ");
		lado3=teclado.nextInt();
		
	}
	
	public void ladoMayor()
	{
		if(lado1==lado2 && lado1==lado3)
			System.out.print("los 3 lados son iguales");
		else
			
		if(lado1>lado2 && lado1>lado3)
			System.out.print("El mayor es el lado 1");
		else 
			if(lado2>lado3)
				System.out.print("El mayor es el lado 2");
			else
				System.out.print("El mayor es el lado 3");
		
	}
	

	
	public void tipo()
	{
		if(lado1==lado2 && lado1==lado3)
			System.out.print("El un triangulo Equilatero");
		else
			if(lado1==lado2 || lado1==lado3)
				System.out.print("El un triangulo Isosceles");
			else
				System.out.print("El un triangulo Escaleno");
	}
	public static void main(String[] args) {
		Triangulo t= new Triangulo();
		t.inicializar();
		System.out.println();
		t.ladoMayor();
		System.out.println();
		t.tipo();

	}

}
