package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;
    private static ChromeOptions co;
    private static Wait<WebDriver> wait;
    private static By user = By.xpath("//*[@id=\"id_sc_field_login\"]");
    private static By pass = By.xpath("//*[@id=\"id_sc_field_pswd\"]");
    private static By btnLogin = By.xpath("//*[@id=\"sub_form_b\"]");
    
    private SeleniumDriver() {
//    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Ejecutables\\chromedriver.exe");
//    	driver = new ChromeDriver();
    	co = new ChromeOptions();
    	try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), co);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().window().maximize();
    	wait = new FluentWait<WebDriver>(driver).
    			withTimeout(Duration.ofSeconds(20)).
    			pollingEvery(Duration.ofSeconds(3)).
    			ignoring(NoSuchElementException.class);
    }
    
    public static WebDriver getDriver() {
    	return driver;
    }
    
    public static Wait<WebDriver> getWait(){
    	return wait;
    }
    
    public static void setUpDriver() {
    	if(seleniumDriver==null) {
    		seleniumDriver = new SeleniumDriver();
    	}
    }
    
    public static void OpenPageRAD() {
    	driver.get("http://cer.rad.afphabitat.cl/frontrad/FRONTRAD_BASE_APP_LOGIN/");
    	driver.findElement(user).sendKeys("cnavarrp");
    	driver.findElement(pass).sendKeys("afphabitat.2021");
    	driver.findElement(btnLogin).click();
    }
    
    
    public static void tearDown() {
    	
    	if(driver!=null) {
    		driver.close();
    		driver.quit();
    	}
    	
    	seleniumDriver = null;
    }
    
}
