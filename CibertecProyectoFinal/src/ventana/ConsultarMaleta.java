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
	private JButton btnNewButton;

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
		setTitle("Consultar Maleta");
		setBounds(10, 10, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(36, 50, 46, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/.)");
		lblNewLabel_1.setBounds(36, 75, 59, 14);
		getContentPane().add(lblNewLabel_1);
		
		cboTipoMaleta1 = new JComboBox<String>();
		cboTipoMaleta1.addActionListener(this);
		cboTipoMaleta1.setModel(new DefaultComboBoxModel<String>(new String[] {"Aviator", "Century", "Benneton", "Lucas", "Samsonite"}));
		cboTipoMaleta1.setBounds(128, 46, 85, 22);
		getContentPane().add(cboTipoMaleta1);
		
		lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(36, 100, 59, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(36, 125, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(36, 161, 59, 14);
		getContentPane().add(lblNewLabel_4);
		
		txtPrecio1 = new JTextField();
		txtPrecio1.setEditable(false);
		txtPrecio1.setBounds(128, 72, 86, 20);
		getContentPane().add(txtPrecio1);
		txtPrecio1.setColumns(10);
		
		txtAncho1 = new JTextField();
		txtAncho1.setEditable(false);
		txtAncho1.setBounds(127, 97, 86, 20);
		getContentPane().add(txtAncho1);
		txtAncho1.setColumns(10);
		
		txtAlto1 = new JTextField();
		txtAlto1.setEditable(false);
		txtAlto1.setBounds(127, 122, 86, 20);
		getContentPane().add(txtAlto1);
		txtAlto1.setColumns(10);
		
		txtFondo1 = new JTextField();
		txtFondo1.setEditable(false);
		txtFondo1.setBounds(128, 155, 86, 20);
		getContentPane().add(txtFondo1);
		txtFondo1.setColumns(10);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.setBounds(262, 46, 89, 23);
		getContentPane().add(btnNewButton);
		
		txtPrecio1.setText(MenuPrincipal.precio0+"");
		txtAncho1.setText(MenuPrincipal.ancho0+"");
		txtAlto1.setText(MenuPrincipal.alto0+"");
		txtFondo1.setText(MenuPrincipal.fondo0+"");

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboTipoMaleta1) {
			actionPerformedCboTipoMaleta1(e);
		}
	}
	protected void actionPerformedCboTipoMaleta1(ActionEvent e) {
		int index=cboTipoMaleta1.getSelectedIndex();
			if(index==0) {
				txtPrecio1.setText(MenuPrincipal.precio0+"");
				txtAncho1.setText(MenuPrincipal.ancho0+"");
				txtAlto1.setText(MenuPrincipal.alto0+"");
				txtFondo1.setText(MenuPrincipal.fondo0+"");
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
	}
}