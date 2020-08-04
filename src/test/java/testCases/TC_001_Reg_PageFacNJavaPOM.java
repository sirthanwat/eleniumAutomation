package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.TestBase;

public class TC_001_Reg_PageFacNJavaPOM extends TestBase {

	@Test
	public void enterRegData() {
		//no need  of creating obje here
		//RegistrationPageUsingPageFactory reg = new RegistrationPageUsingPageFactory(driver); 
		reg.enterUsername();
		reg.enterEmailId();
		reg.enterPassword();
		reg.enterDOB();		
		}

}
