package vistahealthcal;

import java.awt.EventQueue;

import healthcalc.HealthCalcImpl;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalcImpl modelo = new HealthCalcImpl();
					Vistahealth vista = new Vistahealth();
					Controlador controlador = new Controlador(modelo, vista);
					vista.registrarControlador(controlador);
					vista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});

	}

}
