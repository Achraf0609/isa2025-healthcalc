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

@When("calculo el peso metabolico basal con un peso {double}")
public void calculo_el_peso_metabolico_basal_con_un_peso(Double double1) throws Exception {
	float peso= double1.floatValue();
	try{
		resultado= healthCalc.basalMetabolicRate(peso, 20, 20, 'm');
	}catch(Exception e){
		raiseException=true;
	}
}
@Then("se lanza una excepcion por peso invalido")
public void se_lanza_una_excepcion_por_peso_invalido() {
    Assertions.assertTrue(raiseException);
}

@When("Calculo el peso metabolico basal con un genero {string}")
public void calculo_el_peso_metabolico_basal_con_un_genero(String string) {
	char genero=string.charAt(0);
	try{
		resultado= healthCalc.basalMetabolicRate(60, 120, 20, genero);
	}catch(Exception e){
		raiseException=true;
	}
}
@Then("The system raises exception")
public void the_system_raises_exception() {
	Assertions.assertTrue(raiseException);
}

@When("calculo peso metabolico basal con una altura {int}")
public void calculo_peso_metabolico_basal_con_una_altura(Integer int1) {
	try{
		resultado= healthCalc.basalMetabolicRate(60,int1, 20, 'm');
	}catch(Exception e){
		raiseException=true;
	}
}
@Then("se lanza una excepcion por altura invalida")
public void se_lanza_una_excepcion_por_altura_invalida() {

    Assertions.assertTrue(raiseException);
}

@When("calculo peso metabolico basal con una edad {int}")
public void calculo_peso_metabolico_basal_con_una_edad(Integer int1) {
    try{
		resultado= healthCalc.basalMetabolicRate(60,160, int1, 'm');
	}catch(Exception e){
		raiseException=true;
	}
}
@Then("se lanza una excepcion por edad invalido")
public void se_lanza_una_excepcion_por_edad_invalido() {
    Assertions.assertTrue(raiseException);
}
@When("Calculo el peso metabolico basal con un peso {double}, altura {int}, edad {int} y genero {string}")
public void calculo_el_peso_metabolico_basal_con_un_peso_altura_edad_y_genero(Double double1, Integer int1, Integer int2, String string) throws Exception {
	float peso= double1.floatValue();
	char genero=string.charAt(0);
	resultado=healthCalc.basalMetabolicRate(peso, int1, int2, genero);
    // Write code here that turns the phrase above into concrete actions
}
@Then("El sistema devuelve resultado {double}")
public void el_sistema_devuelve_resultado(Double double1) {
	Assertions.assertEquals(double1, resultado);
}








	
	
}
