package wait;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaWait_Thread {
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
	public void threadWait() throws InterruptedException {		
		//given by java not webdriver
		//fixed wait : execution will become slow
		Thread.sleep(2000); //we know the specific time to load the ele or page 

	}
}
