package vistahealthcal;

import java.awt.EventQueue;

import healthcalc.CardiovascularMetrics;
import healthcalc.HealthCalcImpl;
import healthcalc.MetabolicMetrics;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					CardiovascularMetrics cardiovascularmodelo = new CardiovascularMetrics();
					MetabolicMetrics metabolicmodelo = new MetabolicMetrics();
					HealthCalcImpl modelo= HealthCalcImpl.getInstancia();
					Vistahealth vista = new Vistahealth();
					//Controlador controlador = new Controlador(metabolicmodelo,cardiovascularmodelo, vista);
					Controlador controlador = new Controlador(modelo,metabolicmodelo,cardiovascularmodelo, vista);
					vista.registrarControlador(controlador);
					vista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});

	}

}
