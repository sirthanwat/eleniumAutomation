package inheritanceinSel;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basicsConcept.TakeScreenShot;

public class Child extends InitiateBase{

	@Test
	public void test() throws InterruptedException, IOException {
		
		WebElement ele = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		ele.sendKeys("aarti");
		//fatch current url
		System.out.println("getAttribute..."+ ele.getAttribute("type"));
		System.out.println("getAttribute..."+ ele.getTagName());
		TakeScreenShot.takeScreenShot(driver, "Reg");
	}
}
