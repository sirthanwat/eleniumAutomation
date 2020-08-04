package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActionPage {
	WebDriver driver;
	WebDriverWait wait;

	public ActionPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	public void clickButton(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			System.out.print("************ Exception ***********");
			Assert.fail();
			e.printStackTrace();
		}
	}

	public void enterDataIntoTextBox(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
		} catch (Exception e) {
			System.out.print("************ Exception ***********");
			e.printStackTrace();
		}
	}
}
