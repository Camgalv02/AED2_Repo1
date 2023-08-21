import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Aplicación extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ButtonGroup buttonGroup;
	private JLabel l1;
	private JRadioButton r2;
	private JRadioButton r1;
	JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Aplicación dialog = new Aplicación();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Aplicación() {
		setTitle("  Sueldo a Cobrar");
		setBounds(100, 100, 577, 497);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Ingrese Nombre:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(37, 39, 124, 27);
			contentPanel.add(lblNewLabel);
		}

		textField = new JTextField();
		textField.setBounds(255, 41, 124, 24);
		contentPanel.add(textField);
		textField.setColumns(10);

		JLabel sueldo = new JLabel("Sueldo por Hora:");
		sueldo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sueldo.setBounds(37, 89, 124, 27);
		contentPanel.add(sueldo);

		JLabel cantidadHoras = new JLabel("Cantidad de Horas trabajadas:");
		cantidadHoras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cantidadHoras.setBounds(37, 141, 199, 27);
		contentPanel.add(cantidadHoras);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(255, 91, 124, 24);
		contentPanel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(255, 143, 124, 24);
		contentPanel.add(textField_2);

		buttonGroup=new ButtonGroup();
		
		r1 = new JRadioButton("Presenta Asignaciones Familiares");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonGroup.add(r1);
		r1.setBounds(37, 208, 236, 23);
		contentPanel.add(r1);

		r2 = new JRadioButton("NO Presenta Asignaciones Familiares");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonGroup.add(r2);
		r2.setSelected(true);
		r2.setBounds(37, 244, 255, 23);
		contentPanel.add(r2);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Descuento por Obra Social", "Sin Descuento por Obra Social" }));
		comboBox.setBounds(255, 294, 216, 27);
		contentPanel.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Seleccione  una Opci\u00F3n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(37, 293, 164, 27);
		contentPanel.add(lblNewLabel_1);

		JButton b1 = new JButton("Calcular Salario");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato1 = textField_1.getText();
				String dato2 = textField_2.getText();

				if (dato1.equals("") || dato2.equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar los valores del sueldo y la cantidad de horas");
				} else {
					float sueldo = Float.parseFloat(dato1);
					int cantidadHoras = Integer.parseInt(dato2);

					float sueldoNeto = sueldo * cantidadHoras;

					float incremento = 0;

					if (r1.isSelected())

						incremento = sueldoNeto * 20 / 100;

					float descuento = 0;

					int posicion = comboBox.getSelectedIndex();
					if (posicion == 0)

						descuento = sueldoNeto * 10 / 100;
					sueldoNeto = sueldoNeto + incremento - descuento;

					DecimalFormat f = new DecimalFormat("0.00");
					l1.setText("$" + f.format(sueldoNeto));
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		b1.setBounds(37, 349, 124, 35);
		contentPanel.add(b1);

		l1 = new JLabel("0,00 ");
		l1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		l1.setOpaque(true);
		l1.setBackground(SystemColor.info);
		l1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(257, 352, 153, 27);
		contentPanel.add(l1);

		JButton b2 = new JButton("Volver al Programa Principal");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		b2.setBounds(37, 397, 434, 35);
		contentPanel.add(b2);
	}
}
