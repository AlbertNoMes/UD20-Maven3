/**
 * Albert Notario Mestres
 */

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ContadorBotones extends JFrame {

	int cont1 = 0;
	int cont2 = 0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorBotones frame = new ContadorBotones();
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
	public ContadorBotones() {
		setTitle("Ventana con más interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JLabel lblNewLabel = new JLabel("Botón 1:");
		lblNewLabel.setBounds(10, 11, 139, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont1++;
				lblNewLabel.setText("Botón 1 pulsado " + cont1 + " veces");
			}
		});
		btnNewButton.setBounds(10, 36, 89, 23);
		contentPane.add(btnNewButton);

		final JLabel lblNewLabel_1 = new JLabel("Botón 2:");
		lblNewLabel_1.setBounds(285, 11, 139, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("Botón 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont2++;
				lblNewLabel_1.setText("Botón 2 pulsado " + cont2 + " veces");
			}
		});
		btnNewButton_1.setBounds(285, 36, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
