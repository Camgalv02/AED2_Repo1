import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Dialogo extends JDialog implements ActionListener {

	private JLabel l1, l2, l3;
	private JTextField t1, t2;
	private JButton b1, b2;

	Dialogo() 
	{

		setLayout(null);

		l1 = new JLabel("Usuario: ");
		l1.setBounds(40, 40, 150, 30);
		add(l1);

		t1 = new JTextField();
		t1.setBounds(130, 40, 150, 40);
		add(t1);

		l2 = new JLabel("Password: ");
		l2.setBounds(40, 80, 150, 30);
		add(l2);

		t2 = new JTextField();
		t2.setBounds(130, 80, 150, 40);
		add(t2);

		b1 = new JButton("Acceder al Sistema: ");
		b1.setBounds(40, 150, 250, 40);
		b1.addActionListener(this);
		add(b1);

		Font f1 = new Font("Serif", 1, 25);

		l3 = new JLabel("", JLabel.CENTER);
		l3.setBounds(40, 200, 240, 40);
		l3.setForeground(Color.blue);
		l3.setFont(f1);
		add(l3);

		b2 = new JButton("Ingresar");
		b2.setBounds(40, 250, 250, 40);
		b2.addActionListener(this);
		b2.setVisible(false);
		add(b2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String Login = t1.getText();
			String Password = t2.getText();

			if (Login.equals("") || Password.equals("")) {
				JOptionPane.showMessageDialog(null, "Falta ingresar algun dato");
			} else {
				if (Login.equalsIgnoreCase("Camila") && Password.equals("123456")) {
					l3.setForeground(Color.blue);
					l3.setText("Acceso Permitido");
					b2.setVisible(true);
				} else {
					l3.setForeground(Color.red);
					l3.setText("!!Acceso Denegado!!");
					b2.setVisible(false);
				}
			}
		}

		if (e.getSource() == b2) {
			String Login = t1.getText();
			String Password = t2.getText();

			Datos d2 = new Datos(Login, Password);
			d2.setBounds(500, 250, 300, 250);
			d2.setTitle("Datos Ingresados");
			d2.setModal(true);
			d2.setVisible(true);

		}

	}

	public String retornarUsuario() // funcion //si existe un return tiene que haber un tipo y viceversa
	{
		String Login = t1.getText();
		return Login;
	}

	public String retornarClave() // funcion
	{
		String Password = t2.getText();
		return Password;
	}

}
