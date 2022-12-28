package pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import pageLocators.SistemaBackofficeBeneficiosLocators;
import utils.SeleniumDriver;

public class SistemaBackofficeBeneficiosActions {
	

	SistemaBackofficeBeneficiosLocators sistemaBackofficeBeneficiosLocators = null;
	
	public SistemaBackofficeBeneficiosActions() {
		sistemaBackofficeBeneficiosLocators = new SistemaBackofficeBeneficiosLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), sistemaBackofficeBeneficiosLocators);
		
	}
	
	public void validarTituloPagina() {
		SeleniumDriver.getWait().until(ExpectedConditions.titleContains("SISTEMA BACKOFFICE BENEFICIOS"));
		Assert.assertEquals(SeleniumDriver.getDriver().getTitle(), "SISTEMA BACKOFFICE BENEFICIOS");
			
	}
	
	public void selectMenuConsultasTramite() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(sistemaBackofficeBeneficiosLocators.MenuConsultasTramite).perform();
	}
	
	public void ClickOnConsultaRetiro10() {
	
	sistemaBackofficeBeneficiosLocators.MenuConsultasretiro10.click();
	}

}
