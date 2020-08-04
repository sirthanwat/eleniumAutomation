package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.LoginPageUsingJavaApproch;
import pages.TestBase;

public class TC_001_Login_JavaPOM extends TestBase {

	@Test
	public void enterRegData() {
		LoginPageUsingJavaApproch log = new LoginPageUsingJavaApproch(driver);
		log.clickOnLogin();
		log.enterUsername();
		log.enterPassword();
		log.clickOnSignIn();
	}

}
