import javax.swing.*;
import java.awt.event.*;

class DialogoDimension extends JDialog implements ActionListener 
{
	
	JLabel label1;
	JLabel label2;
	JTextField textfield1;
	JTextField textfield2;
	JButton button1;

	
	DialogoDimension(int ancho, int alto) 
	{

		setResizable(false);

		setModal(true);

		setLayout(null);

		label1 = new JLabel("Ancho");
		label1.setBounds(24, 40, 91, 20);
		add(label1);

		label2 = new JLabel("Alto");
		label2.setBounds(24, 80, 91, 20);
		add(label2);

		textfield1 = new JTextField(String.valueOf(ancho));// rescatar valor
		textfield1.setBounds(136, 40, 90, 25);
		add(textfield1);

		textfield2 = new JTextField(String.valueOf(alto));
		textfield2.setBounds(136, 80, 90, 25);
		add(textfield2);

		button1 = new JButton("Confirmar");
		button1.addActionListener(this);
		button1.setBounds(136, 120, 88, 24);
		add(button1);

	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == button1)
			dispose();
	}

	int retornarAncho() 
	{
		int ancho = Integer.parseInt(textfield1.getText());
		return ancho;
	}

	int retornarAlto() {
		int alto = Integer.parseInt(textfield2.getText());
		return alto;
	}
}