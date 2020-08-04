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

public class MouseOper_MoveToEle {
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
	public void moveToElement() throws InterruptedException {
		WebElement switchTo = driver.findElement(By.xpath("//a[@href='SwitchTo.html']"));
		WebElement alert = driver.findElement(By.xpath("//a[@href='Alerts.html']"));
		Actions act = new Actions(driver);
		act.moveToElement(switchTo).perform();
		alert.click();
		Thread.sleep(3000);
	}

	@Test
	public void moveToElement1() throws InterruptedException {
		WebElement switchTo = driver.findElement(By.xpath("//a[@href='SwitchTo.html']"));
		WebElement alert = driver.findElement(By.xpath("//a[@href='Alerts.html']"));
		Actions act = new Actions(driver);
		act.moveToElement(switchTo).click(alert).perform();
		Thread.sleep(3000);
	}
}
