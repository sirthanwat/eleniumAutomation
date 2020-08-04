package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.RegistrationPageUsingPageFactory;
import pages.TestBase;

public class TC_001_Reg_PageFac extends TestBase {

	@Test
	public void enterRegData() {
		RegistrationPageUsingPageFactory reg = new RegistrationPageUsingPageFactory(driver); // using
																// initElements
																// approach 1
		reg.enterUsername();
		reg.enterEmailId();
		reg.enterPassword();
		reg.enterDOB();

		// using initElements approach 2
		// RegistrationPage reg = PageFactory.initElements(driver,
		// RegistrationPage.class); //we can use this as well

		// using initElements approach 3
		/*
		 * RegistrationPage reg = RegistrationPage();
		 * PageFactory.initElements(driver, reg); 
		 */ 
		}

}
