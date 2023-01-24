package steps;

import io.cucumber.java.After;
import utils.SeleniumDriver;

public class Despues {
	
	@After
	public void closeDriver() {
		SeleniumDriver.tearDown();
	}

}
