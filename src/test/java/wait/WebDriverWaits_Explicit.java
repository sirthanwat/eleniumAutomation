package wait;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverWaits_Explicit {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {
		driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	/*
	 * it is used for searching the condition... working on the property(like
	 * enable , disable.visible,etc) of the element it will not wait till max
	 * timeout if its find the element before the define time applicable for the
	 * each element
	 */
	// @Test
	public void emplicitWait() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement con = driver.findElement(By.id("countryId"));
		Select se1 = new Select(con);
		se1.selectByVisibleText("India");

		// emplicitWait
		WebElement stat = driver.findElement(By.id("stateId"));
		wait.until(ExpectedConditions.textToBePresentInElement(stat, "Gujarat"));

		Select se2 = new Select(stat);
		se2.selectByVisibleText("Gujarat");

		WebElement city = driver.findElement(By.id("cityId"));
		wait.until(ExpectedConditions.textToBePresentInElement(stat, "Amod"));

		Select se3 = new Select(city);
		se3.selectByVisibleText("Amod");
	}

	@Test
	public void emplicitWait1() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.findElement(By.xpath("//label[contains(text(),'Login')]")).click();
		driver.findElement(By.name("_txtUserName")).sendKeys("test");;
		driver.findElement(By.name("_txtPassword")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'View Me')]")).click();
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className("progress progress-striped active"))));
		driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();

	}
}
