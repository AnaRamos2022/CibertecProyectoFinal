package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GenerarReportes extends JInternalFrame {
	private JDesktopPane desktopPane;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReportes frame = new GenerarReportes();
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
	public GenerarReportes() {
		setTitle("Generar reportes");
		setBounds(10, 10, 649, 321);
		
		desktopPane = new JDesktopPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
					.addGap(1))
		);
		
		lblNewLabel = new JLabel("Tipo de reporte");
		lblNewLabel.setBounds(10, 21, 90, 14);
		desktopPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Razón de precios en relación al precio mayor", "Estadística sobre la cantidad óptima", "Estadística sobre el precio"}));
		comboBox.setBounds(110, 17, 284, 22);
		desktopPane.add(comboBox);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.setBounds(524, 17, 89, 23);
		desktopPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 603, 233);
		desktopPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(groupLayout);

	}

}
