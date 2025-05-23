package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	@Test
	@DisplayName("Test Lanzar exception si altura negativo en idealweight")
	public void lanzarExcepcionSiAlturaNegativoIW() throws Exception{
		
		Persona persona= new Persona(70, -160, 20, Gender.MALE);
		CardiovascularMetrics cardio= new CardiovascularMetrics();
		assertThrows(Exception.class,()->cardio.getIdealBodyWeight(persona));
	}

	@Test
	@DisplayName("Test Lanzar Exception si altura igual cero en idealWeight")
	public void lanzarExcepcionSiAlturaCeroIW() throws Exception{
		Persona persona= new Persona(70, 0, 20, Gender.MALE);
		CardiovascularMetrics cardio= new CardiovascularMetrics();
		assertThrows(Exception.class, ()->cardio.getIdealBodyWeight(persona));

	}

	@Test
	@DisplayName("Test calcular correctamente idealweight hombre")
	public void CalcularIdealWeightHombreIW() throws Exception{
		Persona persona= new Persona(70, 160, 20, Gender.MALE);
		CardiovascularMetrics cardio= new CardiovascularMetrics();
		float esperado= (float) 57.5;
		assertEquals(esperado, cardio.getIdealBodyWeight(persona));

	}

	@Test
	@DisplayName("Test calcular correctamente idealweight mujer")
	public void CalcularIdealWeightMujerIW() throws Exception{
		Persona persona= new Persona(70, 160, 20, Gender.FEMALE);
		CardiovascularMetrics cardio= new CardiovascularMetrics();
		float esperado= (float) 56;
		assertEquals(esperado, cardio.getIdealBodyWeight(persona));

	}


	@Test
	@DisplayName("Test Lanzar exception si altura negativo en basalMetabolicRate")
	public void lanzarExcepcionSiAlturaNegativoBMR() throws Exception{
		Persona persona= new Persona(70, -160, 20, Gender.MALE);
		MetabolicMetrics metabolic= new MetabolicMetrics();
		assertThrows(Exception.class,()->metabolic.basalMetabolicRate(persona));
	}

	@Test
	@DisplayName("Test Lanzar Exception si altura igual cero en basalMetabolicRate")
	public void lanzarExcepcionSiAlturaCeroBMR() throws Exception{
		Persona persona= new Persona(70, 0, 20, Gender.MALE);
		MetabolicMetrics metabolic= new MetabolicMetrics();
		assertThrows(Exception.class, ()->metabolic.basalMetabolicRate(persona));
	}

	@Test
	@DisplayName("Test Lanzar Exception si edad igual cero en basalMetabolicRate")
	public void lanzarExcepcionSiEdadCeroBMR() throws Exception{
		Persona persona= new Persona(70, 160, 0, Gender.MALE);
		MetabolicMetrics metabolic= new MetabolicMetrics();
		assertThrows(Exception.class, ()->metabolic.basalMetabolicRate(persona));
	}
	@Test
	@DisplayName("Test Lanzar Exception si edad es negativo en basalMetabolicRate")
	public void lanzarExcepcionSiEdadNegativoBMR() throws Exception{
		Persona persona= new Persona(70, 160, -20, Gender.MALE);
		MetabolicMetrics metabolic= new MetabolicMetrics();
		assertThrows(Exception.class, ()->metabolic.basalMetabolicRate(persona));
	}
	@Test
	@DisplayName("Test Lanzar Exception si peso igual cero en basalMetabolicRate")
	public void lanzarExcepcionSiPesoCeroBMR() throws Exception{
		Persona persona= new Persona(0, 160, 20, Gender.MALE);
		MetabolicMetrics metabolic= new MetabolicMetrics();
		assertThrows(Exception.class, ()->metabolic.basalMetabolicRate(persona));
	}
	@Test
	@DisplayName("Test Lanzar Exception si peso es negativo en basalMetabolicRate")
	public void lanzarExcepcionSiPesoNegativoBMR() throws Exception{
		Persona persona= new Persona(70, -160, 20, Gender.MALE);
		MetabolicMetrics metabolic= new MetabolicMetrics();
		assertThrows(Exception.class, ()->metabolic.basalMetabolicRate(persona));
	}


	@Test
	@DisplayName("Test calcular correctamente basalMetabolicRate hombre")
	public void CalcularIdealWeightHombreBMR() throws Exception{
		Persona persona= new Persona(70, 180, 20, Gender.MALE);
		MetabolicMetrics metabolic= new MetabolicMetrics();
		float esperado= (float) 1776.432;
		assertEquals(esperado, metabolic.basalMetabolicRate(persona));

	}

	@Test
	@DisplayName("Test calcular correctamente basalMetabolicRate mujer")
	public void CalcularIdealWeightMujerBMR() throws Exception{
		Persona persona= new Persona(50, 165, 20, Gender.FEMALE);
		MetabolicMetrics metabolic= new MetabolicMetrics();
		float esperado= (float) 1334.5131;
		assertEquals(esperado, metabolic.basalMetabolicRate(persona));

	}



	


}
