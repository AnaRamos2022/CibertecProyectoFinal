package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import menu.MenuPrincipal;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textObsequio;
	private JTextField textCantObsequio1;
	private JTextField textCantObsequio2;
	private JTextField textCantObsequio3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequios frame = new ConfigurarObsequios();
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
	public ConfigurarObsequios() {
		setClosable(true);
		setTitle("Configurar obsequios");
		setBounds(10, 10, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Tipo de obsequio");
		lblNewLabel.setBounds(30, 34, 104, 13);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("1 a 5 unidades");
		lblNewLabel_1.setBounds(30, 57, 104, 13);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("6 a 10 unidades");
		lblNewLabel_2.setBounds(30, 80, 104, 13);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("11 a m\u00E1s unidades");
		lblNewLabel_3.setBounds(30, 103, 104, 13);
		getContentPane().add(lblNewLabel_3);
		
		textObsequio = new JTextField();
		textObsequio.setText("Lapicero");
		textObsequio.setColumns(10);
		textObsequio.setBounds(154, 31, 96, 19);
		getContentPane().add(textObsequio);
		
		textCantObsequio1 = new JTextField();
		textCantObsequio1.setText("2");
		textCantObsequio1.setColumns(10);
		textCantObsequio1.setBounds(154, 54, 96, 19);
		getContentPane().add(textCantObsequio1);
		
		textCantObsequio2 = new JTextField();
		textCantObsequio2.setText("3");
		textCantObsequio2.setColumns(10);
		textCantObsequio2.setBounds(154, 77, 96, 19);
		getContentPane().add(textCantObsequio2);
		
		textCantObsequio3 = new JTextField();
		textCantObsequio3.setText("4");
		textCantObsequio3.setColumns(10);
		textCantObsequio3.setBounds(154, 100, 96, 19);
		getContentPane().add(textCantObsequio3);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(305, 30, 85, 21);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(305, 57, 85, 21);
		getContentPane().add(btnCancelar);

		//Llamar al método void con parámetros
				obsequiosDefault(MenuPrincipal.tipoObsequio, MenuPrincipal.obsequioCantidad1, MenuPrincipal.obsequioCantidad2, MenuPrincipal.obsequioCantidad3);
	}

	//Para que los valores de los porcentajes salgan por default con método void con parámetros
		void obsequiosDefault (String obsequio, int cantObsequio1, int cantObsequio2, int cantObsequio3) {
			textObsequio.setText(obsequio);
			textCantObsequio1.setText(Integer.toString(cantObsequio1));
			textCantObsequio2.setText(Integer.toString(cantObsequio2));
			textCantObsequio3.setText(Integer.toString(cantObsequio3));
		}
		
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	//Para que se graben los cambios realizados sobre las variables globales.
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		MenuPrincipal.tipoObsequio=textObsequio.getText();
		MenuPrincipal.obsequioCantidad1=Integer.parseInt(textCantObsequio1.getText());
		MenuPrincipal.obsequioCantidad2=Integer.parseInt(textCantObsequio2.getText());
		MenuPrincipal.obsequioCantidad3=Integer.parseInt(textCantObsequio3.getText());
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
