import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Alquiler extends JDialog implements ActionListener {

	JLabel l1, l2, l3;
	JComboBox c1;
	JButton b1, b2;
	JTextField t1;
	JRadioButton r1, r2;
	ButtonGroup g1;

	Alquiler() {
		setLayout(null);

		l1 = new JLabel("Seleccione tipo de Vehículo: ");
		l1.setBounds(30, 30, 300, 40);
		add(l1);

		c1 = new JComboBox();
		c1.setBounds(200, 30, 120, 40);
		c1.addItem("Sedán ($800)");
		c1.addItem("Coupé ($1500)");
		c1.addItem("Pick-Up ($1000)");
		c1.addItem("4x4 ($2000)");
		add(c1);

		l2 = new JLabel("Ingrese cantidad de Días: ");
		l2.setBounds(30, 90, 300, 40);
		add(l2);

		t1 = new JTextField("1"); // valor por defecto
		t1.setBounds(200, 90, 40, 40);
		add(t1);

		g1 = new ButtonGroup();

		r1 = new JRadioButton("Adicione Seguro (10% del alquiler)");
		r1.setBounds(30, 140, 300, 30);
		add(r1);
		g1.add(r1);

		r2 = new JRadioButton("Sin Seguro");
		r2.setBounds(30, 170, 200, 30);
		r2.setSelected(true);// valor por defecto
		add(r2);
		g1.add(r2);

		b1 = new JButton("Calcular Importe");
		b1.setBounds(30, 220, 150, 40);
		b1.addActionListener(this);
		add(b1);

		Font f1 = new Font("Serif", 1, 25);

		l3 = new JLabel("$0,00", JLabel.CENTER);
		l3.setBounds(190, 220, 140, 40);
		l3.setBackground(Color.orange);
		l3.setOpaque(true);
		l3.setFont(f1);
		add(l3);

		b2 = new JButton("Ver Factura");
		b2.setBounds(30, 270, 300, 40);
		b2.addActionListener(this);
		add(b2);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			String tipo = c1.getSelectedItem().toString();
			int item = c1.getSelectedIndex(); // cual item esta seleccionado?
			String dato = t1.getText();

			if (dato.equals(""))// si dato es igual a nada, entonces...
			{
				JOptionPane.showMessageDialog(null, "Falta Ingresar la cantidad de días");
			} else {
				float precio = 0;
				int cantidad = Integer.parseInt(dato); // transformacion de string a int

				if (item == 0)
					precio = 800;
				else if (item == 1)
					precio = 1500;
				else if (item == 2)
					precio = 1000;
				else if (item == 3)
					precio = 2000;

				float total = precio * cantidad;
				if (r1.isSelected()) {
					total = total * 1.10f; // division por float; al numero se le debe colocar f
				}

				DecimalFormat f1 = new DecimalFormat("0.00");
				l3.setText("$ " + f1.format(total));
			}
		}

		if (e.getSource() == b2) {
			
			String tipo = c1.getSelectedItem().toString();//rescate del texto
			int indice =c1.getSelectedIndex();//rescate de la posicion
			
			if(indice==0) tipo= "Sedán";
			else
				if(indice==1) tipo= "Coupé";
				else
					if(indice==2) tipo= "Pick-Up";
					else
						if(indice==3) tipo= "4x4";
		
			
			
			
			String dias=t1.getText();
			
			String leyenda ="";//elemento neutro de la leyenda
			if(r1.isSelected())
			{
				leyenda="Con Seguro";
			}
			else {
				leyenda="Sin Seguro";
			}
			
			
			
			String importe = l3.getText();
			
			Factura f = new Factura(tipo, dias,leyenda,importe);
			f.setBounds(350,300,300,400);
			f.setVisible(true);
		}
	}

	public static void main(String[] args) {

		Alquiler a = new Alquiler();

		a.setBounds(300, 200, 380, 400);
		a.setTitle("Alquiler de Vehículos");
		a.setVisible(true);
	}

}
