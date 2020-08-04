package listeners;

import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ITestNGListener.class)
public class WindowHandles {
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
	@Test
	public void window() throws InterruptedException {
		String win= driver.getWindowHandle();
		System.out.println("getWindowHandle......" +win);
		Thread.sleep(3000);
	}
	@Test
	public void windows() throws InterruptedException {
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(3000);
		//System.out.println("getWindowHandles val......" +driver.getWindowHandles());
		Set<String> wins= driver.getWindowHandles();
		for(String str : wins)
		System.out.println(">>>getWindowHandles......" +str);
	}
}
