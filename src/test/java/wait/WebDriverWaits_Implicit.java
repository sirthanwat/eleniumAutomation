package wait;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverWaits_Implicit {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	/*
	 * default is 0 second it is used for searching the element applicable with
	 * search or findElement command it will not wait till max timeout if its
	 * find the element before the define time
	 * applicable throughout the script
	 */
	@Test
	public void implicitWait() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@ng-model='FirstName1']"));
		ele.sendKeys("aarti");
	}
}
