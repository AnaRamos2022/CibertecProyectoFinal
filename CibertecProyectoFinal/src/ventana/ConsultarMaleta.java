package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import menu.MenuPrincipal;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class ConsultarMaleta extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox<String> cboTipoMaleta1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtPrecio1;
	private JTextField txtAncho1;
	private JTextField txtAlto1;
	private JTextField txtFondo1;
	private JButton btnCerrar;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarMaleta frame = new ConsultarMaleta();
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
	public ConsultarMaleta() {
		setClosable(true);
		setTitle("Consultar Maleta");
		setBounds(10, 10, 450, 300);
		getContentPane().setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 434, 270);
		getContentPane().add(desktopPane);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(36, 50, 97, 14);
		desktopPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/.)");
		lblNewLabel_1.setBounds(36, 75, 97, 14);
		desktopPane.add(lblNewLabel_1);
		
		cboTipoMaleta1 = new JComboBox<String>();
		cboTipoMaleta1.addActionListener(this);
		cboTipoMaleta1.setModel(new DefaultComboBoxModel<String>(new String[] {"Aviator", "Century", "Benneton", "Lucas", "Samsonite"}));
		cboTipoMaleta1.setBounds(143, 46, 85, 22);
		desktopPane.add(cboTipoMaleta1);
		
		lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(36, 100, 97, 14);
		desktopPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(36, 124, 97, 14);
		desktopPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(36, 153, 97, 14);
		desktopPane.add(lblNewLabel_4);
		
		txtPrecio1 = new JTextField();
		txtPrecio1.setEditable(false);
		txtPrecio1.setBounds(143, 73, 86, 20);
		desktopPane.add(txtPrecio1);
		txtPrecio1.setColumns(10);
		
		txtAncho1 = new JTextField();
		txtAncho1.setEditable(false);
		txtAncho1.setBounds(143, 98, 86, 20);
		desktopPane.add(txtAncho1);
		txtAncho1.setColumns(10);
		
		txtAlto1 = new JTextField();
		txtAlto1.setEditable(false);
		txtAlto1.setBounds(142, 122, 86, 20);
		desktopPane.add(txtAlto1);
		txtAlto1.setColumns(10);
		
		txtFondo1 = new JTextField();
		txtFondo1.setEditable(false);
		txtFondo1.setBounds(143, 151, 86, 20);
		desktopPane.add(txtFondo1);
		txtFondo1.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(262, 46, 89, 23);
		desktopPane.add(btnCerrar);
		
		txtPrecio1.setText(MenuPrincipal.precio0+"");
		txtAncho1.setText(MenuPrincipal.ancho0+"");
		txtAlto1.setText(MenuPrincipal.alto0+"");
		txtFondo1.setText(MenuPrincipal.fondo0+"");

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboTipoMaleta1) {
			actionPerformedCboTipoMaleta1(e);
		}
	}
	protected void actionPerformedCboTipoMaleta1(ActionEvent e) {
		//Lectura del index del comboBox:
		int index=cboTipoMaleta1.getSelectedIndex();
		
		//Proceso para impresión de los valores en los textfield según la selección en el comboBox:
			if(index==0) {
				txtPrecio1.setText(MenuPrincipal.precio0+"");
				txtAncho1.setText(MenuPrincipal.ancho0+"");
				txtAlto1.setText(MenuPrincipal.alto0+"");
				txtFondo1.setText(MenuPrincipal.fondo0+"");
				
				//Los valores que se imprimirán en los field son valores Double (de las Variables globales), 
				//por lo tanto se requiere convertirlos a un String para que puedan imprimirse. 
				//También se puede realizar de la sgte manera:
				//textPrecio.setText(Double.toString(VariablesGlobales.precio0));
				
			}
			if(index==1) {
				txtPrecio1.setText(MenuPrincipal.precio1+"");
				txtAncho1.setText(MenuPrincipal.ancho1+"");
				txtAlto1.setText(MenuPrincipal.alto1+"");
				txtFondo1.setText(MenuPrincipal.fondo1+"");
			}
			if(index==2) {
				txtPrecio1.setText(MenuPrincipal.precio2+"");
				txtAncho1.setText(MenuPrincipal.ancho2+"");
				txtAlto1.setText(MenuPrincipal.alto2+"");
				txtFondo1.setText(MenuPrincipal.fondo2+"");
			}
			if(index==3) {
				txtPrecio1.setText(MenuPrincipal.precio3+"");
				txtAncho1.setText(MenuPrincipal.ancho3+"");
				txtAlto1.setText(MenuPrincipal.alto3+"");
				txtFondo1.setText(MenuPrincipal.fondo3+"");
			}
			if(index==4) {
				txtPrecio1.setText(MenuPrincipal.precio4+"");
				txtAncho1.setText(MenuPrincipal.ancho4+"");
				txtAlto1.setText(MenuPrincipal.alto4+"");
				txtFondo1.setText(MenuPrincipal.fondo4+"");
			}
			
			//También puede realizarse mediante Switch Case utilizando método void con parámetros:
			//switch (index) {	
			//case (0):
				//consultarComboBox(MenuPrincipal.precio0, MenuPrincipal.ancho0, MenuPrincipal.alto0, MenuPrincipal.fondo0);
			//break;
			//case (1):
				//consultarComboBox(MenuPrincipal.precio1, MenuPrincipal.ancho1, MenuPrincipal.alto1, MenuPrincipal.fondo1);
			//break;
			//case (2):
				//consultarComboBox(MenuPrincipal.precio2, MenuPrincipal.ancho2, MenuPrincipal.alto2, MenuPrincipal.fondo2);
			//break;
			//case (3):
				//consultarComboBox(MenuPrincipal.precio3, MenuPrincipal.ancho3, MenuPrincipal.alto3, MenuPrincipal.fondo3);
			//break;
			//case (4):
				//consultarComboBox(MenuPrincipal.precio4, MenuPrincipal.ancho4, MenuPrincipal.alto4, MenuPrincipal.fondo4);
			//break;
			
			//El método void es el siguiente:
			//void consultarComboBox (double precio, double ancho, double alto, double fondo) {
				//textPrecio.setText(Double.toString(precio));
				//textAncho.setText(Double.toString(ancho));
				//textAlto.setText(Double.toString(alto));
				//textFondo.setText(Double.toString(fondo));
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}