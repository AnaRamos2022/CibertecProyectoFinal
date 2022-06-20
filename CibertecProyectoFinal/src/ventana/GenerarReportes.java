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

import menu.MenuPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GenerarReportes extends JInternalFrame implements ActionListener {
	private JDesktopPane desktopPane;
	private JLabel lblNewLabel;
	private JComboBox cboTipoReporte;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	//Declaración de variables
	int index;
	double mayor,menor=0,promedio=0;
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
		
		cboTipoReporte = new JComboBox();
		cboTipoReporte.addActionListener(this);
		cboTipoReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Raz\u00F3n de precios en relaci\u00F3n al precio mayor", "Estad\u00EDstica sobre la cantidad \u00F3ptima", "Estad\u00EDstica sobre el precio"}));
		cboTipoReporte.setBounds(110, 17, 284, 22);
		desktopPane.add(cboTipoReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(524, 17, 89, 23);
		desktopPane.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 603, 233);
		desktopPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(groupLayout);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboTipoReporte) {
			actionPerformedCboTipoReporte(e);
		}
	}
	protected void actionPerformedCboTipoReporte(ActionEvent e) {
		//Lectura del comboBox
		index=cboTipoReporte.getSelectedIndex();
		
		//Cálculo del precio mayor, menor y promedio
		promedio=(MenuPrincipal.precio0+MenuPrincipal.precio1+MenuPrincipal.precio2+MenuPrincipal.precio3+MenuPrincipal.precio4)/4;
		mayor=MenuPrincipal.precio0;
		
		if (MenuPrincipal.precio1>mayor) {
			mayor=MenuPrincipal.precio1;
		} else {
			menor=MenuPrincipal.precio1;
		}
		if (MenuPrincipal.precio2>mayor){
			mayor=MenuPrincipal.precio2;
		} else {
			menor=MenuPrincipal.precio2;
		}
		if (MenuPrincipal.precio3>mayor){
			mayor=MenuPrincipal.precio3;
		} else {
			menor=MenuPrincipal.precio3;
		}
		if (MenuPrincipal.precio4>mayor){
			mayor=MenuPrincipal.precio4;
		} else {
			menor=MenuPrincipal.precio4;
		}
		//Cantidad de modelos que superaron la cantidad óptima
		if (MenuPrincipal.cantidadvendida0>MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadSuperada=MenuPrincipal.cantidadSuperada+1;
		}
		if (MenuPrincipal.cantidadvendida1>MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadSuperada=MenuPrincipal.cantidadSuperada+1;
		}
		if (MenuPrincipal.cantidadvendida2>MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadSuperada=MenuPrincipal.cantidadSuperada+1;
		}
		if (MenuPrincipal.cantidadvendida3>MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadSuperada=MenuPrincipal.cantidadSuperada+1;
		}
		if (MenuPrincipal.cantidadvendida4>MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadSuperada=MenuPrincipal.cantidadSuperada+1;
		}
			
				
		//Cantidad de modelos que no superaron la cantidad óptima
		if (MenuPrincipal.cantidadvendida0<MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadNoSuperada=MenuPrincipal.cantidadNoSuperada+1;
		}
		if (MenuPrincipal.cantidadvendida1<MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadNoSuperada=MenuPrincipal.cantidadNoSuperada+1;
		}
		if (MenuPrincipal.cantidadvendida2<MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadNoSuperada=MenuPrincipal.cantidadNoSuperada+1;
		}
		if (MenuPrincipal.cantidadvendida3<MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadNoSuperada=MenuPrincipal.cantidadNoSuperada+1;
		}
		if (MenuPrincipal.cantidadvendida4<MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadNoSuperada=MenuPrincipal.cantidadNoSuperada+1;
		}
				
		//Cantidad de modelos que igualaron la cantidad óptima
		if (MenuPrincipal.cantidadvendida0==MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadIgualada=MenuPrincipal.cantidadIgualada+1;
		}
		if (MenuPrincipal.cantidadvendida1==MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadIgualada=MenuPrincipal.cantidadIgualada+1;
		}
		if (MenuPrincipal.cantidadvendida2==MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadIgualada=MenuPrincipal.cantidadIgualada+1;
		}
		if (MenuPrincipal.cantidadvendida3==MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadIgualada=MenuPrincipal.cantidadIgualada+1;
		}
		if (MenuPrincipal.cantidadvendida4==MenuPrincipal.cantidadoptima) {
			MenuPrincipal.cantidadIgualada=MenuPrincipal.cantidadIgualada+1;
		}		
		
		//Impresión de reportes según selección en el comboBox
		switch (index) {
		case 0:
			textArea.setText("VENTAS POR MODELO"+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Aviator"+"\n");
			textArea.append("Cantidad de ventas	: "+MenuPrincipal.contadorVentas0+"\n");
			textArea.append("Cantidad unidades vendidas	: "+MenuPrincipal.cantidadvendida0+"\n");
			textArea.append("Importe total vendido	: S/. "+ Math.round((MenuPrincipal.cantidadvendida0*MenuPrincipal.precio0)*100.0)/100.0+"\n");
			textArea.append("Aporte a la cuota diaria	: " + Math.round((((MenuPrincipal.cantidadvendida0*MenuPrincipal.precio0)/MenuPrincipal.cuotadiaria)*100)*100.0)/100.0+"%"+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Century"+"\n");
			textArea.append("Cantidad de ventas	: "+MenuPrincipal.contadorVentas1+"\n");
			textArea.append("Cantidad unidades vendidas	: "+MenuPrincipal.cantidadvendida1+"\n");
			textArea.append("Importe total vendido	: S/. "+ Math.round((MenuPrincipal.cantidadvendida1*MenuPrincipal.precio1)*100.0)/100.0+"\n");
			textArea.append("Aporte a la cuota diaria	: " + Math.round((((MenuPrincipal.cantidadvendida1*MenuPrincipal.precio1)/MenuPrincipal.cuotadiaria)*100)*100.0)/100.0+"%"+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Benneton"+"\n");
			textArea.append("Cantidad de ventas	: "+MenuPrincipal.contadorVentas2+"\n");
			textArea.append("Cantidad unidades vendidas	: "+MenuPrincipal.cantidadvendida2+"\n");
			textArea.append("Importe total vendido	: S/. "+ Math.round((MenuPrincipal.cantidadvendida2*MenuPrincipal.precio2)*100.0)/100.0+"\n");
			textArea.append("Aporte a la cuota diaria	: " + Math.round((((MenuPrincipal.cantidadvendida2*MenuPrincipal.precio2)/MenuPrincipal.cuotadiaria)*100)*100.0)/100.0+"%"+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Lucas"+"\n");
			textArea.append("Cantidad de ventas	: "+MenuPrincipal.contadorVentas3+"\n");
			textArea.append("Cantidad unidades vendidas	: "+MenuPrincipal.cantidadvendida3+"\n");
			textArea.append("Importe total vendido	: S/. "+ Math.round((MenuPrincipal.cantidadvendida3*MenuPrincipal.precio3)*100.0)/100.0+"\n");
			textArea.append("Aporte a la cuota diaria	: " + Math.round((((MenuPrincipal.cantidadvendida3*MenuPrincipal.precio3)/MenuPrincipal.cuotadiaria)*100)*100.0)/100.0+"%"+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Samsonnite"+"\n");
			textArea.append("Cantidad de ventas	: "+MenuPrincipal.contadorVentas4+"\n");
			textArea.append("Cantidad unidades vendidas	: "+MenuPrincipal.cantidadvendida4+"\n");
			textArea.append("Importe total vendido	: S/. "+ Math.round((MenuPrincipal.cantidadvendida4*MenuPrincipal.precio4)*100.0)/100.0+"\n");
			textArea.append("Aporte a la cuota diaria	: " + Math.round((((MenuPrincipal.cantidadvendida4*MenuPrincipal.precio4)/MenuPrincipal.cuotadiaria)*100)*100.0)/100.0+"%"+"\n");
			break;
		case 1:
			textArea.setText("RAZÓN DE PRECIOS EN RELACIÓN AL PRECIO MAYOR"+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Aviator"+"\n");
			textArea.append("Precio		: "+MenuPrincipal.precio0+"\n");
			textArea.append("Razón		: "+Math.round((MenuPrincipal.precio0/mayor)*100.0)/100.0+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Century"+"\n");
			textArea.append("Precio		: "+MenuPrincipal.precio1+"\n");
			textArea.append("Razón		: "+Math.round((MenuPrincipal.precio1/mayor)*100.0)/100.0+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Benneton"+"\n");
			textArea.append("Precio		: "+MenuPrincipal.precio2+"\n");
			textArea.append("Razón		: "+Math.round((MenuPrincipal.precio2/mayor)*100.0)/100.0+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Lucas"+"\n");
			textArea.append("Precio		: "+MenuPrincipal.precio3+"\n");
			textArea.append("Razón		: "+Math.round((MenuPrincipal.precio3/mayor)*100.0)/100.0+"\n");
			textArea.append(""+"\n");
			textArea.append("Modelo		: Samsonnite"+"\n");
			textArea.append("Precio		: "+MenuPrincipal.precio4+"\n");
			textArea.append("Razón		: "+Math.round((MenuPrincipal.precio4/mayor)*100.0)/100.0+"\n");
			break;
		case 2:
			textArea.setText("ESTADÍSTICA SOBRE LA CANTIDAD ÓPTIMA"+"\n");
			textArea.append(""+"\n");
			textArea.append("Cantidad de modelos que superaron la cantidad óptima	:"+MenuPrincipal.cantidadSuperada+"\n");
			textArea.append("Cantidad de modelos que no superaron la cantidad óptima	:"+MenuPrincipal.cantidadNoSuperada+"\n");
			textArea.append("Cantidad de modelos que igualaron la cantidad óptima	:"+MenuPrincipal.cantidadIgualada+"\n");
			break;
		case 3:
			textArea.setText("ESTADÍSTICA SOBRE EL PRECIO"+"\n");
		textArea.append(""+"\n");
		textArea.append("Precio promedio	: S/."+promedio+"\n");
		textArea.append("Precio mayor		: S/."+mayor+"\n");
		textArea.append("Precio menor		: S/."+menor+"\n");
			break;
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
