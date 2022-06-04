package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Vender extends JInternalFrame {
	private JDesktopPane desktopPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox cboVender;
	private JTextField txtFieldVender1;
	private JTextField txtFieldVender2;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		
		desktopPane = new JDesktopPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
					.addGap(1))
		);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 24, 46, 14);
		desktopPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/.)");
		lblNewLabel_1.setBounds(10, 49, 62, 14);
		desktopPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setBounds(10, 84, 46, 14);
		desktopPane.add(lblNewLabel_2);
		
		cboVender = new JComboBox();
		cboVender.setBounds(84, 20, 182, 22);
		desktopPane.add(cboVender);
		
		txtFieldVender1 = new JTextField();
		txtFieldVender1.setEditable(false);
		txtFieldVender1.setBounds(82, 46, 184, 20);
		desktopPane.add(txtFieldVender1);
		txtFieldVender1.setColumns(10);
		
		txtFieldVender2 = new JTextField();
		txtFieldVender2.setBounds(84, 81, 182, 20);
		desktopPane.add(txtFieldVender2);
		txtFieldVender2.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(310, 20, 89, 23);
		desktopPane.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(310, 49, 89, 23);
		desktopPane.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 414, 149);
		desktopPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(groupLayout);

	}
}
