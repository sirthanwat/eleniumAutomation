package listeners;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ITestNGListener.class)
public class ScrollDownUpJS {
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

	// using JavascriptExecutor
	@Test
	public void pageDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;//TYPECASE
		js.executeScript("window.scrollBy(0,200)", ""); 
		System.out.println("Scroll down......");
		Thread.sleep(3000);
	}
	@Test
	public void pageAlert() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;//TYPECASE
		//js.executeScript("alert('TestingWorld');", ""); 
		js.executeScript("alert('Aarti');", ""); 
		System.out.println("alert......");
		Thread.sleep(3000);
	}
}
