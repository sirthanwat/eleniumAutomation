package actionsClass;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Actions_KeyboardOper {
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
		/*
		 * ele.sendKeys("Aarti"); ele.sendKeys(Keys.TAB);
		 * ele.sendKeys("Hanwat");//ele is same
		 */
        
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB);
		act.sendKeys("Hanwat").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

	}
}
