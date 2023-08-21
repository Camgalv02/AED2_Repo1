
public class Cliente {

	String nombre;
	float monto;
	
	public Cliente (String n, float m) //crea los clientes //Constructor // es un metodo que es el primero que se ejecuta
	{
		nombre = n;
		monto = 0;
		
	}
	
	public void  deposito (float m)	
	{
		monto = monto + m; //acumulador
	}
	

	public void  extraer (float m)	
	{
		monto = monto - m; //acumulador
	}	
	
public float retornarMonto () //funcion // que me retorna algo

{
	return monto;
}
//si hay un tipo delante de la funcion debe haber un return

	public void mostrarDatos()
	{
		System.out.println("El cliente "+ nombre + " tiene un depósito de: "+ monto);
	}
}



