package vistahealthcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
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
import javax.swing.DefaultComboBoxModel;

public class Vistahealth extends JFrame {

	private JPanel contentPane;
	private JTextField tAltura;
	private JTextField tResultadoPI;
	private JTextField tPeso;
	private JTextField tAltura2;
	private JTextField tEdad;
	private JTextField tResultadoTMB;
	private JComboBox cGenero;
	private JComboBox cGenero2;
	private JButton bCalcularPI;
	private JButton bCalcularTMB;


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
		
		JLabel lblNewLabel_2 = new JLabel("Altura (cm)");
		panelCentro.add(lblNewLabel_2);
		
		tAltura = new JTextField();
		panelCentro.add(tAltura);
		tAltura.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Género");
		panelCentro.add(lblNewLabel_3);
		
		cGenero = new JComboBox();
		cGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		panelCentro.add(cGenero);
		
		JPanel panelSur = new JPanel();
		panel_Oeste.add(panelSur, BorderLayout.SOUTH);
		
		bCalcularPI = new JButton("Calcular (PI)");
		panelSur.add(bCalcularPI);
		
		JLabel lblResultadoPI = new JLabel("Resultado");
		panelSur.add(lblResultadoPI);
		
		tResultadoPI = new JTextField();
		tResultadoPI.setEditable(false);
		panelSur.add(tResultadoPI);
		tResultadoPI.setColumns(10);
		
		// Parte del TMB
		
		JPanel panel_Este = new JPanel();
		contentPane.add(panel_Este, BorderLayout.EAST);
		panel_Este.setLayout(new BorderLayout(0, 0));
		
		
		JLabel lblNewLabel_1 = new JLabel("TASA METABOLICA BASAL (TMB)");
		panel_Este.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panelCentro2 = new JPanel();
		panel_Este.add(panelCentro2, BorderLayout.CENTER);
		panelCentro2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Peso (kg)");
		panelCentro2.add(lblNewLabel_5);
		
		tPeso = new JTextField();
		panelCentro2.add(tPeso);
		tPeso.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Altura (cm)");
		panelCentro2.add(lblNewLabel_6);
		
		tAltura2 = new JTextField();
		panelCentro2.add(tAltura2);
		tAltura2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Edad");
		panelCentro2.add(lblNewLabel_7);
		
		tEdad = new JTextField();
		panelCentro2.add(tEdad);
		tEdad.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Género");
		panelCentro2.add(lblNewLabel_8);
		
		cGenero2 = new JComboBox();
		cGenero2.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		panelCentro2.add(cGenero2);
		
		JPanel panelSur2 = new JPanel();
		panel_Este.add(panelSur2, BorderLayout.SOUTH);
		
		bCalcularTMB = new JButton("Calcular (TMB)");
		panelSur2.add(bCalcularTMB);
		
		JLabel lblNewLabel_9 = new JLabel("Resultado");
		panelSur2.add(lblNewLabel_9);
		
		tResultadoTMB = new JTextField();
		tResultadoTMB.setEditable(false);
		panelSur2.add(tResultadoTMB);
		tResultadoTMB.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.pack();
	}
	
	public int getAlturaPIValue() {
		try {
			return Integer.parseInt(tAltura.getText());	
		} catch (NumberFormatException e) {
			tResultadoPI.setText("Introduce una altura valida.");
			return -1;
		}
	}
	public float getPesoTMBValue() {
		try {
			return Float.parseFloat(tPeso.getText());
		} catch (NumberFormatException e) {
			tResultadoTMB.setText("Introduce un peso valido.");
			return -1;
		}
	}
	public int getEdadTMB() {
		try {
			return Integer.parseInt(tEdad.getText());	
		} catch (NumberFormatException e) {
			tResultadoTMB.setText("Introduce una edad valida.");
			return -1;
		}
	}
	public int getAlturaTMB() {
		try {
			return Integer.parseInt(tAltura2.getText());	
		} catch (NumberFormatException e) {
			tResultadoTMB.setText("Introduce una altura valida.");
			return -1;
		}
	}
	
	public String getGeneroPIValue() {
		return cGenero.getSelectedItem().toString();
	}
	public String getGeneroTMBValue() {
		return cGenero2.getSelectedItem().toString();
		
	}
	public void registrarControlador(ActionListener ctrl) {
		bCalcularPI.addActionListener(ctrl);
		bCalcularPI.setActionCommand("Calcular_PI");
		bCalcularTMB.addActionListener(ctrl);
		bCalcularTMB.setActionCommand("Calcular_TMB");
	}
	
	public void setResultadoPI(float resPi) {
		tResultadoPI.setText(""+resPi);
	}
	public void setResultadoTMB(float resIMB) {
		tResultadoTMB.setText(""+resIMB);
	}
	public void errorPI(String msg) {
		tResultadoPI.setText(msg);
	}
	public void errorTMB(String msg) {
		tResultadoTMB.setText(msg);
	}

}
