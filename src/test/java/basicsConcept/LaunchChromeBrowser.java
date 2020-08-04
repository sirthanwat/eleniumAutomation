package basicsConcept;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchChromeBrowser {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {
		
		///usr/local/bin
		driver = new ChromeDriver(); // browser will start (using constructed
										// will be called)

		// System.setproperty for Window. bcoz browser will not understand java
		// will use interface for java executable (chromedriver.exe)

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("hello");
	}
}
