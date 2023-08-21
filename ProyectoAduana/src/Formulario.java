import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener {

	private JButton bsube, bbaja;
	private JButton bsortear;
	private JLabel lvalor, lresultado;
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1;
	private int revisados = 0;
	private int norevisados = 0;

	public Formulario() {

		setLayout(null);

		mb = new JMenuBar();
		setJMenuBar(mb);

		menu1 = new JMenu("Opciones");
		mb.add(menu1);

		mi1 = new JMenuItem("Ver dialogo");
		mi1.addActionListener(this);
		menu1.add(mi1);

		lvalor = new JLabel("0", JLabel.CENTER);
		lvalor.setBounds(10, 50, 80, 30);
		lvalor.setFont(new Font("Aria", Font.BOLD, 20));
		add(lvalor);

		bsube = new JButton("^");
		bsube.setBounds(100, 30, 60, 40);
		bsube.addActionListener(this);
		add(bsube);

		bbaja = new JButton("cero");
		bbaja.setBounds(100, 75, 60, 40);
		bbaja.addActionListener(this);
		add(bbaja);

		bsortear = new JButton("Sortear");
		bsortear.setBounds(10, 130, 150, 40);
		bsortear.addActionListener(this);
		add(bsortear);

		lresultado = new JLabel("");
		lresultado.setBounds(170, 130, 60, 60);
		lresultado.setOpaque(true);
		add(lresultado);
	}

public void actionPerformed(ActionEvent e)
{
	if (e.getSource()==bsube) {

		int x=Integer.parseInt(lvalor.getText());
		x++;
		lvalor.setText(String.valueOf(x));

	}

	if (e.getSource()==bbaja) 
	{
		lvalor.setText("0");
	}
	
	if (e.getSource()==bsortear)
	{
	
		int sorteo=1+(int)(Math.random()*3);
		int vul=Integer.parseInt(lvalor.getText());
		if (sorteo==1)
	
	
		lresultado.setBackground(Color.red);
		revisados=revisados+vul;

	}

	else
	{
		
		lresultado.setBackground(Color.blue);
		int vul=Integer.parseInt(lvalor.getText());
		norevisados=norevisados+ vul;

		lvalor.setText("0");
	}

	if (e.getSource()==mi1)
	{
		DialogoEstadistica de=new DialogoEstadistica(revisados,norevisados);
		de.setBounds(10,10,300,300);
		de.setVisible(true);
	}
}

	public static void main(String[] ar)

	{
		Formulario f = new Formulario();
		f.setBounds(0, 0, 400, 300);
		f.setVisible(true);
	}
}