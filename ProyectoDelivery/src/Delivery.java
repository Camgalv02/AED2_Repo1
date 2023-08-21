import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Delivery extends JFrame implements ActionListener
{
 
	JLabel l1, l2, l3;
	JTextField t1; // precio base
	JButton b1, b2;
	JCheckBox ch1, ch2, ch3, ch4, ch5;
	
	
	
	Delivery()
	{
	 
		setLayout(null);
		
		Font f1= new Font ("Serif", 1, 25);//segundo parametro:0-1-2-3 
		Font f2= new Font ("Serif", 1, 15);//  tercer parametro: tamaño
		
		l1 = new JLabel("Ingrese Precio Base de la Pizza: ");
		l1.setBounds(30,40,200,40);
		add(l1);
		
		t1= new JTextField ();
		t1.setBounds(230,30,100,40);
		add(t1);
		
		l2 = new JLabel("Seleccione los agregados:  ");
		l2.setBounds(60,80,200,40);
		add(l2);
		
		ch1= new JCheckBox("Morrones($20)");
		ch1.setBounds(60, 120, 150,30);
		add(ch1);
		
		ch2= new JCheckBox("Palmitos ($50)");
		ch2.setBounds(60, 150, 150,30);
		add(ch2);
		
		ch3= new JCheckBox("Roquefort ($30)");
		ch3.setBounds(60, 180, 150,30);
		add(ch3);
		
		ch4= new JCheckBox("Rúcula ($40)");
		ch4.setBounds(60, 210, 150,30);
		add(ch4);
		
		ch5= new JCheckBox("Ananá ($50)");
		ch5.setBounds(60, 240, 150,30);
		add(ch5);
		
		b1 = new JButton ("Calcular Precio");
		b1.setBounds(30, 290, 150, 40);
		b1.addActionListener(this);
		b1.setFont(f2);
		add(b1);
		
		l3 = new JLabel("$ 0.00", JLabel.CENTER);
		l3.setBounds(190,290,150,40);
		l3.setBackground(Color.black);
		l3.setOpaque(true);
		l3.setForeground(Color.green);
		l3.setFont(f1);
		add(l3);
		
		b2 = new JButton ("Finalizar el Programa");
		b2.setBounds(30, 340, 310, 40);
		b2.addActionListener(this);
		b2.setFont(f2);
		add(b2);
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1) //boton1
		{
		  String valor= t1.getText();
		  
		  if(valor.equals(""))
		  {
			  JOptionPane.showMessageDialog(null , "Debe ingresar Precio Base"); //ventana tipo modal
		  }
		  else 
		  {
			  float precio=0;
			  precio=Float.parseFloat(valor);
			  
			  String agregados="";//elemento nulo comilla sin espacio//acumulador
			  
			  if(ch1.isSelected())
			  {
				  precio= precio + 20;//de los morrones
				  agregados=agregados + "Morrones ";
			  }
			  
			  if(ch2.isSelected())
			  {
				  precio= precio + 50;//de los palmitos
				  agregados=agregados + "Palmitos ";
			  }
			  
			  if(ch3.isSelected())
			  {
				  precio= precio + 30;//del roquefort
				  agregados=agregados + "Roquefort ";
			  }
			  
			  if(ch4.isSelected())
			  {
				  precio= precio + 40;//de la rucula
				  agregados=agregados + "Rúcula ";
			  }
			  
			  if(ch5.isSelected())
			  {
				  precio= precio + 50;//del anana
				  agregados=agregados + "Ananá ";
			  }
			  
			  DecimalFormat f1 = new DecimalFormat("0.00"); // formato decimal a 2 ceros despues de la coma
			  l3.setText("$" + f1.format(precio));
			  
			  if(!agregados.equals(""))
			  {
				   JOptionPane.showMessageDialog(null , "Delivery de Pizza \n Ingredientes Agregados a la Pizza:\n "  +  agregados  +  "\n Precio Final:" + l3.getText());
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(null , "Delivery de Pizza \n Sin Agregados \n Precio Final:" + l3.getText());
			  }
			 
			  
		  }
		}
		
		if(e.getSource()==b2) //boton2
		{
			System.exit(0);
		}
	}
	

	
	
	public static void main(String[] args) {
		Delivery d1 = new Delivery();
		d1.setTitle(" Venta de Pizzas  ");
		d1.setBounds(300,200,400,500);
		d1.setVisible(true);

	}

}
