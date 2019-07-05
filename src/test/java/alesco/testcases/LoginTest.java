package alesco.testcases;

import org.junit.Test;
import org.openqa.selenium.By;

import alesco.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void login() throws InterruptedException
	{
	    System.out.println(config.getProperty("projurl"));
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(OR.getProperty("bmllogin"))).click();
		Thread.sleep(3000);
	}

}