package basicsConcept;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FatchPageData {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {
		
		///usr/local/bin
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
	public void test() {
		
		//fatch current url
		System.out.println("getCurrentUrl..."+driver.getCurrentUrl());
		AssertJUnit.assertEquals("http://demo.automationtesting.in/Register.html", driver.getCurrentUrl());
		System.out.println("getTitle..."+driver.getTitle());
		AssertJUnit.assertEquals("Register", driver.getTitle());
	}
}
