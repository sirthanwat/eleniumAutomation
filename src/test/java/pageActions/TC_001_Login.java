package pageActions;

import org.testng.annotations.Test;

import pages.TestBase;

public class TC_001_Login extends TestBase {

	@Test
	public void enterRegData() {
		LoginPage log = new LoginPage(driver);
		log.clickOnLogin();
		log.enterUsername();
		log.enterPassword();
		log.clickOnSignIn();
	}

}
