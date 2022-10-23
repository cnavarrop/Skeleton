package testCaseLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import Utilities.ParametrosGenerales;

public class NuevoUsuario extends BaseTest{
	
	@Test
	public void IngresoNuevoUsuario() {
		String destino= "http://18.206.238.171/firstLogin.php?viewer=new";
		driver.get(ParametrosGenerales.url);
		ingresoNuevoUsuario();
		assertEquals(driver.getCurrentUrl(),destino );
	}

}
