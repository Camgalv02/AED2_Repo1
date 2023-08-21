import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Factura extends JDialog implements ActionListener
{
	JLabel l1, l2, l3, l4, l5,l6,l7,l8;
	JButton b1;
	
	
    Factura(String tipo,String dias, String leyenda, String importe)
	{
		setLayout(null);
		
		l1 = new JLabel("tipo de Vehículo: ");
		l1.setBounds(30, 30, 150, 40);
		add(l1);
		
		l2 = new JLabel(tipo);
		l2.setBounds(180, 30, 150, 40);
		add(l2);
		

		
	}
	public void actionPerformed(ActionEvent e)
	{

		

	}

}
