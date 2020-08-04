package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	
	public WebDriver driver;
	public RegistrationPageUsingPageFactory reg;

	@BeforeMethod
	public void initiatBrowser() {
		
		driver = new ChromeDriver(); 
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		reg = new RegistrationPageUsingPageFactory(driver); 

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
