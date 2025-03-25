package vistahealthcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class Vistahealth extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vistahealth frame = new Vistahealth();
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
	public Vistahealth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Oeste = new JPanel();
		contentPane.add(panel_Oeste, BorderLayout.WEST);
		panel_Oeste.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PESO IDEAL");
		panel_Oeste.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_Este = new JPanel();
		contentPane.add(panel_Este, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = new JLabel("TASA METABOLICA BASAL");
		panel_Este.add(lblNewLabel_1);
	}

}
