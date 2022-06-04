package menu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ventana.AcercadeTienda;
import ventana.ConfigurarCantidadOptima;
import ventana.ConfigurarCuotaDiaria;
import ventana.ConfigurarDescuentos;
import ventana.ConfigurarObsequios;
import ventana.ConsultarMaleta;
import ventana.ListarMaleta;
import ventana.ModificarMaleta;

public class MenuPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menuArchivo;
	private JMenu menuMantenimiento;
	private JMenu menuVentas;
	private JMenu menuConfiguracion;
	private JMenu menuAyuda;
	private JMenuItem menuConsultar;
	private JMenuItem menuModificarMaleta;
	private JMenuItem menuListarMaleta;
	private JMenuItem menuSalir;
	private JMenuItem menuConfigurarDescuentos;
	private JMenuItem menuConfigurarObsequios;
	private JMenuItem menuConfigurarCantidadOptima;
	private JMenuItem menuConfigurarCuotaDiaria;
	private JMenuItem menuAcercadeTienda;
	private JDesktopPane desktopPane;
	public static ConsultarMaleta formConsultar;
	public static ModificarMaleta formModificar;
	public static ListarMaleta formListar;
	public static ConfigurarDescuentos formConfigurarDescuentos;
	public static ConfigurarObsequios formConfigurarObsequios;
	public static ConfigurarCantidadOptima formConfigurarCantidadOptima;
	public static ConfigurarCuotaDiaria formConfigurarCuotaDiaria;
	public static AcercadeTienda formAcercadeTienda;
	
	// Datos mínimos de la primera maleta
	public static String modelo0 = "Aviator";
	public static double precio0 = 124.9;
	public static double ancho0 = 63.5;
	public static double alto0 = 30.9;
	public static double fondo0 = 29.2;
	// Datos mínimos del segundo maleta
	public static String modelo1 = "Century";
	public static double precio1 = 174.9;
	public static double ancho1 = 75.0;
	public static double alto1 = 28.5;
	public static double fondo1 = 30.0;
	// Datos mínimos del tercer maleta
	public static String modelo2 = "Benneton";
	public static double precio2 = 159.9;
	public static double ancho2 = 65.2;
	public static double alto2 = 31.2;
	public static double fondo2 = 29.4;
	// Datos mínimos del cuarto maleta
	public static String modelo3 = "Lucas";
	public static double precio3 = 99.9;
	public static double ancho3 = 45.0;
	public static double alto3 = 70.0;
	public static double fondo3 = 25.0;
	// Datos mínimos del quinto maleta
	public static String modelo4 = "Samsonite";
	public static double precio4 = 84.9;
	public static double ancho4 = 50.2;
	public static double alto4 = 60.4;
	public static double fondo4 = 25.0;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	public static String obsequio1 = "USB";
	public static String obsequio2 = "Cuaderno";
	public static String obsequio3 = "Lapicero";
	// Cuota diaria
	public static double cuotadiaria = 30000;
	// Cantidad �ptima
	public static int cantidadoptima = 10;
	private JMenuItem MenuVender;
	private JMenuItem MenuReporteVentas;
	

	
	

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
		setBounds(100, 100, 506, 428);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuArchivo = new JMenu("Archivo");
		menuBar.add(menuArchivo);

		menuSalir = new JMenuItem("Salir");
		menuSalir.addActionListener(this);
		menuArchivo.add(menuSalir);

		menuMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(menuMantenimiento);

		menuConsultar = new JMenuItem("Consultar maleta");
		menuConsultar.addActionListener(this);
		menuMantenimiento.add(menuConsultar);

		menuModificarMaleta = new JMenuItem("Modificar maleta");
		menuModificarMaleta.addActionListener(this);
		menuMantenimiento.add(menuModificarMaleta);

		menuListarMaleta = new JMenuItem("Listar maleta");
		menuListarMaleta.addActionListener(this);
		menuMantenimiento.add(menuListarMaleta);
		
		menuVentas = new JMenu("Ventas");
		menuVentas.setHorizontalAlignment(SwingConstants.TRAILING);
		menuBar.add(menuVentas);
		
		MenuVender = new JMenuItem("Vender");
		menuVentas.add(MenuVender);
		
		MenuReporteVentas = new JMenuItem("Generar Reportes");
		menuVentas.add(MenuReporteVentas);
		
		menuConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(menuConfiguracion);
		
		menuConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		menuConfigurarDescuentos.addActionListener(this);
		menuConfiguracion.add(menuConfigurarDescuentos);
		
		menuConfigurarObsequios = new JMenuItem("Configurar obsequios");
		menuConfigurarObsequios.addActionListener(this);
		menuConfiguracion.add(menuConfigurarObsequios);
		
		menuConfigurarCantidadOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		menuConfigurarCantidadOptima.addActionListener(this);
		menuConfiguracion.add(menuConfigurarCantidadOptima);
		
		menuConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		menuConfigurarCuotaDiaria.addActionListener(this);
		menuConfiguracion.add(menuConfigurarCuotaDiaria);
		
		menuAyuda = new JMenu("Ayuda");
		menuBar.add(menuAyuda);
		
		menuAcercadeTienda = new JMenuItem("Acerca de Tienda");
		menuAcercadeTienda.addActionListener(this);
		menuAyuda.add(menuAcercadeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		desktopPane = new JDesktopPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE).addGap(0)));
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE).addGap(0)));
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuAcercadeTienda) {
			actionPerformedMenuAcercadeTienda(e);
		}
		if (e.getSource() == menuConfigurarCuotaDiaria) {
			actionPerformedMenuConfigurarCuotaDiaria(e);
		}
		if (e.getSource() == menuConfigurarCantidadOptima) {
			actionPerformedMenuConfigurarCantidadOptima(e);
		}
		if (e.getSource() == menuConfigurarObsequios) {
			actionPerformedMenuConfigurarObsequios(e);
		}
		if (e.getSource() == menuConfigurarDescuentos) {
			actionPerformedMenuConfigurarDescuentos(e);
		}
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
		if (formConsultar == null || formConsultar.isClosed()) {
			formConsultar = new ConsultarMaleta();
			desktopPane.add(formConsultar);
			formConsultar.show();
		}

	}

	protected void actionPerformedMenuModificarMaleta(ActionEvent e) {
		if (formModificar == null || formModificar.isClosed()) {
			formModificar = new ModificarMaleta();
			desktopPane.add(formModificar);
			formModificar.show();
		}
	}

	protected void actionPerformedMenuListarMaleta(ActionEvent e) {
		if (formListar == null || formListar.isClosed()) {
			formListar = new ListarMaleta();
			desktopPane.add(formListar);
			formListar.show();
		}
	}
	protected void actionPerformedMenuConfigurarDescuentos(ActionEvent e) {
		if (formConfigurarDescuentos == null || formConfigurarDescuentos.isClosed()) {
			formConfigurarDescuentos = new ConfigurarDescuentos();
			desktopPane.add(formConfigurarDescuentos);
			formConfigurarDescuentos.show();
		}
	}
	protected void actionPerformedMenuConfigurarObsequios(ActionEvent e) {
		if (formConfigurarObsequios == null || formConfigurarObsequios.isClosed()) {
			formConfigurarObsequios = new ConfigurarObsequios();
			desktopPane.add(formConfigurarObsequios);
			formConfigurarObsequios.show();
		}
	}
	protected void actionPerformedMenuConfigurarCantidadOptima(ActionEvent e) {
		if (formConfigurarCantidadOptima == null || formConfigurarCantidadOptima.isClosed()) {
			formConfigurarCantidadOptima  = new ConfigurarCantidadOptima();
			desktopPane.add(formConfigurarCantidadOptima);
			formConfigurarCantidadOptima .show();
		}
	}
	protected void actionPerformedMenuConfigurarCuotaDiaria(ActionEvent e) {
		if (formConfigurarCuotaDiaria == null || formConfigurarCuotaDiaria.isClosed()) {
			formConfigurarCuotaDiaria  = new ConfigurarCuotaDiaria();
			desktopPane.add(formConfigurarCuotaDiaria);
			formConfigurarCuotaDiaria.show();
		}
	}
	
	protected void actionPerformedMenuAcercadeTienda(ActionEvent e) {
		if (formAcercadeTienda == null || formAcercadeTienda.isClosed()) {
			formAcercadeTienda   = new AcercadeTienda();
			desktopPane.add(formAcercadeTienda );
			formAcercadeTienda .show();
		}
	}
	
	//Tambi�n se puede usar el siguiente m�todo para mostrar un solo formulario a la vez:
	/*protected void actionPerformedmntmAcercaDeLaTienda(ActionEvent e) {
		if (frmConfigurarCuotaDiaria == null || !frmConfigurarCuotaDiaria .isShowing()) {
			frmConfigurarCuotaDiaria  = new ConfigurarCuotaDiaria();
			frmConfigurarCuotaDiaria .setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			frmConfigurarCuotaDiaria .setVisible(true);
			} */
	
}