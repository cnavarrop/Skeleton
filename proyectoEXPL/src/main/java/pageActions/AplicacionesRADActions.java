package pageActions;


import org.openqa.selenium.support.PageFactory;

import pageLocators.AplicacionesRADLocators;
import utils.SeleniumDriver;

public class AplicacionesRADActions {
	
	AplicacionesRADLocators aplicacionesRADLocators = null;
	
	public AplicacionesRADActions() {
		
		this.aplicacionesRADLocators = new AplicacionesRADLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), aplicacionesRADLocators);
	}
	
	
	public void clickOnbtnBeneficioTramitedePension() {
	 
		aplicacionesRADLocators.btnBeneficioTramitedePension.click();
		
		
		
		
	}


}
