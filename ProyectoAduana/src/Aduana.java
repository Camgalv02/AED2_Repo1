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
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Aduana extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JComboBox comboBox;
	int revisados=0;
	int noRevisados=0;
	int n=0,valor=0;
	private JLabel label2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aduana frame = new Aduana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Aduana() {
		setTitle("  Revisi\u00F3n de Maletas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad de Bultos");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(59, 11, 137, 21);
		contentPane.add(lblNewLabel);
		
		label1 = new JLabel("0");
		label1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label1.setForeground(Color.MAGENTA);
		label1.setOpaque(true);
		label1.setBackground(Color.PINK);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label1.setBounds(67, 68, 66, 43);
		contentPane.add(label1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato1 = label1.getText();
				int n = Integer.parseInt(dato1);
				
				if(n < 10)
				{	
					n++;
					label1.setText(String.valueOf(n));
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(143, 59, 53, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato1 = label1.getText();
				int n = Integer.parseInt(dato1);
				
				if(n > 0)
				{	
					n--;
					label1.setText(String.valueOf(n));
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(143, 101, 53, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sortear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String dato = label1.getText();
				 valor = Integer.parseInt(dato);
				
				if(valor != 0)
				{	
					
					
					
					n = (int) (Math.random()*3)+1;
					setTitle("Numero generado: " + n);
					
					if(n==1)
					{
						revisados++;
					}
					else
					{
						noRevisados++;
					}				
					
					label2.setText("Revisados: " + revisados + " No Revisados: " + noRevisados);
					repaint();
				}
				else
					JOptionPane.showMessageDialog(null, "Debe indicar la cantidad de bultos");
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(59, 162, 89, 30);
		contentPane.add(btnNewButton_2);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Interior", "Exterior"}));
		comboBox.setBounds(349, 51, 94, 22);
		contentPane.add(comboBox);
		
		JLabel lblProcedencia = new JLabel("Procedencia");
		lblProcedencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcedencia.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblProcedencia.setBounds(306, 11, 137, 21);
		contentPane.add(lblProcedencia);
		
		label2 = new JLabel("---------");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label2.setBounds(59, 221, 278, 21);
		contentPane.add(label2);
	}
	
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.setColor(Color.white);
		g.fillOval(350,180,80,80);
		
		if(n==1 || valor > 5)
		{
			g.setColor(Color.red);
			g.fillOval(350,180,80,80);
		}
		else
		{
			g.setColor(Color.black);
			g.fillOval(350,180,80,80);
		}
			
				
	}

}
