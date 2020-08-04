package basicsConcept;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BrowserActivity {
	WebDriver driver;	

	@Test
	public void initiatBrowser() throws InterruptedException {
		driver = new ChromeDriver(); //browser will start (using constructed will be called)
		
		//System.setproperty for Window. bcoz browser will not understand java 
		//will use interface for java executable (chromedriver.exe)
		
		Reporter.log("Launching google url");
		driver.get("https://www.google.com/"); //2way .for launching browser
		
		Reporter.log("Launching facebook url");
		driver.navigate().to("https://www.facebook.com/"); //2way .for launching browser
		
		Reporter.log("maximise window");
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("hello");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
