import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sistema extends JFrame implements ActionListener {

	JLabel l1;
	JButton b1;

	Sistema() 
	{
		
		setLayout(null);

		Font f1 = new Font("Impact", 1, 35);
		Font f2 = new Font("Serif", 1, 25);

		l1 = new JLabel("Sistema de Gestión", JLabel.CENTER);
		l1.setBounds(40, 50, 300, 60);
		l1.setForeground(Color.black);
		l1.setFont(f1);
		add(l1);

		b1 = new JButton("Ingresar al Sistema: ");
		b1.setBounds(50, 170, 280, 40);
		b1.addActionListener(this);
		b1.setFont(f2);
		b1.setForeground(Color.black);
		add(b1);
	}

	public void actionPerformed(ActionEvent e) 
	{

	
	}

	public static void main(String[] args) {
		Sistema s1 = new Sistema();

		s1.setBounds(300, 200, 400, 350);
		s1.setTitle("Sistema");
		s1.setVisible(true);
		//s1.getContentPane()
	}

}
