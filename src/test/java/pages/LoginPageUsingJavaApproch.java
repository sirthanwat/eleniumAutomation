package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageUsingJavaApproch {
	
	WebDriver driver;
	public LoginPageUsingJavaApproch(WebDriver driver){
		this.driver = driver;
	}
	public void clickOnLogin() {
		driver.findElement(By.xpath(ConfigReader.readLocators("login_button"))).click();;		
	}
	
	public void enterUsername() {
		driver.findElement(By.name(ConfigReader.readLocators("login_username"))).sendKeys("test");
	}

	public void enterPassword() {
		driver.findElement(By.name(ConfigReader.readLocators("login_password"))).sendKeys("test");
	}
	
	public void clickOnSignIn() {
		driver.findElement(By.xpath(ConfigReader.readLocators("login_signIn"))).click();		
	}
}
	
