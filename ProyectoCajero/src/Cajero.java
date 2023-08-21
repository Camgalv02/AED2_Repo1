import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Cajero extends JFrame {

	private JPanel contentPane;
	private JComboBox cb1;
	private JComboBox cb2;
	private float monto = 3000;
	private JLabel label1;
	private JLabel label2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cajero frame = new Cajero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cajero() {
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setTitle("Cajero Automatico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 312);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dinero a extraer");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 68, 140, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de Cuenta");
		lblTipoDeCuenta.setForeground(Color.PINK);
		lblTipoDeCuenta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTipoDeCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeCuenta.setBounds(251, 68, 140, 22);
		contentPane.add(lblTipoDeCuenta);
		
		cb1 = new JComboBox();
		cb1.setBorder(UIManager.getBorder("RadioButton.border"));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"0", "50", "100", "150", "200", "250", "300", "350", "400", "450", "500"}));
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cb1.setBounds(37, 101, 130, 35);
		contentPane.add(cb1);
		
		JButton btnNewButton = new JButton("Extraer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1 = cb1.getSelectedItem().toString();
				float dinero = Float.parseFloat(dato1);
				
				int indice = cb2.getSelectedIndex();
				
				DecimalFormat f = new DecimalFormat("0.00");	
				
				
				
				if (indice == 0 && dinero <= 200)
				{									
					if(monto >= dinero)
					{
					monto = monto - dinero;
					label2.setText("$ " + f.format(monto));
					label1.setText("Correcto");
					b=3;
					repaint();
					}
					else
					{
						label1.setText("Incorrecto");
						JOptionPane.showMessageDialog(null, "Fondo Insuficiente");
					}
				}
				else
					if (indice == 1 && dinero <= 400)
					{
						if(monto >= dinero)
						{
						monto = monto - dinero;
						label2.setText("$ " + f.format(monto));
						//label2.setText(String.valueOf(monto)); se peude hacer pero te coloca todos los decimales
						label1.setText("Correcto");
						b=3;
						repaint();
						}
						else
						{
							label1.setText("Incorrecto");
							JOptionPane.showMessageDialog(null, "Fondo Insuficiente");							
						}
					}
					else
					{
						label1.setText("Incorrecto");						
						b=1;
						repaint();
					}
					
				if (indice == 0 && dinero > 200)
				{
					b=2;
					repaint();
				}
				
				if (indice == 1 && dinero > 400)
				{
					b=2;
					repaint();
				}
				
				if (dinero > monto)
				{
					b=1;
					repaint();
				}
				
				if (monto==0)
				{
					b=3;
					repaint();
				}
			}
		});
		btnNewButton.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(27, 220, 130, 31);
		contentPane.add(btnNewButton);
		
		cb2 = new JComboBox();
		cb2.setBorder(UIManager.getBorder("CheckBox.border"));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Caja de ahorro", "Cuenta Corriente"}));
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cb2.setBounds(221, 101, 201, 35);
		contentPane.add(cb2);
		
		label1 = new JLabel("-------");
		label1.setBackground(Color.DARK_GRAY);
		label1.setForeground(Color.PINK);
		label1.setOpaque(true);
		label1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(179, 220, 109, 31);
		contentPane.add(label1);
		
		JLabel lblMonto = new JLabel("Monto:");
		lblMonto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonto.setForeground(Color.PINK);
		lblMonto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMonto.setBounds(27, 26, 118, 22);
		contentPane.add(lblMonto);
		
		label2 = new JLabel("$ 3000,00");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.PINK);
		label2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label2.setBounds(132, 26, 118, 22);
		contentPane.add(label2);
	}
	
	int b=0; //Sin color
	 //rojo
	 //amarillo
	 // verde
	
	public void paint(Graphics g)
	{
		super.paint(g);
		if(b==3)
		{
		g.setColor(Color.green);
		g.fillOval(370, 200, 75,75); // Circulo lleno
		
		
		
		g.setColor(Color.pink);
		g.drawOval(370, 200, 75,75);  // Circulo vacio
		}
		
		else 
			if(b==2)
		{
		g.setColor(Color.yellow);
		g.fillOval(370, 200, 75,75);
		
		
		
		g.setColor(Color.pink);
		g.drawOval(370, 200, 75,75);  
		}
		
			else 
				if(b==1)
			{
			g.setColor(Color.red);
			g.fillOval(370, 200, 75,75);
			
			
			
			g.setColor(Color.pink);
			g.drawOval(370, 200, 75,75);  
			}
	}
}