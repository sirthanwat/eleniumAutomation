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

public class Keyboard_MouseOper_togather {
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

	 @Test
	public void rightClick() throws InterruptedException {
		WebElement parcSite = driver.findElement(By.xpath("//a[contains(.,'Practice Site')]"));

		Actions act = new Actions(driver);
		//ctl+click
		act.keyDown(Keys.CONTROL).click(parcSite).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
	}	
}
