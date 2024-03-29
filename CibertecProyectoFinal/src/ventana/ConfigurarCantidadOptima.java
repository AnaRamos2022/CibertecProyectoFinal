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

public class ConfigurarCantidadOptima extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField textCantidadOptima;
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
					ConfigurarCantidadOptima frame = new ConfigurarCantidadOptima();
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
	public ConfigurarCantidadOptima() {
		setTitle("Configurar cantidad \u00F3ptima");
		setClosable(true);
		setBounds(10, 10, 450, 300);
		getContentPane().setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 434, 270);
		getContentPane().add(desktopPane);
		
		lblNewLabel = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblNewLabel.setBounds(26, 43, 231, 13);
		desktopPane.add(lblNewLabel);
		
		textCantidadOptima = new JTextField();
		textCantidadOptima.setText("10");
		textCantidadOptima.setColumns(10);
		textCantidadOptima.setBounds(256, 40, 51, 19);
		desktopPane .add(textCantidadOptima);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(332, 39, 85, 21);
		desktopPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(332, 64, 85, 21);
		desktopPane.add(btnCancelar);	
		
		desktopPane.setBounds(0, 0, 434, 270);
		getContentPane().add(desktopPane);
		
		//Para que la cantidad �ptima salga por default
		textCantidadOptima.setText(Integer.toString(MenuPrincipal.cantidadoptima));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	
	//Para que se graben el cambio realizado sobre la variable global
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		MenuPrincipal.cantidadoptima=Integer.parseInt(textCantidadOptima.getText());
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
