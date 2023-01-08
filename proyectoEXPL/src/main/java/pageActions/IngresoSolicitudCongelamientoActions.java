package pageActions;

import org.openqa.selenium.support.PageFactory;

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

}
