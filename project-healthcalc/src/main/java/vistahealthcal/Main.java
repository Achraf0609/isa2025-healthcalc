package vistahealthcal;

import java.awt.EventQueue;

import healthcalc.CardiovascularMetrics;
import healthcalc.MetabolicMetrics;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardiovascularMetrics cardiovascularmodelo = new CardiovascularMetrics();
					MetabolicMetrics metabolicmodelo = new MetabolicMetrics();
					Vistahealth vista = new Vistahealth();
					Controlador controlador = new Controlador(metabolicmodelo,cardiovascularmodelo, vista);
					vista.registrarControlador(controlador);
					vista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});

	}

}
