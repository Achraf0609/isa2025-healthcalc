package vistahealthcal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import healthcalc.HealthCalcImpl;

public class Controlador implements ActionListener {
	
	private HealthCalcImpl modelo;
	private Vistahealth vista;
	
	public Controlador(HealthCalcImpl modelo,Vistahealth vista){
		this.modelo=modelo;
		this.vista=vista;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();
		if (comando.equals("Calcular_PI")) {
			
			// Calcular PI
			int altura = vista.getAlturaPIValue();
			char genero='x';
			if(vista.getGeneroPIValue().equals("Masculino")) {
				genero='m';
			}else {
				genero='w';
			}
			try {
				float resultado = modelo.idealWeight(altura, genero);
				vista.setResultadoPI(resultado);
			} catch (Exception error) {
				vista.errorPI("Introduce un número positivo.");
			}
			
		}if(comando.equals("Calcular_TMB")) {
			int altura= vista.getAlturaTMB();
			float peso=vista.getPesoTMBValue();
			int edad= vista.getEdadTMB();
			char genero='a';
			if(vista.getGeneroTMBValue().equals("Masculino")) {
				genero='m';
			}else {
				genero='w';
			}
			try {
				float resultado= modelo.basalMetabolicRate(peso, altura, edad, genero);
				vista.setResultadoTMB(resultado);
			}catch(Exception error){
				vista.errorTMB("Introduce un número positivo");				
			}
		}
		// TODO Auto-generated method stub
		
	}
	
	
	

}
