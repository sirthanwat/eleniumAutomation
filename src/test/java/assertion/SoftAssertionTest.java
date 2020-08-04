package assertion;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

//it should fail but as we are using soft asset so execution is continue after assert fail as well 
//So getting the assert fail message neeed to call **** assertall() ***** method 

public class SoftAssertionTest {
	WebDriver driver;
	boolean result;

	@BeforeMethod
	public void initiatBrowser() {

		/// usr/local/bin
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
	public void verifyElePresent1() {
		SoftAssert assertion = new SoftAssert();
		result = Compare.validateURL(driver, "http://demo.automationtesting.in/Register.html1");// wrong
																								// url
		assertion.assertTrue(result);
		assertion.assertTrue(result, "[ Error ] Url is not matching");
		System.out.println("getCurrentUrl...");

		assertion.assertAll();

		// output
		/*
		 * getCurrentUrl... FAILED: verifyElePresent1 java.lang.AssertionError:
		 * The following asserts failed: expected [true] but found [false], [
		 * Error ] Url is not matching expected [true] but found [false] at
		 * org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43
		 */
	}
}
