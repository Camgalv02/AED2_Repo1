import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Factura extends JDialog implements ActionListener {
	
	JLabel label1, label2, label3, label4, label5, label6, label7, label8;
	JButton boton1;

	Factura(String tipoVehiculo, String dias, String seguro, String valorFinal) {
		setLayout(null);

		label1 = new JLabel("Tipo de Vehiculo: ");
		label1.setBounds(30, 30, 130, 30);
		add(label1);

		label2 = new JLabel(tipoVehiculo);
		label2.setBounds(150, 30, 130, 30);
		add(label2);

		label3 = new JLabel("Dias de alquiler: ");
		label3.setBounds(30, 70, 130, 30);
		add(label3);

		label4 = new JLabel(dias);
		label4.setBounds(150, 70, 130, 30);
		add(label4);

		label5 = new JLabel("Tipo de contrato: ");
		label5.setBounds(30, 110, 130, 30);
		add(label5);

		label6 = new JLabel(seguro);
		label6.setBounds(150, 110, 130, 30);
		add(label6);

		label7 = new JLabel("Monto a abonar: ");
		label7.setBounds(30, 150, 130, 30);
		add(label7);

		label8 = new JLabel(valorFinal);
		label8.setBounds(150, 150, 130, 30);
		add(label8);

		boton1 = new JButton("Salir");
		boton1.setBounds(80, 190, 130, 30);
		boton1.addActionListener(this);
		add(boton1);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			dispose();

		}
	}
}
