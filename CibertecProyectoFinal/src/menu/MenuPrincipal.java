package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menuArchivo;
	private JMenuItem menuSalir;
	private JMenu menuMantenimiento;
	private JMenuItem menuConsultar;
	private JMenuItem menuModificarMaleta;
	private JMenuItem menuListarMaleta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuArchivo = new JMenu("Archivo");
		menuBar.add(menuArchivo);
		
		menuSalir = new JMenuItem("Salir");
		menuArchivo.add(menuSalir);
		
		menuMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(menuMantenimiento);
		
		menuConsultar = new JMenuItem("Consultar Maletas");
		menuMantenimiento.add(menuConsultar);
		
		menuModificarMaleta = new JMenuItem("Modificar Maletas");
		menuMantenimiento.add(menuModificarMaleta);
		
		menuListarMaleta = new JMenuItem("Listar Maletas");
		menuMantenimiento.add(menuListarMaleta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
