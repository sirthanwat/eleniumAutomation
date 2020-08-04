package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageUsingBoth {
	
		public RegistrationPageUsingBoth(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,  using = "fld_username")   
	@CacheLookup WebElement secondApproch;
	
	@FindBy(name = "fld_username")
    WebElement userNameTextbox;
	@FindBy(name = "fld_email")
	WebElement passwordTextbox;
	@FindBy(name = "fld_email")
	WebElement conPasswordTextbox;
	@FindBy(name = "fld_cpassword")
	WebElement emailidTextbox;
	@FindBy(id = "datepicker")
	WebElement dobTextbox;

	public void enterUsername() {
		userNameTextbox.sendKeys(ConfigReader.readLocators("register_nameVal"));
	}

	public void enterPassword() {
		passwordTextbox.sendKeys(ConfigReader.readLocators("register_passVal"));
		conPasswordTextbox.sendKeys(ConfigReader.readLocators("register_passVal"));
	}

	public void enterEmailId() {
		emailidTextbox.sendKeys(ConfigReader.readLocators("register_emailIdVal"));
	}

	public void enterDOB() {
		dobTextbox.sendKeys(ConfigReader.readLocators("register_DOBVal"));
	}

}
