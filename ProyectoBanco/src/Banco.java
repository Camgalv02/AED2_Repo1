
public class Banco {
             
	Cliente cliente1, cliente2, cliente3; //objetos o instancias de la clase
	
	public Banco() //Constructor
	{
		cliente1=new Cliente("Marcelo",0);
		cliente2=new Cliente("Javier",10000);
		cliente3=new Cliente("Alejandro",0);
	}

	
	public void operar()
	{
		cliente1.deposito(5000);
		cliente2.deposito(9000);
		cliente3.deposito(2000);
		cliente2.deposito(3000);
		cliente1.deposito(4000);
		cliente3.extraer(500);
	}
	
	public void mostrarDepositos()
	{
		System.out.println("Depósitos de los clientes ");
		System.out.println("......................... ");
		System.out.println();
		cliente1.mostrarDatos();
		cliente2.mostrarDatos();
		cliente3.mostrarDatos();
		
		float m1= cliente1. retornarMonto ();
		float m2= cliente2. retornarMonto ();
		float m3= cliente3. retornarMonto ();
		
		float total = m1 + m2 + m3 ;
		
		System.out.println();
		System.out.println("El total de dinero en el banco es: $"+ total);
	}
	
	
	
	public static void main(String[] args) {
		Banco b= new Banco();
		b.operar();
		b.mostrarDepositos();

	}

}
