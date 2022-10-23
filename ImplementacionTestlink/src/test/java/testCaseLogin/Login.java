package testCaseLogin;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.BaseTest;
import Utilities.ParametrosGenerales;


public class Login extends BaseTest {

	@Test
	public void ingresoTestink() {
        String urlDestino= "http://18.206.238.171/index.php?caller=login&viewer=";
		driver.get(ParametrosGenerales.url);
		driver.findElement(By.xpath("//*[@id='tl_login']")).sendKeys(ParametrosGenerales.user);
		driver.findElement(By.xpath("//*[@id='tl_password']")).sendKeys(ParametrosGenerales.pass);
		driver.findElement(By.xpath("//*[@id=\"tl_login_button\"]")).click();
		String urlactual = driver.getCurrentUrl();
		Assert.assertEquals(urlactual, urlDestino);

	}

	
}
