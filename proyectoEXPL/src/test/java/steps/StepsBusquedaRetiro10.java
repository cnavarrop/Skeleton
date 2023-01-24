package steps;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.AplicacionesRADActions;
import pageActions.BusquedaRetiro10Actions;
import pageActions.SistemaBackofficeBeneficiosActions;
import pageLocators.Retiro10Locators;
import utils.SeleniumDriver;

public class StepsBusquedaRetiro10 {
	
	BusquedaRetiro10Actions busquedaRetiro10Actions = new BusquedaRetiro10Actions();
	SistemaBackofficeBeneficiosActions sistemaBackofficeBeneficiosActions = new SistemaBackofficeBeneficiosActions();
	AplicacionesRADActions aplicacionesRADActions = new AplicacionesRADActions();
	
	
	
	@Given("en la pantalla de retiro10")
	public void en_la_pantalla_de_retiro10() {
		SeleniumDriver.OpenPageRAD();
		aplicacionesRADActions.clickOnbtnBeneficioTramitedePension();
		sistemaBackofficeBeneficiosActions.validarTituloPagina();
		sistemaBackofficeBeneficiosActions.selectMenuConsultasTramite();
		sistemaBackofficeBeneficiosActions.ClickOnConsultaRetiro10();
	}

	@When("ingreso el <rut> de la persona")
	public void ingreso_el_rut_de_la_persona(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		String rut = data.get(0).get(0);
	    busquedaRetiro10Actions.ingresarRut(rut);
	}

	
	@Then("presiono el boton buscar")
	public void presiono_el_boton_buscar() {
	   busquedaRetiro10Actions.clickBtnBuscar();
	}

	@Then("se muestra en cuadro con los retiros realizados por el afiliado")
	public void se_muestra_en_cuadro_con_los_retiros_realizados_por_el_afiliado() {
		assertEquals(busquedaRetiro10Actions.validaGrilla(), true);
		
	}
	
}
