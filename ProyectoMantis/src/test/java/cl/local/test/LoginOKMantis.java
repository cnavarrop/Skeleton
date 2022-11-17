package cl.local.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import cl.local.base.Base;

public class LoginOKMantis extends Base {

	@Test(priority = 1)
	public void loginOK() {

		LogInMantis(prop.getProperty("user"), prop.getProperty("pass"));
		LogoutMantis();
		log.debug("Prueba finalizada satisfactoriamente");
	}

}
