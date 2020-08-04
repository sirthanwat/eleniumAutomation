package cssLocator;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CSS_Syntax {

	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// With id
		driver.findElement(By.cssSelector("#email")).sendKeys("Aarti");
		Thread.sleep(3000);

		// With id with tagname
		driver.findElement(By.cssSelector("input#email")).sendKeys("Best");
		Thread.sleep(3000);

		// With class name
		driver.findElement(By.cssSelector(".inputtext")).clear();
		Thread.sleep(3000);

		// With [attribute='value']
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("Girl ");
		Thread.sleep(3000);

		// With tagName[attribute='value']
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("In the");
		Thread.sleep(3000);
		driver.quit();
		
	}
}
