import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Datos extends JDialog implements ActionListener {

	JLabel l1, l2, l3, l4;
	JButton b1;

	Datos(String L, String P) // l de login y p de password
	{
		setLayout(null);

		l1 = new JLabel("Login: ");
		l1.setBounds(30, 30, 100, 40); // primer 30 + 100
		add(l1);

		l2 = new JLabel("----------");
		l2.setBounds(130, 30, 150, 40);
		add(l2);

		l3 = new JLabel("Password: ");
		l3.setBounds(30, 80, 100, 40); // 30+40+10 =80
		add(l3);

		l4 = new JLabel("----------");
		l4.setBounds(130, 80, 150, 40);
		add(l4);

		b1 = new JButton("Cerrar Ventana");
		b1.addActionListener(this);
		b1.setBounds(30, 150, 230, 40);
		add(b1);

		l2.setText(L);
		l4.setText(P);

		// set text es para depositar un valor
		// get text es para tomar un valor

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			dispose(); // cierra una ventana
		}
	}

}