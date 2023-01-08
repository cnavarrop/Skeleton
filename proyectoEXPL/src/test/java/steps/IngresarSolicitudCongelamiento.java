package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.IngresoSolicitudCongelamientoActions;
import utils.SeleniumDriver;

public class IngresarSolicitudCongelamiento {
	
	IngresoSolicitudCongelamientoActions ingresoSolicitudCongelamientoActions = new IngresoSolicitudCongelamientoActions();
	
	@Given("Estando logeado en RAD")
	public void estando_logeado_en_rad() {
	   SeleniumDriver.OpenPageRAD();
	   ingresoSolicitudCongelamientoActions.ingresarANuevoTramiteDePensiones();
	   
	}

	@When("Ingreso al menu NCG264->tramites->por congelar")
	public void ingreso_al_menu_ncg264_tramites_por_congelar() {
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Selecciono la opcion Agregar")
	public void selecciono_la_opcion_agregar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Ingreso el <rut> del afiliado")
	public void ingreso_el_rut_del_afiliado(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Then("presiono salir")
	public void presiono_salir() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
