package basicsConcept;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	WebDriver driver;	

	@Test
	public void initiatBrowser() throws InterruptedException {
		driver = new ChromeDriver(); //browser will start (using constructed will be called)
		
		//System.setproperty for Window. bcoz browser will not understand java 
		//will use interface for java executable (chromedriver.exe)
		
		driver.get("https://www.google.com/"); //.for launching browser
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("hello");
		Thread.sleep(3000);
		driver.quit();
	}
}
