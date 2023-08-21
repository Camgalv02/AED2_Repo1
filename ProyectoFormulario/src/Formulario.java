import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario extends JFrame implements ActionListener //herencia e implementacion
{
    JLabel label1, label2; //rotulos
	JButton b1, b2; //boton
	int bandera;
	
	
	Formulario() //constructor
	{
		setLayout(null); //disposicion o posicion absoluta de los objetos
		
		bandera=0; //texto normal (azul sobre cyan)
		
		//Font("Tipo de letra",calidad, tamaño);
		
		//calidad 0,1,2,3
		
		// 0: Texto Plano
		// 1: Texto en Negrita (Bolt)
		// 2: Texto Italic (Inclinada)
		// 3: Texto Negrita + Italic 
		
		
		Font f1= new Font("Serif",3,20);
		Font f2= new Font("Serif",1,20);
		
	
		
		label1 = new JLabel("Alumna: Camila Galvez",JLabel.CENTER);
	  //label1.setBounds(x, y, ancho, alto);
		label1.setBounds(70, 80, 250, 40); //datos del label
		label1.setBackground(Color.cyan); //color de fondo
		label1.setOpaque(true); //opacar color de fondo
		label1.setForeground(Color.blue); //color de texto
		label1.setFont(f1);
		add(label1); //visualizar el label
		
		
		label2 = new JLabel("Carrera: ASC",JLabel.CENTER);
		//label2.setBounds(x, y, ancho, alto);
		label2.setBounds(70, 150, 250, 40); //datos del label
		label2.setBackground(Color.cyan); //color de fondo
		label2.setOpaque(true); //opacar color de fondo
		label2.setForeground(Color.blue); //color de texto
		label2.setFont(f1);
		add(label2); //visualizar el label
		
		
		b1 =new JButton ("Texto Invertido");
		b1.setBounds(70,230,250,40);
		add(b1);
		b1.addActionListener(this); 
		b1.setFont(f2);
		
		
		b2 =new JButton ("Finalizar");
		b2.setBounds(70,300,250,40);
		add(b2);
		b2.addActionListener(this); 
		b2.setFont(f2);
		
	}
										//e toma el valor de el boton presionado
	public void actionPerformed(ActionEvent e) //metodo //tantos if como botones tenga
	{
		if(e.getSource()==b1) //tomar la fuente del llamado
		{
			if(bandera==0) 
			{
			//texto normal (cyan sobre fondo azul)
			//invertir colores
			label1.setBackground(Color.blue); //color de fondo
			label1.setForeground(Color.cyan); //color de texto
			
			label2.setBackground(Color.blue); //color de fondo
			label2.setForeground(Color.cyan); //color de texto
			bandera = 1;
			}
			else {
				//texto normal (azul sobre fondo cyan)
				//invertir colores
				label1.setBackground(Color.cyan); //color de fondo
				label1.setForeground(Color.blue); //color de texto
				
				label2.setBackground(Color.cyan); //color de fondo
				label2.setForeground(Color.blue); //color de texto
				bandera = 0;
			}
		}
		
		if(e.getSource()==b2) 
		{
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		
	Formulario f = new Formulario();
		
		f.setBounds(200,150,400,500); // datos del formulario (ventana exterior
		f.setTitle("   *** Mi Primer Formulario ***   "); //titlulo de la ventana
		f.setVisible(true); //visualizar mostrar

	}

}
