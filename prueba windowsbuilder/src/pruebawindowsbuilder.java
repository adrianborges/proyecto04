import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class pruebawindowsbuilder extends JFrame {

	private JPanel contentPane;

	/**
	 * punto de entrada de la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebawindowsbuilder frame = new pruebawindowsbuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * propiedades de nuestra ventana
	 */
	public pruebawindowsbuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblHolaMundo = new JLabel("hola mundo");
		contentPane.add(lblHolaMundo, BorderLayout.NORTH);
		
		JLabel lblPruebaConWindowsbuilder = new JLabel("prueba con windowsbuilder");
		contentPane.add(lblPruebaConWindowsbuilder, BorderLayout.WEST);
	}

}
