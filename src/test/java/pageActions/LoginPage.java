package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import basicsConcept.TakeScreenShot;
import pages.ConfigReader;
import reportNG.AttachedScreenShotToReprotNG;

public class LoginPage {

	WebDriver driver;
	ActionPage act;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		act = new ActionPage(driver);
	}

	public void clickOnLogin() {
		// Exception handling
		try {
			act.clickButton(driver.findElement(By.xpath(ConfigReader.readLocators("login_button"))));
			// driver.findElement(By.xpath(ConfigReader.readLocators("login_button"))).click();;
		} catch (Exception e) {
			System.out.print("************ Exception ***********");
			e.printStackTrace();
			TakeScreenShot.takeScreenShot(driver, "ClickFail");
			//if we want test case to be failed 
			Assert.fail();
		}
	}

	public void enterUsername() {
		try {
			act.enterDataIntoTextBox(driver.findElement(By.name(ConfigReader.readLocators("login_username"))), "test");
			// driver.findElement(By.name(ConfigReader.readLocators("login_username"))).sendKeys("test");
		} catch (Exception e) {
			System.out.print("************ Exception ***********");
			e.printStackTrace();
			TakeScreenShot.takeScreenShot(driver, "EnterUserDataFail");
			Assert.fail();
		}
	}

	public void enterPassword() {
		try {
			act.enterDataIntoTextBox(driver.findElement(By.name(ConfigReader.readLocators("login_password"))), "test");
			// driver.findElement(By.name(ConfigReader.readLocators("login_password"))).sendKeys("test");
		} catch (Exception e) {
			System.out.print("************ Exception ***********");
			//TakeScreenShot.takeScreenShot(driver, "EnterPassDataFail");
			AttachedScreenShotToReprotNG.captureScreenShot(driver, "EnterPassDataFail");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnSignIn() {
		act.clickButton(driver.findElement(By.xpath(ConfigReader.readLocators("login_signIn"))));
		// driver.findElement(By.xpath(ConfigReader.readLocators("login_signIn"))).click();
	}
}
