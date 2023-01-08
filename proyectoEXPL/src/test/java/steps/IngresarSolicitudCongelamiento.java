package steps;


import java.util.List;

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
		ingresoSolicitudCongelamientoActions.ingresoSubmenuCongelarSaldos();
	}

	@Then("Selecciono la opcion Agregar")
	public void selecciono_la_opcion_agregar() {
	  ingresoSolicitudCongelamientoActions.agregarSaldoCongelado();
	}

	@Then("Ingreso el <rut> del afiliado")
	public void ingreso_el_rut_del_afiliado(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data=  dataTable.asLists();
		String rut = data.get(0).get(0);
		ingresoSolicitudCongelamientoActions.ingresarRut(rut);
	}

	@Then("presiono salir")
	public void presiono_salir() {
	    
		ingresoSolicitudCongelamientoActions.salir();
	}

}
