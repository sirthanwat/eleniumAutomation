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

public class KeyboardOper_cltA_cltBachSpace {
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
		// driver.quit();
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
		/*
		 * not working ctl+a
		 * act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().
		 * perform();//build is for multiplied actions execution // //ctl+a
		 * ctl+BACK_SPACE
		 * act.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.
		 * CONTROL).build().perform();
		 * act.sendKeys(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform(
		 * );
		 * 
		 * act.sendKeys(Keys.chord(Keys.CONTROL + "a")).perform();
		 * ele.sendKeys(Keys.chord(Keys.CONTROL + "a"));
		 */

		Thread.sleep(3000);

	}
}
