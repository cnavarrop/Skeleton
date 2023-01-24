package steps;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class Antes {
	
	@Before
	public void IniciarDriver() {
		
		SeleniumDriver.cargarArchivoProperty();
		SeleniumDriver.setDriver();
	}

}
