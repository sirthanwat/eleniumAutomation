package listeners;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ITestNGListener.class)
public class SimilerElement {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	// using same tagname (having same xpath)
	@Test
	public void sameEle() {
		int count = driver.findElements(By.xpath("//a")).size();
		System.out.println("link count......" +count);
	}
	@Test
	public void sameEle1() {
		int count = driver.findElements(By.xpath("//input[@type='text']")).size();
		System.out.println("Textbox count......" +count);
	}
	@Test
	public void sameEle2() {
		int count = driver.findElements(By.xpath("//input[@type='text' or @type='email' or @type='password'] ")).size();
		System.out.println("All Textbox count......" +count);
	}
}
