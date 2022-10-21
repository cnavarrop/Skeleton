package testCaseLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.reader.ReaderException;

import com.beust.jcommander.Parameter;

import Utilities.BaseTest;
import Utilities.Navegadores;
import Utilities.ParametrosGenerales;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseTest{
	
	
	@Test
	public void ingresoTestink()
	{
		
	  String urldestino="http://18.206.238.171/index.php?caller=login&viewer=";
	  driver.get(urldestino);
	  driver.findElement(By.xpath("//*[@id='tl_login']")).sendKeys(ParametrosGenerales.user);
	  driver.findElement(By.xpath("//*[@id='tl_password']")).sendKeys(ParametrosGenerales.pass);
	  driver.findElement(By.xpath("//*[@id=\"tl_login_button\"]")).click();
	  String urlactual=driver.getCurrentUrl();
	  Assert.assertEquals(urlactual, urldestino);
	  
	}
	
	
	
	

}
