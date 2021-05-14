import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
public class VentanaHilo extends JFrame{
	private JFrame f;
	private JMenuBar menuBar;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblD;
	private JMenu mnuArchivo;
	private JMenuItem mnuInicio;
	private JMenuItem mnuSalir;
	
	public void initComponents(){
		f.setLayout(new GridLayout(4,1));
		menuBar = new JMenuBar();
		f.setJMenuBar(menuBar);
		mnuArchivo = new JMenu("Archivo");
		menuBar.add(mnuArchivo);
		mnuInicio = new JMenuItem("Inicio");
		mnuArchivo.add(mnuInicio);
		mnuSalir = new JMenuItem("Salir");
		mnuArchivo.add(mnuSalir);
	}
}