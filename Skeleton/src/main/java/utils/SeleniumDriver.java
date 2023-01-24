package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class SeleniumDriver {

	private static WebDriver driver;
	private static ChromeOptions co;
	private static FirefoxOptions fo;
	private static EdgeOptions eo;
	private static FileInputStream fi;
	private static Properties prop= new Properties();
	private static SeleniumDriver seleniumDriver;
	private static FluentWait<WebDriver> wait;

	public static void cargarArchivoProperty() {

		try {
			fi = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\propiedades\\my.properties");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private SeleniumDriver() {
		co = new ChromeOptions();
		fo = new FirefoxOptions();
		eo = new EdgeOptions();

		try {
			if (driver == null) {
				if (prop.getProperty("navegador").equals("chrome")) {
					driver = new RemoteWebDriver(new URL("http://localhost:4444"), co);
				} else if (prop.getProperty("navegador").equals("firefox")) {
					driver = new RemoteWebDriver(new URL("http://localhost:4444"), fo);
				} else {
					driver = new RemoteWebDriver(new URL("http://localhost:4444"), eo);
				}
			}

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

	public static void setDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
}
