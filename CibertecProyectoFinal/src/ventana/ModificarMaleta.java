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

public class ModificarMaleta extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox<String> cboTipoMaleta1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtPrecio2;
	private JTextField txtAncho2;
	private JTextField txtAlto2;
	private JTextField txtFondo2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private int index;
	private JLabel lbl_5;
	private JLabel lbl_6;
	private JLabel lbl_7;
	private JLabel lbl_8;

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
	public ModificarMaleta() {
		setTitle("Modificar Maleta");
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
		
		txtPrecio2 = new JTextField();
		txtPrecio2.setBounds(128, 72, 86, 20);
		getContentPane().add(txtPrecio2);
		txtPrecio2.setColumns(10);
		
		txtAncho2 = new JTextField();
		txtAncho2.setBounds(127, 97, 86, 20);
		getContentPane().add(txtAncho2);
		txtAncho2.setColumns(10);
		
		txtAlto2 = new JTextField();
		txtAlto2.setBounds(127, 122, 86, 20);
		getContentPane().add(txtAlto2);
		txtAlto2.setColumns(10);
		
		txtFondo2 = new JTextField();
		txtFondo2.setBounds(128, 155, 86, 20);
		getContentPane().add(txtFondo2);
		txtFondo2.setColumns(10);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(261, 46, 89, 23);
		getContentPane().add(btnNewButton);
		
		txtPrecio2.setText(MenuPrincipal.precio0+"");
		txtAncho2.setText(MenuPrincipal.ancho0+"");
		txtAlto2.setText(MenuPrincipal.alto0+"");
		txtFondo2.setText(MenuPrincipal.fondo0+"");
		
		btnNewButton_1 = new JButton("Grabar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(261, 96, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		lbl_5 = new JLabel("");
		lbl_5.setBounds(360, 75, 53, 14);
		getContentPane().add(lbl_5);
		
		lbl_6 = new JLabel("");
		lbl_6.setBounds(360, 100, 46, 14);
		getContentPane().add(lbl_6);
		
		lbl_7 = new JLabel("");
		lbl_7.setBounds(360, 125, 46, 14);
		getContentPane().add(lbl_7);
		
		lbl_8 = new JLabel("");
		lbl_8.setBounds(360, 155, 46, 14);
		getContentPane().add(lbl_8);
		
		}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == cboTipoMaleta1) {
			actionPerformedCboTipoMaleta1(e);
		}
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedCboTipoMaleta1(ActionEvent e) {
			index=cboTipoMaleta1.getSelectedIndex();
			if(index==0) {
				txtPrecio2.setText(MenuPrincipal.precio0+"");
				txtAncho2.setText(MenuPrincipal.ancho0+"");
				txtAlto2.setText(MenuPrincipal.alto0+"");
				txtFondo2.setText(MenuPrincipal.fondo0+"");
				
			}
			if(index==1) {
				txtPrecio2.setText(MenuPrincipal.precio1+"");
				txtAncho2.setText(MenuPrincipal.ancho1+"");
				txtAlto2.setText(MenuPrincipal.alto1+"");
				txtFondo2.setText(MenuPrincipal.fondo1+"");
			}
			if(index==2) {
				txtPrecio2.setText(MenuPrincipal.precio2+"");
				txtAncho2.setText(MenuPrincipal.ancho2+"");
				txtAlto2.setText(MenuPrincipal.alto2+"");
				txtFondo2.setText(MenuPrincipal.fondo2+"");
			}
			if(index==3) {
				txtPrecio2.setText(MenuPrincipal.precio3+"");
				txtAncho2.setText(MenuPrincipal.ancho3+"");
				txtAlto2.setText(MenuPrincipal.alto3+"");
				txtFondo2.setText(MenuPrincipal.fondo3+"");
			}
			if(index==4) {
				txtPrecio2.setText(MenuPrincipal.precio4+"");
				txtAncho2.setText(MenuPrincipal.ancho4+"");
				txtAlto2.setText(MenuPrincipal.alto4+"");
				txtFondo2.setText(MenuPrincipal.fondo4+"");
			}
	}
	
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		if (index==0) {
			MenuPrincipal.precio0=Double.parseDouble(txtPrecio2.getText());
			MenuPrincipal.ancho0=Double.parseDouble(txtAncho2.getText());
			MenuPrincipal.alto0=Double.parseDouble(txtAlto2.getText());
			MenuPrincipal.fondo0=Double.parseDouble(txtFondo2.getText());
		
		}
		if (index==1) {
			MenuPrincipal.precio1=Double.parseDouble(txtPrecio2.getText());
			MenuPrincipal.ancho1=Double.parseDouble(txtAncho2.getText());
			MenuPrincipal.alto1=Double.parseDouble(txtAlto2.getText());
			MenuPrincipal.fondo1=Double.parseDouble(txtFondo2.getText());
		}
		if (index==2) {
			MenuPrincipal.precio2=Double.parseDouble(txtPrecio2.getText());
			MenuPrincipal.ancho2=Double.parseDouble(txtAncho2.getText());
			MenuPrincipal.alto2=Double.parseDouble(txtAlto2.getText());
			MenuPrincipal.fondo2=Double.parseDouble(txtFondo2.getText());
		}
		if (index==3) {
			MenuPrincipal.precio3=Double.parseDouble(txtPrecio2.getText());
			MenuPrincipal.ancho3=Double.parseDouble(txtAncho2.getText());
			MenuPrincipal.alto3=Double.parseDouble(txtAlto2.getText());
			MenuPrincipal.fondo3=Double.parseDouble(txtFondo2.getText());
		}
		if (index==4) {
			MenuPrincipal.precio4=Double.parseDouble(txtPrecio2.getText());
			MenuPrincipal.ancho4=Double.parseDouble(txtAncho2.getText());
			MenuPrincipal.alto4=Double.parseDouble(txtAlto2.getText());
			MenuPrincipal.fondo4=Double.parseDouble(txtFondo2.getText());
		}
		
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
	}
}