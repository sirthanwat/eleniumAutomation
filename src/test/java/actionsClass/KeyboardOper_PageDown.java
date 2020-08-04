package actionsClass;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardOper_PageDown {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {

		/// usr/local/bin
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void actions() throws InterruptedException {

		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		ele.sendKeys("Aarti");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();

	}
}
