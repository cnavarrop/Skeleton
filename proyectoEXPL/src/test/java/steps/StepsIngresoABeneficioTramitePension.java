package steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageActions.AplicacionesRADActions;
import pageActions.SistemaBackofficeBeneficiosActions;
import utils.SeleniumDriver;

public class StepsIngresoABeneficioTramitePension {
	
	AplicacionesRADActions aplicacionesRADActions = new AplicacionesRADActions();
	SistemaBackofficeBeneficiosActions sistemaBackofficeBeneficiosActions = new SistemaBackofficeBeneficiosActions();
	
	
	@Given("Estando logeado en el sistema RAD")
	public void estando_logeado_en_el_sistema_rad() {
		
		SeleniumDriver.OpenPageRAD();
	  
	}

	@Then("pincho en la opcion Beneficio Tramite Pension")
	public void pincho_en_la_opcion_beneficio_tramite_pension() {
	   aplicacionesRADActions.clickOnbtnBeneficioTramitedePension();
	}

	@Then("Se apertura la pagina de Beneficio ramite Pension")
	public void se_apertura_la_pagina_de_beneficio_tramite_pension() {
		sistemaBackofficeBeneficiosActions.validarTituloPagina();
	   
	}
	
	@Then("voy al menu Consultas tramite->Consulta retiro diez%")
	public void voy_al_menu_consultas_tramite_consulta_retiro_diez() {
//	   sistemaBackofficeBeneficiosActions.selectMenuConsultasTramite();
//		sistemaBackofficeBeneficiosActions.ClickOnConsultaRetiro10();
	}

}
