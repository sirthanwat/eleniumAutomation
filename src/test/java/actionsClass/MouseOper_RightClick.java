package actionsClass;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOper_RightClick {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {

		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	// @Test
	public void rightClick() throws InterruptedException {

		Actions act = new Actions(driver);
		// Performs a context-click at the current mouse location.
		act.contextClick().perform();
		Thread.sleep(3000);
	}

	@Test
	public void rightClickToEle() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("imagesrc"));
		Actions act = new Actions(driver);
		/*
		 * Performs a context-click at the current mouse location.
		 * act.contextClick(ele).build(); not performe action 
		 * 
		 * 1. Build():Generates a composite action containing all actions so far, ready to be
		 * performed (and resets the internal builder state, so subsequent calls to build() will contain fresh sequences).
		 * 
		 * 2. A convenience method for performing the actions without calling build() first.
		 */
		act.contextClick(ele).perform();
		Thread.sleep(3000);
	}
}
