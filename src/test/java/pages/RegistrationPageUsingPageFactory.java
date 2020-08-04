package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// no need of writing find element , it will identify by @FindBy anotations
// Instantiates the page object
// it is a design pattern
// initElements : locate the element in same time

public class RegistrationPageUsingPageFactory {
	
	//using initElements approach 1
	public RegistrationPageUsingPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,  using = "fld_username")   
	@CacheLookup WebElement secondApproch;
	
	// Why @CacheLookup adv : 
	//When we are searching the "secondApproch" ele 1st time so it will searched and stored into the cache
	//so next time we will perform any action on the same ele so it wont be search the ele again
	//it will directly perform the action

	//or use below approch

	@FindBy(name = "fld_username")
    WebElement userNameTextbox;
	@FindBy(name = "fld_email")
	WebElement passwordTextbox;
	@FindBy(name = "fld_email")
	WebElement conPasswordTextbox;
	@FindBy(name = "fld_password")
	WebElement emailidTextbox;
	@FindBy(id = "datepicker")
	WebElement dobTextbox;

	public void enterUsername() {
		userNameTextbox.sendKeys("aarti");
	}

	public void enterPassword() {
		passwordTextbox.sendKeys("aarti");
		conPasswordTextbox.sendKeys("aarti");
	}

	public void enterEmailId() {
		emailidTextbox.sendKeys("sirt.hanwat@gmail.com");
	}

	public void enterDOB() {
		dobTextbox.sendKeys("01/01/1991");
	}

}
