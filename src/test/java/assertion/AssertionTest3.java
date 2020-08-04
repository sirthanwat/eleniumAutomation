package assertion;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//it is used for verifying actual and expecte result.
//its 2 type :Hard and soft assertion
//when to use : 
//hard assertion ---> when test case are depended on each other 
//soft assertion ---> when test case are independed on each other 

public class AssertionTest3 {
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
	public void verifyElePresent() {
		
		
		result = Compare.validateTextPresentOnElement(driver, "id", "email", "email");
		AssertJUnit.assertTrue(result);
		//if assertion is pass then error msg will not display
		Assert.assertTrue(result, "[ Error ] ele is not presnt");		
		//optimize the code 
		Assert.assertTrue(Compare.validateTextPresentOnElement(driver, "id", "email", "email"), "[ Error ] ele is not presnt");

	}
	@Test
	public void verifyElePresent1() {
		
		
		String actresult = Compare.validateTextPresentOnElementPart2(driver, "id", "email");
		Assert.assertEquals(actresult,"");
		AssertJUnit.assertEquals(actresult,"", "Error msg...disply only on asert fail");

	
	}
}
