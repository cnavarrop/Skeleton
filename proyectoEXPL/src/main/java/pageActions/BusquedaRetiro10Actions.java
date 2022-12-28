package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageLocators.Retiro10Locators;
import utils.SeleniumDriver;

public class BusquedaRetiro10Actions {
	Retiro10Locators retiro10Locators = null;
	
	public BusquedaRetiro10Actions()
	{
		this.retiro10Locators = new Retiro10Locators();
		PageFactory.initElements(SeleniumDriver.getDriver(), retiro10Locators);
	}
	
	public void ingresarRut(String rut)
	{
		SeleniumDriver.getWait().until(ExpectedConditions.elementToBeClickable(retiro10Locators.txtBoxBuscarRut));
		retiro10Locators.txtBoxBuscarRut.sendKeys(rut);
	}
	
	public void clickBtnBuscar() {
		
		retiro10Locators.btnBuscar.click();
		
	}
	public void clickBtnSalir() {
	
	retiro10Locators.btnSalir.click();
	}
}
