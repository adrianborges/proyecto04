import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Miperfil extends JFrame {

	private JPanel contentPane;
	private JTextField txtArmando;
	private JTextField txtPovedaGarca;
	private JTextField txtt;
	private JTextField txtCCastillo;
	private JTextField textField;
	private JTextField txtArpogafloridauniversitariaes;

	/**
	 * aqui se lanza nuestra app
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miperfil frame = new Miperfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Configuracion de la ventana
	 */
	public Miperfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// etiqueta nombre
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setBounds(10, 11, 46, 14);
		contentPane.add(Nombre);
		//etiqueta apellidos
		JLabel Apellidos = new JLabel("Apellidos");
		Apellidos.setBounds(217, 11, 83, 14);
		contentPane.add(Apellidos);
		//cajanombre
		txtArmando = new JTextField();
		txtArmando.setText("Armando");
		txtArmando.setBounds(0, 36, 162, 20);
		contentPane.add(txtArmando);
		txtArmando.setColumns(10);
		//caja apellidos
		txtPovedaGarca = new JTextField();
		txtPovedaGarca.setText("Poveda Garc\u00EDa");
		txtPovedaGarca.setBounds(182, 36, 221, 20);
		contentPane.add(txtPovedaGarca);
		txtPovedaGarca.setColumns(10);
		// etiqueta dni
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 81, 46, 14);
		contentPane.add(lblDni);
		// etiqueta direccion
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(217, 81, 135, 14);
		contentPane.add(lblDireccin);
		// caja dni
		txtt = new JTextField();
		txtt.setText("48528413t");
		txtt.setBounds(0, 105, 162, 20);
		contentPane.add(txtt);
		txtt.setColumns(10);
		//caja direccion
		txtCCastillo = new JTextField();
		txtCCastillo.setText("c/ castillo 3-16");
		txtCCastillo.setBounds(182, 106, 221, 20);
		contentPane.add(txtCCastillo);
		txtCCastillo.setColumns(10);
		// etiqueta telefono
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(10, 159, 113, 14);
		contentPane.add(lblTelfono);
		// etiqueta correo
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(217, 159, 46, 14);
		contentPane.add(lblCorreo);
		// caja telefono
		textField = new JTextField();
		textField.setText("679470184");
		textField.setBounds(10, 184, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		// caja correo
		txtArpogafloridauniversitariaes = new JTextField();
		txtArpogafloridauniversitariaes.setText("arpoga@floridauniversitaria.es");
		txtArpogafloridauniversitariaes.setBounds(182, 184, 221, 20);
		contentPane.add(txtArpogafloridauniversitariaes);
		txtArpogafloridauniversitariaes.setColumns(10);
		
		//etiqueta nombre
		
		
	}

}
