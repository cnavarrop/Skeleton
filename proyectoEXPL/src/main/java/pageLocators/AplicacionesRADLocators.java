package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AplicacionesRADLocators {
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'Beneficio Tramite de Pensión')]") 
	public WebElement btnBeneficioTramitedePension;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'Beneficios - Liquidacion')]") 
	public WebElement btnBeneficiosLiquidacion;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'Beneficios - Otros Beneficios')]") 
	public WebElement btnBeneficiosOtrosBeneficios;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'Conflictos de Interés')]") 
	public WebElement btnConflictosdeInteres;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'Ley de enfermos terminales')]") 
	public WebElement btnLeydeenfermosterminales;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'Nuevo Tramite de Pensiones')]") 
	public WebElement btnNuevoTramitedePensiones;
	
	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'SQL Soporte Operacional')]") 
	public WebElement btnSQLSoporteOperacional;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Tramite Pensión')]")
	public WebElement btnTramitePension;	
	
	@FindBy(how = How.ID, using = "sai_bot")
	public WebElement btnSalir;	
	
	
	
	
	
}
	