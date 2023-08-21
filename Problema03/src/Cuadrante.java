import java.util.Scanner;

public class Cuadrante {

	private Scanner teclado;
	int x,y;
	
	public void inicializar() //metodo
	{
		teclado=new Scanner (System.in);
		
		System.out.print("Ingresar la coordenada X : ");
		x=teclado.nextInt();
		
		System.out.print("Ingresar la coordenada Y : ");
		y=teclado.nextInt();
	}
	
	
	public void mostrarCuadrante()
	{
		if(x==0 && y==0)
			System.out.print("El punto esta en el Origen de coordenadas");
		else 
			if(x==0)
				System.out.print("El punto esta en el Eje Y");
			else 
				if(y==0)
					System.out.print("El punto esta en el Eje X");
				else
					if(x>0 && y>0)//x positiva e y positiva
						System.out.print("El punto esta en el cuadrante I");
					else
						if(x<0 && y>0)//x negativa e y positiva
							System.out.print("El punto esta en el cuadrante II");
						else
							if(x<0 && y<0)// x negativa e Y negativa
								System.out.print("El punto esta en el cuadrante III");
							else
								System.out.print("El punto esta en el cuadrante IV");
	}
	
	
	
	public static void main(String[] args) {
	
		Cuadrante c= new Cuadrante();
		c.inicializar();
		System.out.println();
		c.mostrarCuadrante();
	}

}
