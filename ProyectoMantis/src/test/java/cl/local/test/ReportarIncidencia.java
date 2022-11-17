package cl.local.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cl.local.base.Base;
import cl.local.test.*;

public class ReportarIncidencia extends Base{
	
	
	@Test()
	public void RepoIncidencia(){
		
		
		LogInMantis(prop.getProperty("user"), prop.getProperty("pass"));
		driver.findElement(By.xpath(prop.getProperty("xpathReportarIncidencia"))).click();
		selectDropDownList();
		driver.findElement(By.xpath("//*[@id=\"summary\"]")).sendKeys(prop.getProperty("resumenIncidencia"));
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(prop.getProperty("descripcionIncidencia"));
		driver.findElement(By.xpath("//input[@value='Enviar incidencia']")).click();
		
	}
	
	
	public void selectDropDownList()
	{
		Select select = new Select(driver.findElement(By.xpath("//*[@id='category_id']")));
		select.selectByVisibleText(prop.getProperty("categoriaIncidencia"));
		
	}
}
