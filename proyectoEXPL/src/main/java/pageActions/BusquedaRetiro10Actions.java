package pageActions;


import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pageLocators.Retiro10Locators;
import utils.SeleniumDriver;

public class BusquedaRetiro10Actions {
	Retiro10Locators retiro10Locators = null;
	String rut = "";

	public BusquedaRetiro10Actions() {
		this.retiro10Locators = new Retiro10Locators();
		PageFactory.initElements(SeleniumDriver.getDriver(), retiro10Locators);
	}

	public void ingresarRut(String rut) {
		this.rut = rut;
		SeleniumDriver.getDriver().switchTo().frame(0);
		retiro10Locators.txtRutCss.click();
		retiro10Locators.txtRutCss.sendKeys(this.rut);
	}

	public void clickBtnBuscar() {

		retiro10Locators.btnBuscar.click();

	}

	public void clickBtnSalir() {

		retiro10Locators.btnSalir.click();
	}

	public boolean validaGrilla() {
		String mensaje = "No hay registros para mostrar";
		String existe = "";
		try {
			existe = retiro10Locators.mensajeAlerta.getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if (existe.equalsIgnoreCase(mensaje)) {
			retiro10Locators.btnSalirAlerta.click();
			return false;

		} else {

			String rutGrilla = formateoRut(retiro10Locators.rutSuscriptor.getText());

			if (rutGrilla.equals(rut)) {
				retiro10Locators.btnSalirGrilla.click();
				return true;
			} else {
				return false;
			}
		}

	}

	public String formateoRut(String rut) {
		String rutForm = "";
		String[] datos = rut.split("\\.");
		for (String string : datos) {
			rutForm += string;
		}

		return rutForm.trim();

	}
}
