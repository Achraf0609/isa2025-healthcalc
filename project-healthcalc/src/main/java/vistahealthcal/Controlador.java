package vistahealthcal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import healthcalc.CardiovascularMetrics;
import healthcalc.Gender;
import healthcalc.HealthCalcImpl;
import healthcalc.MetabolicMetrics;
import healthcalc.Persona;

public class Controlador implements ActionListener {
	
	private HealthCalcImpl modelo;
	private MetabolicMetrics metabolicmodelo;
	private CardiovascularMetrics cardiovascularmodelo;
	private Vistahealth vista;
	
	public Controlador(HealthCalcImpl modelo,MetabolicMetrics metabolicmodelo,CardiovascularMetrics cardiovascularmodelo,Vistahealth vista){
		this.cardiovascularmodelo=cardiovascularmodelo;
		this.metabolicmodelo=metabolicmodelo;
		this.modelo=modelo;
		this.vista=vista;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();
		if (comando.equals("Calcular_PI")) {
			
			// Calcular PI
			float altura = vista.getAlturaPIValue();
			Gender genero=Gender.MALE;
			if(vista.getGeneroPIValue().equals("Masculino")) {
				genero=Gender.MALE;
			}else {
				genero=Gender.FEMALE;
			}
			Persona persona = new Persona(0,altura,0, genero);
			try {
				float resultado = modelo.idealWeight(cardiovascularmodelo, persona);
				vista.setResultadoPI((float)resultado);
			} catch (Exception error) {
				vista.errorPI("Introduce un número positivo.");
			}
			
		}if(comando.equals("Calcular_TMB")) {
			int altura= vista.getAlturaTMB();
			float peso=vista.getPesoTMBValue();
			int edad= vista.getEdadTMB();
			Gender genero=Gender.MALE;
			if(vista.getGeneroTMBValue().equals("Masculino")) {
				genero=Gender.MALE;
			}else {
				genero=Gender.FEMALE;
			}
			Persona persona = new Persona(peso,altura,edad,genero);
			try {
				double resultado= modelo.basalMetabolicRate(metabolicmodelo, persona);
				vista.setResultadoTMB((float)resultado);
			}catch(Exception error){
				vista.errorTMB("Introduce un número positivo");				
			}
		}
		// TODO Auto-generated method stub
		
	}
	
	
	

}
