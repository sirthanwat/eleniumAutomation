package basicsConcept;

import java.io.File;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {

	public static void takeScreenShot(WebDriver driver, String sName) {
		try {
			Calendar cal = Calendar.getInstance();
			String time = cal.getTime().toString();
			TakesScreenshot tc = (TakesScreenshot) driver;
			File sc = tc.getScreenshotAs(OutputType.FILE);
			File dec = new File("./screenShot/" + sName + " " + time.replace(":", "").replace(" ", "") + ".png");
			FileUtils.copyFile(sc, dec);
		} catch (Exception e) {
			System.out.print("************ Exception ***********");
			e.printStackTrace();
		}
	}
}
