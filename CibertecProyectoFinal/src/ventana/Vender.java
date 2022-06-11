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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import menu.MenuPrincipal;
import javax.swing.DefaultComboBoxModel;

public class Vender extends JInternalFrame implements ActionListener {
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
	private JTextArea txtArea;
	
	private int index,cantidad;
	private double imp_Compra=0,imp_Pagar,precio,descuento;
	private String item,tipoObsequio;
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
		setBounds(10, 10, 450, 300);
		
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
		cboVender.setModel(new DefaultComboBoxModel(new String[] {"Aviator", "Century", "Benneton", "Lucas", "Samsonite"}));
		cboVender.addActionListener(this);
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
		btnVender.addActionListener(this);
		btnVender.setBounds(310, 20, 89, 23);
		desktopPane.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(310, 49, 89, 23);
		desktopPane.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 414, 149);
		desktopPane.add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		getContentPane().setLayout(groupLayout);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboVender) {
			actionPerformedCboVender(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		Venta();
		descuento();
		pago();
		imprimir();
	}
	protected void actionPerformedCboVender(ActionEvent e) {
		index=cboVender.getSelectedIndex();
		switch(index){
		case 0:
			txtFieldVender1.setText(MenuPrincipal.precio0+"");
			break;
		case 1:
			txtFieldVender1.setText(MenuPrincipal.precio1+"");
			break;
		case 2:
			txtFieldVender1.setText(MenuPrincipal.precio2+"");
			break;
		case 3:
			txtFieldVender1.setText(MenuPrincipal.precio3+"");
			break;
		case 4:
			txtFieldVender1.setText(MenuPrincipal.precio4+"");
			break;
		}
		
	}
	void Venta() {
		item=(String)cboVender.getSelectedItem();
		cantidad=Integer.parseInt(txtFieldVender2.getText());
		if(index==0) {
			precio=MenuPrincipal.precio0;
			imp_Compra=cantidad*MenuPrincipal.precio0;
		}
		if(index==1) {
			imp_Compra=cantidad*MenuPrincipal.precio1;
			precio=MenuPrincipal.precio1;
		}
		if(index==2) {
			imp_Compra=cantidad*MenuPrincipal.precio2;
			precio=MenuPrincipal.precio2;
		}
		if(index==3) {
			imp_Compra=cantidad*MenuPrincipal.precio3;
			precio=MenuPrincipal.precio3;
		}
		if(index==4) {
			imp_Compra=cantidad*MenuPrincipal.precio4;
			precio=MenuPrincipal.precio4;
		}
	}
	void descuento() {
		if(cantidad>0&&cantidad<=5) {
			descuento=0.075*imp_Compra;
			tipoObsequio="obsequioCantidad1";
		}else if(cantidad>5&&cantidad<=10) {
			descuento=0.02*imp_Compra;
			tipoObsequio="obsequioCantidad2";
		}else if(cantidad>10&&cantidad<=15) {
			descuento=0.03*imp_Compra;
			tipoObsequio="obsequioCantidad3";
		}else {
			descuento=0.04*imp_Compra;
			tipoObsequio="obsequioCantidad4";
			}
		}
	void pago(){
		imp_Pagar=imp_Compra-descuento;
	}
	
	
	void imprimir(){
		txtArea.append("BOLETA DE VENTA\n");
		txtArea.append("Modelo: "+ item+"\n");
		txtArea.append("Precio"+ precio+"\n");
		txtArea.append("Cantidad adquirida: "+cantidad+"\n");
		txtArea.append("Importe compra: "+imp_Compra+"\n");
		txtArea.append("Importe descuento: "+descuento+"\n");
		txtArea.append("Importe pagar: "+imp_Pagar+"\n");
		txtArea.append("Tipo de obsequio: "+tipoObsequio+"\n");
		txtArea.append("Unidades Obsequiadas: "+cantidad*2);
		
	}
}
