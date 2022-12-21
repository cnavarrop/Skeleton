package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SistemaBackofficeBeneficiosLocators {
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"item_16\"]")
	public WebElement MenuConsultasTramite;
  
	@FindBy(how = How.XPATH, using = "//*[@id='item_43']")
	public WebElement MenuConsultasretiro10;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"idMenuHeader\"]/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]/img")
	public WebElement logoHabitat;
	
	
}
