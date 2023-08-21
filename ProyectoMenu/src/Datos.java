import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Datos extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Datos dialog = new Datos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Datos() {
		setTitle("        Datos del programador");
		setBounds(100, 100, 450, 366);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.ORANGE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre del programador:       Camila Galvez");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
			lblNewLabel.setBounds(33, 49, 345, 32);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblMateriaAlgoritmosY = new JLabel("Materia: Algoritmos y Estructura de Datos II");
			lblMateriaAlgoritmosY.setHorizontalAlignment(SwingConstants.CENTER);
			lblMateriaAlgoritmosY.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
			lblMateriaAlgoritmosY.setBounds(33, 113, 345, 32);
			contentPanel.add(lblMateriaAlgoritmosY);
		}
		{
			JLabel lblCarreraAnalistaDe = new JLabel("  Carrera: Analista de Sistemas");
			lblCarreraAnalistaDe.setHorizontalAlignment(SwingConstants.CENTER);
			lblCarreraAnalistaDe.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
			lblCarreraAnalistaDe.setBounds(33, 176, 345, 32);
			contentPanel.add(lblCarreraAnalistaDe);
		}
		{
			JLabel lblVersin = new JLabel("Versi\u00F3n: 1.0.0");
			lblVersin.setHorizontalAlignment(SwingConstants.CENTER);
			lblVersin.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
			lblVersin.setBounds(80, 252, 247, 32);
			contentPanel.add(lblVersin);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Cerrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						dispose();
					}
				});
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
