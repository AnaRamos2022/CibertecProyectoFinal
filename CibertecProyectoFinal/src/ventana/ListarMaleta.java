package ventana;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

import menu.MenuPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarMaleta extends JInternalFrame implements ActionListener {
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar3;
	private JButton btnListar3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarMaleta frame = new ListarMaleta();
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
	public ListarMaleta() {
		setClosable(true);
		setTitle("Listado de maletas");
		setBounds(10, 10, 450, 345);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 229);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnCerrar3 = new JButton("Cerrar");
		btnCerrar3.addActionListener(this);
		btnCerrar3.setBounds(129, 251, 89, 23);
		getContentPane().add(btnCerrar3);
		
		btnListar3 = new JButton("Listar");
		btnListar3.addActionListener(this);
		btnListar3.setBounds(228, 251, 89, 23);
		getContentPane().add(btnListar3);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar3) {
			actionPerformedBtnCerrar3(e);
		}
		if (e.getSource() == btnListar3) {
			actionPerformedBtnListar3(e);
		}
	}
	protected void actionPerformedBtnListar3(ActionEvent e) {
		txtS.setText("LISTADO DE MALETAS"+"\n");
		txtS.append(""+ "\n");
		txtS.append("Modelo	:" + MenuPrincipal.modelo0 + "\n");
		txtS.append("Precio	:" + "S/. " + MenuPrincipal.precio0 + "\n");
		txtS.append("Profundidad	:" + MenuPrincipal.fondo0 + " cm" + "\n");
		txtS.append("Ancho	:" + MenuPrincipal.ancho0 + " cm" + "\n");
		txtS.append("Alto	:" + MenuPrincipal.alto0 + " cm" + "\n" + "\n");
		
		txtS.append("Modelo	:" + MenuPrincipal.modelo1 + "\n");
		txtS.append("Precio	:" + "S/. " + MenuPrincipal.precio1 + "\n");
		txtS.append("Profundidad	:" + MenuPrincipal.fondo1 + " cm" + "\n");
		txtS.append("Ancho	:" + MenuPrincipal.ancho1 + " cm" + "\n");
		txtS.append("Alto	:" + MenuPrincipal.alto1 + " cm" + "\n" + "\n");
		
		txtS.append("Modelo	:" + MenuPrincipal.modelo2 + "\n");
		txtS.append("Precio	:" + "S/. " + MenuPrincipal.precio2 + "\n");
		txtS.append("Profundidad	:" + MenuPrincipal.fondo2 + " cm" + "\n");
		txtS.append("Ancho	:" + MenuPrincipal.ancho2 + " cm" + "\n");
		txtS.append("Alto	:" + MenuPrincipal.alto2 + " cm" + "\n" + "\n");
		
		txtS.append("Modelo	:" + MenuPrincipal.modelo3 + "\n");
		txtS.append("Precio	:" + "S/. " + MenuPrincipal.precio3 + "\n");
		txtS.append("Profundidad	:" + MenuPrincipal.fondo3 + " cm" + "\n");
		txtS.append("Ancho	:" + MenuPrincipal.ancho3 + " cm" + "\n");
		txtS.append("Alto	:" + MenuPrincipal.alto3 + " cm" + "\n" + "\n");
		
		txtS.append("Modelo	:" + MenuPrincipal.modelo4 + "\n");
		txtS.append("Precio	:" + "S/. " + MenuPrincipal.precio4 + "\n");
		txtS.append("Profundidad	:" + MenuPrincipal.fondo4 + " cm" + "\n");
		txtS.append("Ancho	:" + MenuPrincipal.ancho4 + " cm" + "\n");
		txtS.append("Alto	:" + MenuPrincipal.alto4 + " cm" + "\n" + "\n");
	}
	//También puede realizarse con mediante método void con parámetros:
	//void listar(String modelo, double precio, double fondo, double ancho, double alto){
	//txtS.append("Modelo	:" + modelo + "\n");
	//txtS.append("Precio	:" + precio + "\n");
	//txtS.append("Profundidad	:" + fondo + " cm"+ "\n");
	//txtS.append("Ancho	:" + ancho+ " cm" + "\n");
	//txtS.append("Alto	:" + alto + " cm" + "\n");
	//}
	
	//Para la impresión de datos:
	//txtS.setText("LISTADO DE MALETAS"+"\n");
	//txtS.append("" +"\n");
	//listar(MenuPrincipal.modelo0, MenuPrincipal.precio0, MenuPrincipal.fondo0, MenuPrincipal.ancho0, MenuPrincipal.alto0);
	//txtS.append("" +"\n");
	//listar(MenuPrincipal.modelo1, MenuPrincipal.precio1, MenuPrincipal.fondo1, MenuPrincipal.ancho1, MenuPrincipal.alto1);
	//txtS.append("" +"\n");
	//listar(MenuPrincipal.modelo2, MenuPrincipal.precio2, MenuPrincipal.fondo2, MenuPrincipal.ancho2, MenuPrincipal.alto2);
	//txtS.append("" +"\n");
	//listar(MenuPrincipal.modelo3, MenuPrincipal.precio3, MenuPrincipal.fondo3, MenuPrincipal.ancho3, MenuPrincipal.alto3);
	//txtS.append("" +"\n");
	//listar(MenuPrincipal.modelo4, MenuPrincipal.precio4, MenuPrincipal.fondo4, MenuPrincipal.ancho4, MenuPrincipal.alto4);
	
	protected void actionPerformedBtnCerrar3(ActionEvent e) {
		dispose();
	}
}
