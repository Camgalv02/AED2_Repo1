import javax.swing.JFrame;

public class ventana extends JFrame
{

	public static void main(String[] args) {
		
		ventana v =new ventana();
		           // x, y, ancho, alto
		v.setBounds(0,0,1024,800);
		v.setVisible(true);
		v.setResizable(false);

	}

}
