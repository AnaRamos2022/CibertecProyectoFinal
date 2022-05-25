package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ventana.ConsultarMaleta;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;

public class MenuPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menuArchivo;
	private JMenu menuMantenimiento;
	private JMenuItem menuConsultar;
	private JMenuItem menuModificarMaleta;
	private JMenuItem menuListarMaleta;
	private JMenuItem menuSalir;
	private JDesktopPane desktopPane;
	public static ConsultarMaleta formConsultar;
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
		menuSalir.addActionListener(this);
		menuArchivo.add(menuSalir);
		
		menuMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(menuMantenimiento);
		
		menuConsultar = new JMenuItem("Consultar Maletas");
		menuConsultar.addActionListener(this);
		menuMantenimiento.add(menuConsultar);
		
		menuModificarMaleta = new JMenuItem("Modificar Maletas");
		menuModificarMaleta.addActionListener(this);
		menuMantenimiento.add(menuModificarMaleta);
		
		menuListarMaleta = new JMenuItem("Listar Maletas");
		menuListarMaleta.addActionListener(this);
		menuMantenimiento.add(menuListarMaleta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
					.addGap(0))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuListarMaleta) {
			actionPerformedMenuListarMaleta(e);
		}
		if (e.getSource() == menuModificarMaleta) {
			actionPerformedMenuModificarMaleta(e);
		}
		if (e.getSource() == menuConsultar) {
			actionPerformedMenuConsultar(e);
		}
		if (e.getSource() == menuSalir) {
			actionPerformedMenuSalir(e);
		}
	}
	protected void actionPerformedMenuSalir(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedMenuConsultar(ActionEvent e) {
		formConsultar = new ConsultarMaleta();
		desktopPane.add(formConsultar);
		formConsultar.show();
		
	}
	protected void actionPerformedMenuModificarMaleta(ActionEvent e) {
	}
	protected void actionPerformedMenuListarMaleta(ActionEvent e) {
	}
}
