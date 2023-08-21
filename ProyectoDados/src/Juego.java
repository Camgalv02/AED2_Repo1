
public class Juego {

	Dado d1, d2, d3; // objetos o instancias de la clase (de la clase dado por ejemplo)
	
	public Juego() //Constructor
	{
		d1 = new Dado();
		d2 = new Dado();
		d3 = new Dado();
	}
	
	void jugar()
	{
		d1.tirar();
		d2.tirar();
		d3.tirar();
		
		d1.imprimirValor("dado 1");
		d2.imprimirValor("dado 2");
		d3.imprimirValor("dado 3");
		
		int v1 = d1.retornarValor();
		int v2 = d2.retornarValor();
		int v3 = d3.retornarValor();
		
		if(v1==v2 && v2==v3)
		{	
			System.out.println();
			System.out.println("¡¡¡Ganó!!!!");
		}
		else
		{
			
			System.out.println();
			System.out.println("¡¡¡Perdió!!!!");
		}
	}
	
	

	
	public static void main(String[] args) {
		
		Juego j = new Juego();
		j.jugar();

	}

}
