package wait;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverWaits_pageLoadTimeOut {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	//@Test
	public void pageLoadTimeOut() throws InterruptedException {		
		//pageLoadTimeOut is default time out which is provided by webdriver 
		//no need of writing the code 
		//if page is loaded in 5 or 10 or 15 sec then next step will execute 
		// default it will wait till 60 sec
		//if page is not loaded in 60 sec the exceptions will throw
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);//if page load is taking more then 60 sec then specify the timimg
	}
	@Test
	public void nagPageLoadTimeOut1() throws InterruptedException {		
		
    //org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 0.001
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MILLISECONDS);//if page load is taking more then 60 sec then specify the timimg
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		ele.sendKeys("Aarti");
	}
}
