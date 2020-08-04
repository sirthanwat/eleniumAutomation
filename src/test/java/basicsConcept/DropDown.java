package basicsConcept;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {
		
		driver = new ChromeDriver(); 
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void dropdownTest() throws InterruptedException {
		WebElement skill =driver.findElement(By.id("Skills"));
		Select sc = new Select(skill);
		
		sc.selectByIndex(1);
		Thread.sleep(3000);
		String ski=skill.getText().trim();
		//System.out.println("ski.." +ski);
		if (ski.contains("Adobe InDesign"))
			System.out.println("true ..1..matched");

		sc.selectByValue("Analytics");
		Thread.sleep(3000);
		//System.out.println("ski.." +ski);
		if (skill.getText().trim().contains("Analytics"))
			System.out.println("true..2.. matched");
		
		sc.selectByVisibleText("APIs");
		Thread.sleep(3000);
		//System.out.println("ski.." +ski);
		if (skill.getText().trim().contains("APIs"))
			System.out.println("true..3.. matched");
		
		WebElement fso=sc.getFirstSelectedOption();
		System.out.println("getFirstSelectedOption..."+fso.getText()); //API
		
		 List<WebElement> allOp = sc.getOptions();
		 for(WebElement ele : allOp)
		 {
			 System.out.println("getOptions.." +ele.getText());
		 }
	}
	
	@Test
	public void listTest() throws InterruptedException {
		WebElement skill =driver.findElement(By.id("Skills"));
		Select sc = new Select(skill);
		
		sc.deselectByIndex(1);
		Thread.sleep(3000);
		String ski=skill.getText().trim();
		//System.out.println("ski.." +ski);
		if (ski.contains("Adobe InDesign"))
			System.out.println("true ..1..matched");
		
		//Exception :java.lang.UnsupportedOperationException: You may only deselect options of a multi-select 
		//it will work with list not with select tag
		sc.getAllSelectedOptions();

	}
}
