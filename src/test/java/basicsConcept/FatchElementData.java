package basicsConcept;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FatchElementData {
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
	public void test() throws InterruptedException {
		
		WebElement ele = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		ele.sendKeys("aarti");
		//fatch current url
		System.out.println("getAttribute..."+ ele.getAttribute("type"));
		System.out.println("getAttribute..."+ ele.getTagName());
		System.out.println("getText..."+ele.getText());
		System.out.println("cordinates..."+ele.getLocation());
		System.out.println("X cordinates..."+ele.getLocation().getX());
		System.out.println("x cordinates..."+ele.getLocation().x);

		System.out.println("isEnabled..."+ele.isEnabled());
		System.out.println("isDisplayed..."+ele.isDisplayed());
		WebElement radio = driver.findElement(By.xpath("//input[@value='Male']"));
		radio.click();
		System.out.println("isSelected..."+radio.isSelected());
		Thread.sleep(3000);

	}
}
