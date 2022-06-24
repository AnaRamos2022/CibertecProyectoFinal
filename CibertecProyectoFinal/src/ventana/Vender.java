package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JDesktopPane desktopPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox<String> cboTipoMaleta;
	private JTextField textPrecio;
	private JTextField textCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	//Creación de variables globales:
	private int index,cantidad, unidadesObseq;
	private double impCompra=0,impPago,impDescuento, precio;
	private String mensaje;
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
		lblNewLabel.setBounds(10, 24, 74, 14);
		desktopPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/.)");
		lblNewLabel_1.setBounds(10, 49, 74, 14);
		desktopPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setBounds(10, 74, 74, 14);
		desktopPane.add(lblNewLabel_2);
		
		cboTipoMaleta = new JComboBox<String>();
		cboTipoMaleta.setModel(new DefaultComboBoxModel(new String[] {"Aviator", "Century", "Benneton", "Lucas", "Samsonite"}));
		cboTipoMaleta.addActionListener(this);
		cboTipoMaleta.setBounds(82, 20, 184, 22);
		desktopPane.add(cboTipoMaleta);
		
		textPrecio = new JTextField();
		textPrecio.setEditable(false);
		textPrecio.setBounds(82, 46, 184, 20);
		desktopPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(82, 71, 184, 20);
		desktopPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(310, 20, 89, 23);
		desktopPane.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(310, 49, 89, 23);
		desktopPane.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 414, 149);
		desktopPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(groupLayout);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboTipoMaleta) {
			actionPerformedcboTipoMaleta(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		venta();
		importeCompra();
		descuento();
		importePago();
		reporteVentas();
		contadorVentas();
		montoAcumuladoVentas();
		mensajeAlerta ();
		cantidadVentasPorModelo();
	}
	protected void actionPerformedcboTipoMaleta(ActionEvent e) {
		index=cboTipoMaleta.getSelectedIndex();
		switch(index){
		case 0:
			textPrecio.setText(Double.toString(MenuPrincipal.precio0)+"");
			break;
		case 1:
			textPrecio.setText(Double.toString(MenuPrincipal.precio1)+"");
			break;
		case 2:
			textPrecio.setText(Double.toString(MenuPrincipal.precio2)+"");
			break;
		case 3:
			textPrecio.setText(Double.toString(MenuPrincipal.precio3)+"");
			break;
		case 4:
			textPrecio.setText(Double.toString(MenuPrincipal.precio4)+"");
			break;
		}
		
	}
	void venta() {
		cantidad=Integer.parseInt(textCantidad.getText());
		precio=Double.parseDouble(textPrecio.getText());
		index=cboTipoMaleta.getSelectedIndex();
	}
	void importeCompra () {
		impCompra=cantidad*precio;
		impDescuento=0;
		unidadesObseq=0;
	}
	void descuento() {
		if(cantidad>0&&cantidad<=5) {
			impDescuento=MenuPrincipal.porcentaje1/100*impCompra;
			unidadesObseq=MenuPrincipal.obsequioCantidad1;
		}else if(cantidad>5&&cantidad<=10) {
			impDescuento=MenuPrincipal.porcentaje2/100*impCompra;
			unidadesObseq=MenuPrincipal.obsequioCantidad2;
		}else if(cantidad>10&&cantidad<=15) {
			impDescuento=MenuPrincipal.porcentaje3/100*impCompra;
			unidadesObseq=MenuPrincipal.obsequioCantidad3;
		}else {
			impDescuento=MenuPrincipal.porcentaje4/100*impCompra;
			unidadesObseq=MenuPrincipal.obsequioCantidad3;
			}
		}
	void importePago(){
		impPago=impCompra-impDescuento;
	}
	
	void reporteVentas(){
		textArea.append("BOLETA DE VENTA\n");
		textArea.append(""+"\n");
		textArea.append("Modelo		: "+cboTipoMaleta.getSelectedItem()+"\n");
		textArea.append("Precio		: S/. "+Math.round(precio*100.0)/100.0+"\n");
		textArea.append("Cantidad adquirida	: "+cantidad+"\n");
		textArea.append("Importe compra		: S/. "+Math.round(impCompra*100.0)/100.0+"\n");
		textArea.append("Importe descuento	: S/. "+Math.round(impDescuento*100.0)/100.0+"\n");
		textArea.append("Importe pagar		: S/. "+Math.round(impPago*100.0)/100.0+"\n");
		textArea.append("Tipo de obsequio	: "+MenuPrincipal.tipoObsequio+"\n");
		textArea.append("Unidades obsequiadas	: "+unidadesObseq+"\n");
		
	}
	void contadorVentas() {    //Se crea una variable global para contrar las ventas que se van realizando
		MenuPrincipal.contadorVentas=MenuPrincipal.contadorVentas+1;
	}
	void montoAcumuladoVentas() { //Se define una variable global para calcular todos los importes de venta generado
		MenuPrincipal.importeAcumulado=MenuPrincipal.importeAcumulado+impPago;
	}
	void mensajeAlerta () {
		mensaje="Venta Nro."+MenuPrincipal.contadorVentas+"\n Importe total general acumulado: S/. "+Math.round(MenuPrincipal.importeAcumulado*100.0)/100.0+"\n Porcentaje de la cuota diaria : "+Math.round((MenuPrincipal.importeAcumulado/MenuPrincipal.cuotadiaria*100)*100.0)/100.0+"%";
		if (MenuPrincipal.contadorVentas%5==0) {
			JOptionPane.showMessageDialog(desktopPane,mensaje,"Avance de ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	void cantidadVentasPorModelo() {
		switch (index) {
		case (0):
			MenuPrincipal.contadorVentas++;
			MenuPrincipal.cantidadvendida0++;
		break;
		case (1):
			MenuPrincipal.contadorVentas1++;
		MenuPrincipal.cantidadvendida1++;
		break;
		case (2):
			MenuPrincipal.contadorVentas2++;
		MenuPrincipal.cantidadvendida2++;
		break;
		case (3):
			MenuPrincipal.contadorVentas3++;
		MenuPrincipal.cantidadvendida3++;
		break;
		case (4):
			MenuPrincipal.contadorVentas4++;
		MenuPrincipal.cantidadvendida4++;
		break;
		}
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
