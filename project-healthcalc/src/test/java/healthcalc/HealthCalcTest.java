package healthcalc;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	@Test
	@DisplayName("Test Lanzar exception si genero diferente a los esperados en idealWeight ")
	public void lanzaExcepcionSiGeneroIncorrecto() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class,()->calculadora.idealWeight(100,'r'));
	}

	@Test
	@DisplayName("Test Lanzar exception si altura negativo en idealweight")
	public void lanzarExcepcionSiAlturaNegativo() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class,()->calculadora.idealWeight(-5, 'm'));
	}

	@Test
	@DisplayName("Test Lanzar Exception si altura igual cero en idealWeight")
	public void lanzarExcepcionSiAlturaCero() throws Exception{
		HealthCalcImpl calculadora= new HealthCalcImpl();
		assertThrows(Exception.class, ()->calculadora.idealWeight(0, 'm'));
	}

	


}
