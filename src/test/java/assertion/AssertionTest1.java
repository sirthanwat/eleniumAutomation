package assertion;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//it is used for verifying actual and expecte result.
//its 2 type :Hard and soft assertion
//when to use : 
//hard assertion ---> when test case are depended on each other 
//soft assertion ---> when test case are independed on each other 

public class AssertionTest1 {
	WebDriver driver;
    boolean result ;
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
	public void testPos() {
		
		//fatch current url
		System.out.println("getCurrentUrl..."+driver.getCurrentUrl());
		result = Compare.validateURL(driver, "http://demo.automationtesting.in/Register.html");
		Assert.assertTrue(result);
		//if assertion is pass then error msg will not display
		Assert.assertTrue(result, "[ Error ] Url is not matching");
		
	}
	@Test
	public void testNag() {
		
		//hard assertion
		System.out.println("getCurrentUrl..."+driver.getCurrentUrl());
		result = Compare.validateURL(driver, "http://demo.automationtesting.in/Register.htmltttt");
		Assert.assertTrue(result, "[ Error ] Url is not matching");
		//or 
		Assert.assertFalse(result, "[ Error ] Url is exist"); // expected was this Url should not exist

		
		//output--> java.lang.AssertionError: [ Error ] Url is not matching expected [true] but found [false]
	}
}
