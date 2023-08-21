import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

public class Ascensor extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JLabel label2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascensor frame = new Ascensor();
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
	public Ascensor() {
		setTitle("  Ascensor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();
				int piso= Integer.parseInt(dato1);
				
				if(piso>1)
				{
					label1.setText("1");
					label2.setText("Baja");
				}
				else 
					label2.setText("Mismo Piso");
				
				y=335;
				repaint();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(72, 304, 53, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();
				int piso= Integer.parseInt(dato1);
				
				if(piso<2)
				{
					label1.setText("2");
					label2.setText("Sube");
				}
				else
					if(piso>2)
					{
						label1.setText("2");
						label2.setText("Baja");
					}
					else
						label2.setText("Mismo Piso");
				
				y=265;
				repaint();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(72, 232, 53, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();
				int piso= Integer.parseInt(dato1);
				
				if(piso<3)
				{
					label1.setText("3");
					label2.setText("Sube");
				}
				else
					if(piso>3)
					{
						label1.setText("3");
						label2.setText("Baja");
					}
					else
						label2.setText("Mismo Piso");
				
				y=190;
				repaint();
					
			}
		});
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(72, 159, 53, 52);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();
				int piso= Integer.parseInt(dato1);
				
				if(piso<4)
				{
					label1.setText("4");
					label2.setText("Sube");
				}
				else {
					label2.setText("Mismo Piso");
				}
				
				y=115;
				repaint();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(72, 83, 53, 52);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero de piso");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(229, 148, 132, 40);
		contentPane.add(lblNewLabel);
		
		label1 = new JLabel("1");
		label1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label1.setOpaque(true);
		label1.setBackground(Color.BLACK);
		label1.setForeground(Color.GREEN);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(399, 148, 46, 40);
		contentPane.add(label1);
		
		label2 = new JLabel("------");
		label2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label2.setOpaque(true);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.GREEN);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label2.setBackground(Color.BLACK);
		label2.setBounds(399, 260, 103, 40);
		contentPane.add(label2);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDireccin.setBounds(229, 260, 132, 40);
		contentPane.add(lblDireccin);
	}
	
	int y = 335; // Piso 1
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//Ascensor en rojo
		g.setColor(Color.red);
		g.fillRect(160,y,30,52);
		
		
		//Rectangulo de desplazamiento
		g.setColor(Color.black);
		g.drawRect(160,105,30,290);
		
	}
	
}

