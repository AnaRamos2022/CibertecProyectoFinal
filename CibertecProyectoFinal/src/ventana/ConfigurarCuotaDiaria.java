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

public class ConfigurarCuotaDiaria extends JInternalFrame implements ActionListener {
	private JDesktopPane desktopPane;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblNewLabel;
	private JTextField textCuotaDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCuotaDiaria frame = new ConfigurarCuotaDiaria();
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
	public ConfigurarCuotaDiaria() {
		setClosable(true);
		setTitle("Configurar cuota diaria");
		setBounds(10, 10, 450, 300);
		getContentPane().setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 434, 270);
		getContentPane().add(desktopPane);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(339, 42, 85, 21);
		desktopPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(339, 67, 85, 21);
		desktopPane.add(btnCancelar);
		
		lblNewLabel = new JLabel("Cuota diaria esperada (S/.)");
		lblNewLabel.setBounds(24, 51, 159, 13);
		desktopPane.add(lblNewLabel);
		
		textCuotaDiaria = new JTextField();
		textCuotaDiaria.setText("30000.0");
		textCuotaDiaria.setColumns(10);
		textCuotaDiaria.setBounds(196, 47, 96, 19);
		desktopPane.add(textCuotaDiaria);
		
		//Para que la cuota diaria salga por default
		textCuotaDiaria.setText(Double.toString(MenuPrincipal.cuotadiaria));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	//Para que se grabe el cambio realizado sobre la variable global
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		MenuPrincipal.cuotadiaria=Double.parseDouble(textCuotaDiaria.getText());
		dispose();
	}
}
