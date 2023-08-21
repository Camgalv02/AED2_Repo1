import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Alquiler extends JFrame implements ActionListener {

	JLabel label1, label2, label3;
	JComboBox box1;
	JButton boton1, boton2, boton3;
	JTextField texto1;
	JRadioButton radio1, radio2;
	ButtonGroup grupo1;
	String valorFinal;

	Alquiler() {

		setLayout(null);

		label1 = new JLabel("Seleccione Vehículo");
		label1.setBounds(30, 30, 120, 30);
		add(label1);

		box1 = new JComboBox();
		box1.setBounds(160, 30, 140, 30);
		box1.addItem("Hatchback $1500");
		box1.addItem("Sedan $800");
		box1.addItem("Utilitario $1000");
		box1.addItem("SUV $1200");
		box1.addItem("TodoTerreno $2000");
		add(box1);

		label2 = new JLabel("Ingrese Dias a Alquilar");
		label2.setBounds(30, 80, 130, 30);
		add(label2);

		texto1 = new JTextField("1", JTextField.CENTER);
		texto1.setBounds(170, 80, 40, 30);
		add(texto1);

		grupo1 = new ButtonGroup();

		radio1 = new JRadioButton("Con Seguro + %10 final");
		radio1.setBounds(30, 120, 200, 30);
		grupo1.add(radio1);
		add(radio1);

		radio2 = new JRadioButton("Sin Seguro");
		radio2.setBounds(30, 160, 150, 30);
		grupo1.add(radio2);
		add(radio2);

		boton1 = new JButton("Calcular");
		boton1.setBounds(50, 200, 100, 30);
		boton1.addActionListener(this);
		add(boton1);

		label3 = new JLabel("$0", JLabel.CENTER);
		label3.setBounds(160, 200, 100, 30);
		label3.setBackground(Color.black);
		label3.setOpaque(true);
		label3.setForeground(Color.red);
		add(label3);

		boton2 = new JButton("Ver Factura");
		boton2.setBounds(30, 240, 260, 30);
		boton2.addActionListener(this);
		add(boton2);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton1) {
			String tipoVehiculo = box1.getSelectedItem().toString();
			int item = box1.getSelectedIndex();
			String dias = texto1.getText();

			if (dias.equals("")) {
				JOptionPane.showMessageDialog(null, "Debe ingresar Días");
			} else {
				float precio = 0;
				int cantidadDias = Integer.parseInt(dias);
				if (item == 0) {
					precio = 1500;

				} else if (item == 1) {
					precio = 800;
				} else if (item == 2) {
					precio = 1000;
				} else if (item == 3) {
					precio = 1200;
				} else if (item == 4) {
					precio = 2000;
				}
				float total = precio * cantidadDias;
				valorFinal = "$ " + String.valueOf(total);

				if (radio1.isSelected()) {
					total = total * 1.10f; // sin la f es del tipo double
					valorFinal = "$ " + String.valueOf(total);
				}

				DecimalFormat f1 = new DecimalFormat("0.00");
				label3.setText("$" + f1.format(total));

			}

		}

		if (e.getSource() == boton2) {
			Factura f = new Factura(retornarVehiculo(), retornarDias(), retornarSeguro(), retornarTotal());
			f.setBounds(350, 300, 300, 300);
			f.setTitle("***** Factura *****");
			f.setVisible(true);
		}
	}

	public String retornarVehiculo() {
		String tipoVehiculo = box1.getSelectedItem().toString();

		return tipoVehiculo;
	}

	public String retornarDias() {
		String dias = texto1.getText();

		return dias;
	}

	public String retornarSeguro() {
		String seguro;

		if (radio1.isSelected()) {
			seguro = "Alquiler con Seguro";
		} else {
			seguro = "Alquiler sin Seguro";
		}

		return seguro;

	}

	public String retornarTotal() {

		return valorFinal;

	}

	public static void main(String[] args) {
		Alquiler a = new Alquiler();
		a.setBounds(40, 40, 340, 380);
		a.setTitle("ALQUILER DE VEHICULOS");
		a.setVisible(true);

	}

}