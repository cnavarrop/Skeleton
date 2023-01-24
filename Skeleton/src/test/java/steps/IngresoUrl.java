package steps;

import io.cucumber.java.en.Given;
import utils.SeleniumDriver;

public class IngresoUrl {
	
	@Given("Ingreso a la url")
	public void ingreso_a_la_url() {
	   SeleniumDriver.getDriver().get("http://www.google.cl");
	}

}
