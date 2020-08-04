package reportNG;

import java.io.File;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AttachedScreenShotToReprotNG {

	static String fileName = null;

	public static void captureScreenShot(WebDriver driver, String sName) {
		try {
			Calendar cal = Calendar.getInstance();
			String time = cal.getTime().toString();
			TakesScreenshot tc = (TakesScreenshot) driver;
			File sc = tc.getScreenshotAs(OutputType.FILE);
			fileName = "./screenShot/" + sName + " " + time.replace(":", "").replace(" ", "") + ".png";
			File dec = new File(fileName);
			FileUtils.copyFile(sc, dec);
		} catch (Exception e) {
			System.out.print("************ Exception ***********");
			e.printStackTrace();
		}
		attachedScreenShotToReprot();
	}

	public static void attachedScreenShotToReprot() {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		File f = new File(fileName);
		Reporter.log("<a title=\"Snapshot\" href=\"" + f.getAbsolutePath() + "\">" + 
		"<img width=\"418\" height=\"240\" alt=\"alternativename\" title =\"title\" src = \"../surefire-reports/html/screenShots/"	
			  + fileName+"\"</a>");
	}
}
