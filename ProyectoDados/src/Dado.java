
public class Dado {

	int valor; //private
	
	public void tirar ()
	{
	
	valor = (int) ( Math.random()	* 6 ) + 1;  // genera números aleatorios entre 1 y 6
		
	}
	
	public void imprimirValor(String dado)
	{
		System.out.println("El valor del "+ dado + " es: "+ valor);
	}
	
	public int retornarValor() 
	{
		return valor;
	}
}
