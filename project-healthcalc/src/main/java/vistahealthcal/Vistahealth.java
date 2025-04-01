package vistahealthcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class Vistahealth extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField tResultadoPI;
	private JTextField tPeso;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		JLabel lblNewLabel = new JLabel("PESO IDEAL (PI)");
		panel_Oeste.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panelCentro = new JPanel();
		panel_Oeste.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Altura");
		panelCentro.add(lblNewLabel_2);
		
		textField = new JTextField();
		panelCentro.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Calcular");
		panelCentro.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		panelCentro.add(comboBox);
		
		JPanel panelSur = new JPanel();
		panel_Oeste.add(panelSur, BorderLayout.SOUTH);
		
		JButton bCalcularPI = new JButton("Calcular (PI)");
		panelSur.add(bCalcularPI);
		
		JLabel lblNewLabel_4 = new JLabel("Resultado");
		panelSur.add(lblNewLabel_4);
		
		tResultadoPI = new JTextField();
		panelSur.add(tResultadoPI);
		tResultadoPI.setColumns(10);
		
		JPanel panel_Este = new JPanel();
		contentPane.add(panel_Este, BorderLayout.EAST);
		panel_Este.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("TASA METABOLICA BASAL (TMB)");
		panel_Este.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panelCentro2 = new JPanel();
		panel_Este.add(panelCentro2, BorderLayout.CENTER);
		panelCentro2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Peso");
		panelCentro2.add(lblNewLabel_5);
		
		tPeso = new JTextField();
		panelCentro2.add(tPeso);
		tPeso.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Altura");
		panelCentro2.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		panelCentro2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Edad");
		panelCentro2.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		panelCentro2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Género");
		panelCentro2.add(lblNewLabel_8);
		
		JComboBox comboBox_1 = new JComboBox();
		panelCentro2.add(comboBox_1);
		
		JPanel panelSur2 = new JPanel();
		panel_Este.add(panelSur2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Calcular (TMB)");
		panelSur2.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("Resultado");
		panelSur2.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		panelSur2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.pack();
	}

}
