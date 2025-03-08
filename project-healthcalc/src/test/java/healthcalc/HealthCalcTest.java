package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	@Test
	@DisplayName("Test Lanzar exception si genero diferente a los esperados en idealWeight ")
	public void lanzaExcepcionSiGeneroIncorrectoIW() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class,()->calculadora.idealWeight(100,'r'));
	}

	@Test
	@DisplayName("Test Lanzar exception si altura negativo en idealweight")
	public void lanzarExcepcionSiAlturaNegativoIW() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class,()->calculadora.idealWeight(-5, 'm'));
	}

	@Test
	@DisplayName("Test Lanzar Exception si altura igual cero en idealWeight")
	public void lanzarExcepcionSiAlturaCeroIW() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class, ()->calculadora.idealWeight(0, 'm'));

	}

	@Test
	@DisplayName("Test calcular correctamente idealweight hombre")
	public void CalcularIdealWeightHombreIW() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		float esperado= (float) 57.5;
		assertEquals(esperado, calculadora.idealWeight(160, 'm'));

	}

	@Test
	@DisplayName("Test calcular correctamente idealweight mujer")
	public void CalcularIdealWeightMujerIW() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		float esperado= (float) 56;
		assertEquals(esperado, calculadora.idealWeight(160, 'w'));

	}

	@Test
	@DisplayName("Test Lanzar exception si genero diferente a los esperados en basalMetabolicRate ")
	public void lanzaExcepcionSiGeneroIncorrectoBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class,()->calculadora.basalMetabolicRate(57, 120, 30, 'r'));
	}

	@Test
	@DisplayName("Test Lanzar exception si altura negativo en basalMetabolicRate")
	public void lanzarExcepcionSiAlturaNegativoBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class,()->calculadora.basalMetabolicRate(57, -5, 30, 'm'));
	}

	@Test
	@DisplayName("Test Lanzar Exception si altura igual cero en basalMetabolicRate")
	public void lanzarExcepcionSiAlturaCeroBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class, ()->calculadora.basalMetabolicRate(57, 0, 20, 'm'));
	}

	@Test
	@DisplayName("Test Lanzar Exception si edad igual cero en basalMetabolicRate")
	public void lanzarExcepcionSiEdadCeroBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class, ()->calculadora.basalMetabolicRate(57, 120, 0, 'm'));
	}
	@Test
	@DisplayName("Test Lanzar Exception si edad es negativo en basalMetabolicRate")
	public void lanzarExcepcionSiEdadNegativoBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class, ()->calculadora.basalMetabolicRate(57, 120, -5, 'm'));
	}
	@Test
	@DisplayName("Test Lanzar Exception si peso igual cero en basalMetabolicRate")
	public void lanzarExcepcionSiPesoCeroBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class, ()->calculadora.basalMetabolicRate(0, 120, 20, 'm'));
	}
	@Test
	@DisplayName("Test Lanzar Exception si peso es negativo en basalMetabolicRate")
	public void lanzarExcepcionSiPesoNegativoBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class, ()->calculadora.basalMetabolicRate(-20, 120, 20, 'm'));
	}


	@Test
	@DisplayName("Test calcular correctamente basalMetabolicRate hombre")
	public void CalcularIdealWeightHombreBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		float esperado= (float) 1776.432;
		assertEquals(esperado, calculadora.basalMetabolicRate(70, 180, 20, 'm'));

	}

	@Test
	@DisplayName("Test calcular correctamente basalMetabolicRate mujer")
	public void CalcularIdealWeightMujerBMR() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		float esperado= (float) 1309.023;
		assertEquals(esperado, calculadora.basalMetabolicRate(50, 165, 20, 'w'));

	}



	


}
