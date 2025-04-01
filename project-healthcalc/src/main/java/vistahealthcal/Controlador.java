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
			String genero= vista.getGeneroPIValue();
			/*try {
				int resultado = modelo.compute(n);	
				vista.setResutado(resultado);
			} catch (NegativeValueException error) {
				vista.error("Introduce un número positivo.");
			}*/
			
		}
		// TODO Auto-generated method stub
		
	}
	
	
	

}
