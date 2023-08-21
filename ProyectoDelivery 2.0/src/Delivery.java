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

public class Delivery extends JFrame implements ActionListener {

	JLabel label1, label2, label3, label4;
	JTextField texto1;
	JButton boton1, boton2;
	JCheckBox box1, box2, box3, box4;
	

	Delivery() 
	{
		
		setLayout(null);

		Font f1 = new Font("Segoe Script", 1, 20);
		Font f2 = new Font("Serif", 1, 18);

		label1 = new JLabel("Delivery de Pizzas");
		label1.setBounds(90, 40, 250, 40);
		add(label1);
		label1.setFont(f1);

		label2 = new JLabel("Ingrese el precio base: ");
		label2.setBounds(40, 90, 200, 40);
		add(label2);
		label2.setFont(f2);

		texto1 = new JTextField();
		texto1.setBounds(220, 100, 100, 30);
		add(texto1);

		label3 = new JLabel("Seleccione Adicionales: ");
		label3.setBounds(40, 150, 200, 40);
		add(label3);
		label3.setFont(f2);

		box1 = new JCheckBox("Palmitos $40");
		box1.setBounds(40, 200, 120, 40);
		add(box1);

		box2 = new JCheckBox("Morrón $30");
		box2.setBounds(40, 230, 120, 40);
		add(box2);

		box3 = new JCheckBox("Rúcula $20");
		box3.setBounds(40, 260, 120, 40);
		add(box3);

		box4 = new JCheckBox("Aceituna $10");
		box4.setBounds(40, 290, 120, 40);
		add(box4);

		boton1 = new JButton("Calcular");
		boton1.setBounds(40, 350, 120, 40);
		add(boton1);
		boton1.addActionListener(this);

		label4 = new JLabel("0.00", JLabel.CENTER);
		label4.setBounds(220, 350, 150, 40);
		label4.setOpaque(true);
		label4.setBackground(Color.white);
		label4.setForeground(Color.blue);
		add(label4);
		label4.setFont(f1);

		boton2 = new JButton("Salir");
		boton2.setBounds(40, 400, 330, 40);
		add(boton2);
		boton2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==boton1) //boton1
		{
		  String valor= texto1.getText();
		  
		  if(valor.equals(""))
		  {
			  JOptionPane.showMessageDialog(null , "Debe ingresar Precio Base"); //ventana tipo modal
		  }
		  else 
		  {
			  float precio=0;
			  precio=Float.parseFloat(valor);
			  
			  String agregados="";//elemento nulo comilla sin espacio//acumulador
			  
			  if(box1.isSelected())
			  {
				  precio= precio + 40;//de los palmitos
				  agregados=agregados + "Palmitos ";
			  }
			  
			  if(box2.isSelected())
			  {
				  precio= precio + 30;//de los morrones
				  agregados=agregados + "Morrones ";
			  }
			  
			  if(box3.isSelected())
			  {
				  precio= precio + 20;//de la rucula
				  agregados=agregados + "Rúcula ";
			  }
			  
			  if(box4.isSelected())
			  {
				  precio= precio + 10;//de la aceituna
				  agregados=agregados + "Aceitunas";
			  }
			  
			  
			  DecimalFormat f1 = new DecimalFormat("0.00"); // formato decimal a 2 ceros despues de la coma
			  label4.setText("$" + f1.format(precio));
			  
			  if(!agregados.equals(""))
			  {
				   JOptionPane.showMessageDialog(null , "Delivery de Pizza \n Ingredientes Agregados a la Pizza:\n "  +  agregados  +  "\n Precio Final:" + label4.getText());
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(null , "Delivery de Pizza \n Sin Agregados \n Precio Final:" + label4.getText());
			  }
			 
			  
		  }
		}
		
		if(e.getSource()==boton2) //boton2
		{
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		Delivery d = new Delivery();
		d.setBounds(300, 200, 400, 500);
		d.setTitle("Delivery de Pizzas");
		d.setVisible(true);
		d.getContentPane().setBackground(new Color(70, 50, 200));// valores del 255 para abajo

	}

}