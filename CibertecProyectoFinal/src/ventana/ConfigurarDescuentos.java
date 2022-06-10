package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import menu.MenuPrincipal;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class ConfigurarDescuentos extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField textPorcentaje1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textPorcentaje2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textPorcentaje3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textPorcentaje4;
	private JLabel lblNewLabel_7;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarDescuentos frame = new ConfigurarDescuentos();
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
	public ConfigurarDescuentos() {
		setClosable(true);
		setTitle("Configurar porcentajes de descuento");
		setBounds(10, 10, 450, 300);
		getContentPane().setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 434, 270);
		getContentPane().add(desktopPane);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setBounds(32, 32, 106, 13);
		desktopPane.add(lblNewLabel);
		
		textPorcentaje1 = new JTextField();
		textPorcentaje1.setText("7.5");
		textPorcentaje1.setColumns(10);
		textPorcentaje1.setBounds(140, 29, 96, 19);
		desktopPane.add(textPorcentaje1);
		
		lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setBounds(246, 32, 45, 13);
		desktopPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("6 a 10 unidades");
		lblNewLabel_2.setBounds(32, 55, 106, 13);
		desktopPane.add(lblNewLabel_2);
		
		textPorcentaje2 = new JTextField();
		textPorcentaje2.setText("10.0");
		textPorcentaje2.setColumns(10);
		textPorcentaje2.setBounds(140, 55, 96, 19);
		desktopPane.add(textPorcentaje2);
		
		lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setBounds(246, 55, 45, 13);
		desktopPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("11 a 15 unidades");
		lblNewLabel_4.setBounds(32, 78, 106, 13);
		desktopPane.add(lblNewLabel_4);
		
		textPorcentaje3 = new JTextField();
		textPorcentaje3.setText("12.5");
		textPorcentaje3.setColumns(10);
		textPorcentaje3.setBounds(140, 78, 96, 19);
		desktopPane.add(textPorcentaje3);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(246, 81, 45, 13);
		desktopPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("M\u00E1s de 15 unidades");
		lblNewLabel_6.setBounds(32, 101, 106, 13);
		desktopPane.add(lblNewLabel_6);
		
		textPorcentaje4 = new JTextField();
		textPorcentaje4.setText("15.0");
		textPorcentaje4.setColumns(10);
		textPorcentaje4.setBounds(140, 101, 96, 19);
		desktopPane.add(textPorcentaje4);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(246, 107, 45, 13);
		desktopPane.add(lblNewLabel_7);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(314, 28, 85, 21);
		desktopPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(314, 51, 85, 21);
		desktopPane.add(btnCancelar);
		
		//Para que los valores de los porcentajes salgan por default
				//textPorcentaje1.setText(Double.toString(VariablesGlobales.porcentaje1));
				//textPorcentaje2.setText(Double.toString(VariablesGlobales.porcentaje2));
				//textPorcentaje3.setText(Double.toString(VariablesGlobales.porcentaje3));
				//textPorcentaje4.setText(Double.toString(VariablesGlobales.porcentaje4));
				
		//Para que los valores de los porcentajes salgan por default con método void con parámetros
		porcentajesDefault(MenuPrincipal.porcentaje1, MenuPrincipal.porcentaje2, MenuPrincipal.porcentaje3, MenuPrincipal.porcentaje4);
	}
	
	void porcentajesDefault (double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4) {
		textPorcentaje1.setText(Double.toString(porcentaje1));
		textPorcentaje2.setText(Double.toString(porcentaje2));
		textPorcentaje3.setText(Double.toString(porcentaje3));
		textPorcentaje4.setText(Double.toString(porcentaje4));
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
		MenuPrincipal.porcentaje1=Double.parseDouble(textPorcentaje1.getText());
		MenuPrincipal.porcentaje2=Double.parseDouble(textPorcentaje2.getText());
		MenuPrincipal.porcentaje3=Double.parseDouble(textPorcentaje3.getText());
		MenuPrincipal.porcentaje4=Double.parseDouble(textPorcentaje4.getText());
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
