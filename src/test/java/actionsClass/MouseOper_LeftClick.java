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

public class MouseOper_LeftClick {
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

	//@Test
	public void leftClick() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("imagesrc"));
		
		Actions act = new Actions(driver);
	    act.click().perform();//Clicks at the current mouse location
		Thread.sleep(3000);

	}
	
	//@Test
	public void leftClickEle() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("imagesrc"));
		
		Actions act = new Actions(driver);
	    act.click(ele).perform();//Clicks in the middle of the given element. Equivalent to: Actions.moveToElement(onElement).click()
		Thread.sleep(3000);
	}
	
	@Test
	public void leftClickMoveToEle() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("imagesrc"));
		
		Actions act = new Actions(driver);
		//both working
		//Moves the mouse to the middle of the element. The element is scrolled into view and its location is calculated using getBoundingClientRect.
		act.moveToElement(ele).click().perform(); 
		
		//act.moveToElement(ele).click().build().perform();
		Thread.sleep(3000);
	}
}
