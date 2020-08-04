package xpathLocator;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Xpath_Syntax {

	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		driver = new ChromeDriver();	
		//driver = new FirefoxDriver();		

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.quit();
		
		// ****contains With attribute value
		
		//input[contains(@type,"pass")]	//for dynamic handle
		//input[contains(@type,"password")]		
		
		//using parent
		
		//input[@type="email"]/parent::td/parent::tr/parent::tbody/parent::table

		
	}
}
