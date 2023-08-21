import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class System extends JFrame implements ActionListener {

	JLabel l1;
	JButton b1;

	System() 
	{
		setLayout(null);

		Font f1 = new Font("Serif", 1, 35);
		Font f2 = new Font("Serif", 1, 25);

		l1 = new JLabel("Sistema de Gestión", JLabel.CENTER);
		l1.setBounds(40, 50, 300, 60);
		l1.setForeground(Color.blue);
		l1.setFont(f1);
		add(l1);

		b1 = new JButton("Ingresar al Sistema: ");
		b1.setBounds(50, 170, 280, 40);
		b1.addActionListener(this);
		b1.setFont(f2);
		b1.setForeground(Color.blue);
		add(b1);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			Dialogo d1 = new Dialogo();
			d1.setBounds(350, 250, 350, 350);
			d1.setTitle("***Login***");
			// d1.setModal(true); //son cuadros de ventanas que cuando se abren, hasta que
			// no se cierran no se puede ejecutar otra cosa
			d1.setResizable(false);// si esta en falso no permite cambiar el tamaño del cuadro de la main
			d1.setVisible(true);
		}
	}

	public static void main(String[] args) {
		System s1 = new System();

		s1.setBounds(300, 200, 400, 350);
		s1.setTitle("Sistema");
		s1.setVisible(true);

	}

}
