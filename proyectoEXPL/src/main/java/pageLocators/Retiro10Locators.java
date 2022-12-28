package pageLocators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Retiro10Locators {
	@FindBy(how = How.XPATH, using = "//*[@id=\"id_sc_field_rut\"]")
	public WebElement txtBoxBuscarRut;
	@FindBy(how = How.XPATH, using ="//*[@id=\"sub_form_b\"]/span" )
	public WebElement btnBuscar;
	@FindBy(how= How.XPATH, using = "//*[@id=\"sc_Salir_bot\"]/span")
	public WebElement btnSalir;

}
