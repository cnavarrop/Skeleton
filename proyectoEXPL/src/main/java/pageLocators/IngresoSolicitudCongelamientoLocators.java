package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IngresoSolicitudCongelamientoLocators {
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"item_57\"]" )
   public WebElement menuNcg264;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"item_78\"]" )
	public WebElement SubmenuTramites;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"item_58\"]")
	public WebElement SubmenuPorCongelar;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"FRONTRAD_BASE_GRID_PORTAL_hidden_bloco_0_6\"]/tbody/tr/td/table/tbody/tr[2]/td/a")
	public WebElement NuevoTramiteDePension;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"sc_agregar_top\"]/span")
	public WebElement agregar;
	
	@FindBy(how = How.ID, using = "id_sc_field_rut")
	public WebElement textboxRut;
	
	@FindBy(how = How.XPATH, using = "//a[@id='Bsair_b']/span")
	public WebElement salir;
}
