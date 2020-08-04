package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare {

	public static boolean validateURL(WebDriver driver, String expUrl) {
		boolean result = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expUrl))
			result = true;
		return result;
	}

	public static boolean validateElementExistByXpath(WebDriver driver, String xpath) {
		boolean result = false;
		try {
			driver.findElement(By.xpath(xpath));
			result = true;
		} catch (Exception e) {
		}
		return result;
	}

	public static boolean validateElementExist(WebDriver driver, String locatorType, String locatorValue) {
		boolean result = false;
		try {
			if (locatorType.equalsIgnoreCase("xpath"))
				driver.findElement(By.xpath(locatorValue));
			else if (locatorType.equalsIgnoreCase("id"))
				driver.findElement(By.id(locatorValue));
			else if (locatorType.equalsIgnoreCase("name"))
				driver.findElement(By.name(locatorValue));
			result = true;
		} catch (Exception e) {
		}
		return result;
	}

	public static boolean validateTextPresentOnElement(WebDriver driver, String locatorType, String locatorValue,
			String expText) {
		boolean result = false;
		String actText = "";
		try {
			if (locatorType.equalsIgnoreCase("xpath"))
				actText = driver.findElement(By.xpath(locatorValue)).getText();
			else if (locatorType.equalsIgnoreCase("id"))
				actText = driver.findElement(By.id(locatorValue)).getText();
			else if (locatorType.equalsIgnoreCase("name"))
				actText = driver.findElement(By.name(locatorValue)).getText();
			if (actText.equalsIgnoreCase(expText))
				result = true;
		} catch (Exception e) {
		}
		return result;
	}

	public static String validateTextPresentOnElementPart2(WebDriver driver, String locatorType, String locatorValue) {
		String actText = "";
		try {
			if (locatorType.equalsIgnoreCase("xpath"))
				actText = driver.findElement(By.xpath(locatorValue)).getText();
			else if (locatorType.equalsIgnoreCase("id"))
				actText = driver.findElement(By.id(locatorValue)).getText();
			else if (locatorType.equalsIgnoreCase("name"))
				actText = driver.findElement(By.name(locatorValue)).getText();

		} catch (Exception e) {
		}
		return actText;
	}
}
