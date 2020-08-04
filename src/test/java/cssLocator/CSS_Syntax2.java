package cssLocator;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CSS_Syntax2 {

	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// With id
		System.out.print(driver.findElement(By.cssSelector("#email")).isDisplayed());
		Thread.sleep(3000);		
		driver.quit();
		
	}
}
