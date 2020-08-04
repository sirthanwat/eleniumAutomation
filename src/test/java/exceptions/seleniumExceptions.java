package exceptions;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class seleniumExceptions {

	WebDriver driver;

	@Test
	public void exceptions() {
		// TimeoutException
		/*
		 * 1. org.openqa.selenium.TimeoutException: timeout: Timed out receiving
		 * message from renderer: 0.001
		 * driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MILLISECONDS);
		 * if page load is taking more then 60 sec then specify the timimg
		 */
		// NoSuchElementException
		/*
		 * org.openqa.selenium.NoSuchElementException: no such element: Unable
		 * to locate element:
		 * {"method":"xpath","selector":"//input[@ng-model='FirstName1']"}
		 */
		// UnsupportedOperationException
		/*
		 * 3. Exception :java.lang.UnsupportedOperationException: You may only
		 * deselect options of a multi-select it will work with list not with
		 * select tag sc.deselectByIndex(1);;
		 */
//ElementClickInterceptedException		
		/*
		 * org.openqa.selenium.ElementClickInterceptedException: element click
		 * intercepted: Element <a href="downloads.php">...</a> is not clickable
		 * at point (921, 49). Other element would receive the click: <div
		 * class="modal fade in" data-backdrop="static" data-keyboard="false"
		 * tabindex="-1" role="dialog" aria-hidden="true"
		 * style="padding-top: 15%; overflow-y: visible; display: block;">...</
		 * div>
		 */
//org.openqa.selenium.InvalidSelectorException
		/*
		 * invalid selector: Unable to locate an element with the xpath expression
		 * '///input[@type='text' or @type='email' or @type='password'] 
		 */
		
////*******************		Checked Exceptions  (Compile time)    *******************/////
/* FileNotFoundException :	
 * IOException 	
 * ClassNotFountException
 */
		
////*******************		Un-Checked Exceptions  (run time)    *******************/////
		//ArithmeticException
		
	}
}
