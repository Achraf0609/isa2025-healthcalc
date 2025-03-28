package healthcalc.bdd;

import org.junit.jupiter.api.Assertions;

import healthcalc.HealthCalcImpl;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	private HealthCalcImpl healthCalc;
	private float resultado ;
	private boolean raiseException;

	@Before
	public void initialization(){
		healthCalc=null;
		resultado=0;
		raiseException=false;
	}

	@Given("Tengo una calculadora de salud")
public void tengo_una_calculadora_de_salud() {
	 healthCalc= new HealthCalcImpl();
}


@When("calculo el peso ideal con una altura {int}")
public void calculo_el_peso_ideal_con_una_altura(Integer int1) {
	try{
		resultado= healthCalc.idealWeight(int1, 'm');
	}catch(Exception e){
		raiseException=true;
	}
}
@Then("se lanza una excepcion por parametro invalido")
public void se_lanza_una_excepcion_por_parametro_invalido() {
	Assertions.assertTrue(raiseException);
}

@When("Calculo el peso ideal con un genero {string}")
public void calculo_el_peso_ideal_con_un_genero(String  string) {
	char genero=string.charAt(0);
    try{
		resultado=healthCalc.idealWeight(160, genero);
	}catch(Exception e){
		raiseException=true;
	}
}
@Then("The system raises an exception")
public void the_system_raises_an_exception() {
    Assertions.assertTrue(raiseException);
}
@When("Calculo el peso ideal con una altura {int} y genero {string}")
public void calculo_el_peso_ideal_con_una_altura_y_genero(Integer int1, String string) throws Exception {
    char genero=string.charAt(0);
	resultado=healthCalc.idealWeight(int1, genero);
}
@Then("El sistema devuelve {double}")
public void el_sistema_devuelve(Double  double1) {
	Assertions.assertEquals(double1, resultado);
}


	
	
}
