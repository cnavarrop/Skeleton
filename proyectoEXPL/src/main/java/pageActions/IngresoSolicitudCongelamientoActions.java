package pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageLocators.IngresoSolicitudCongelamientoLocators;
import utils.SeleniumDriver;

public class IngresoSolicitudCongelamientoActions {

	IngresoSolicitudCongelamientoLocators ingresoSolicitudCongelamientoLocators = null;

	public IngresoSolicitudCongelamientoActions() {

		 this.ingresoSolicitudCongelamientoLocators = new IngresoSolicitudCongelamientoLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ingresoSolicitudCongelamientoLocators);

	}
	
	public void ingresarANuevoTramiteDePensiones() {
		
		ingresoSolicitudCongelamientoLocators.NuevoTramiteDePension.click();
	}
	
	public void ingresoSubmenuCongelarSaldos()
	{
		SeleniumDriver.getWait().until(ExpectedConditions.titleContains("Trámite de Pensiones"));
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(ingresoSolicitudCongelamientoLocators.menuNcg264).perform();
		action.moveToElement(ingresoSolicitudCongelamientoLocators.SubmenuTramites).perform();
		ingresoSolicitudCongelamientoLocators.SubmenuPorCongelar.click();
	}

	public void agregarSaldoCongelado() {
		
		SeleniumDriver.getDriver().switchTo().frame(1);
		ingresoSolicitudCongelamientoLocators.agregar.click();
		
	}

	public void ingresarRut(String rut) {
		SeleniumDriver.getDriver().switchTo().frame(7);
		ingresoSolicitudCongelamientoLocators.textboxRut.sendKeys(rut);
		
	}
	
	public void salir() {
		ingresoSolicitudCongelamientoLocators.salir.click();
	}

}
