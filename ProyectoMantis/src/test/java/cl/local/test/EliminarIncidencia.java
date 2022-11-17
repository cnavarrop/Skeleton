package cl.local.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import cl.local.base.Base;

public class EliminarIncidencia extends Base {
	
	
	@Test
	
	public void eliminarIncidencia()
	{
		LogInMantis(prop.getProperty("user"), prop.getProperty("pass"));
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//td[@class='column-id']/a[text()='0000365']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tfoot/tr/td/div/div[8]/form/fieldset/input[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"action-group-div\"]/form/div/div[2]/div[2]/input")).click();
		LogoutMantis();
	}

}
