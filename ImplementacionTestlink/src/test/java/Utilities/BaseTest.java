package Utilities;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseTest {

	public WebDriver driver;
	String Node = "http://localhost:4444";
	public ChromeOptions op;
	public FirefoxOptions fo;
	String OpeNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);

	public WebDriver getDriver() {

		return driver;

	}
	@Parameters({"browser"})
	@BeforeTest
	public void testSetUP(String browser) throws MalformedURLException {

		if (browser .equals("chrome")) {
			// capabilities para chrome
			op = new ChromeOptions();
			driver = new RemoteWebDriver(new URL(Node), op);
		} else if (browser.equals("firefox")) {
			// capabilities para firefox
			fo = new FirefoxOptions();
			// dc.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			fo.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new RemoteWebDriver(new URL(Node), fo);
		}
	}
	
	public void ingresoNuevoUsuario()
	{
		
		driver.findElement(By.xpath("//a[@id='tl_sign_up']")).sendKeys(OpeNewTab);
		
		//realiza cambio de pestaña
		
		java.util.Iterator<String> iter= driver.getWindowHandles().iterator();
		String parent = iter.next();
		String child = iter.next();
		
		driver.switchTo().window(child);
		
	}

	public static void zip(String filepath) {
		try {
			File inFolder = new File(filepath);
			File outFolder = new File("Reports.zip");
			ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
			BufferedInputStream in = null;
			byte[] data = new byte[1000];
			String files[] = inFolder.list();
			for (int i = 0; i < files.length; i++) {
				in = new BufferedInputStream(new FileInputStream(inFolder.getPath() + "/" + files[i]), 1000);
				out.putNextEntry(new ZipEntry(files[i]));
				int count;
				while ((count = in.read(data, 0, 1000)) != -1) {
					out.write(data, 0, count);
				}
				out.closeEntry();
			}
			out.flush();
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
