package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercadeTienda extends JInternalFrame implements ActionListener {
	private JDesktopPane desktopPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercadeTienda frame = new AcercadeTienda();
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
	public AcercadeTienda() {
		setTitle("Acerca de la Tienda");
		setClosable(true);
		setBounds(10, 10, 450, 300);
		getContentPane().setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 434, 270);
		getContentPane().add(desktopPane);
		
		lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(167, 24, 117, 24);
		desktopPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Autores");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(186, 88, 70, 35);
		desktopPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("- Anghelo Chang Mori");
		lblNewLabel_2.setBounds(167, 134, 133, 14);
		desktopPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("- Ana C. Ramos Neira");
		lblNewLabel_3.setBounds(167, 154, 133, 14);
		desktopPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("- Thalo R. Torres Z\u00E1rate");
		lblNewLabel_4.setBounds(167, 174, 133, 14);
		desktopPane.add(lblNewLabel_4);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(167, 209, 105, 23);
		desktopPane.add(btnNewButton);
		
		separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 56, 416, 2);
		desktopPane.add(separator);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
	}
}
