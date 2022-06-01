package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import menu.MenuPrincipal;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarCuotaDiaria extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField textCuotaDiaria;
	private JButton btnAceptar;
	private JButton btnNewButton;

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
		
		lblNewLabel = new JLabel("Cuota diaria esperada (S/.)");
		lblNewLabel.setBounds(30, 38, 159, 13);
		getContentPane().add(lblNewLabel);
		
		textCuotaDiaria = new JTextField();
		textCuotaDiaria.setText("30000.0");
		textCuotaDiaria.setColumns(10);
		textCuotaDiaria.setBounds(199, 35, 96, 19);
		getContentPane().add(textCuotaDiaria);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(324, 38, 85, 21);
		getContentPane().add(btnAceptar);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(324, 62, 85, 21);
		getContentPane().add(btnNewButton);

		//Para que la cuota diaria salga por default
		textCuotaDiaria.setText(Double.toString(MenuPrincipal.cuotadiaria));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	
	//Para que se graben el cambio realizado sobre la variable global
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		MenuPrincipal.cuotadiaria=Double.parseDouble(textCuotaDiaria.getText());
		dispose();
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
	}
}
