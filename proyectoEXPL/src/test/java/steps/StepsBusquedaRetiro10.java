package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.AplicacionesRADActions;
import pageActions.BusquedaRetiro10Actions;
import pageActions.SistemaBackofficeBeneficiosActions;
import utils.SeleniumDriver;

public class StepsBusquedaRetiro10 {
	
	BusquedaRetiro10Actions busquedaRetiro10Actions = new BusquedaRetiro10Actions();
	SistemaBackofficeBeneficiosActions sistemaBackofficeBeneficiosActions = new SistemaBackofficeBeneficiosActions();
	AplicacionesRADActions aplicacionesRADActions = new AplicacionesRADActions();
	
	@Given("estando en la pantalla de retiro10")
	public void estando_en_la_pantalla_de_retiro10() {
		SeleniumDriver.OpenPageRAD();
		aplicacionesRADActions.clickOnbtnBeneficioTramitedePension();
		sistemaBackofficeBeneficiosActions.selectMenuConsultasTramite();
		sistemaBackofficeBeneficiosActions.ClickOnConsultaRetiro10();
		
	}

	@When("cuando ingreso el <rut> de la persona")
	public void cuando_ingreso_el_rut_de_la_persona(io.cucumber.datatable.DataTable dataTable) {
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
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
