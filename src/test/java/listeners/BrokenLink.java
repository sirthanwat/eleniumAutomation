package listeners;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ITestNGListener.class)
public class BrokenLink {
	WebDriver driver;

	@BeforeMethod
	public void initiatBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void checkBrokenLink() throws IOException {
		int count = 0;
		//findElements can use for performing operations on multiple elements using loop (having same locator val)
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (WebElement ele : links) {
			System.out.println("....link name....."+ele.getAttribute("href"));
			if (ele.getAttribute("href") != null || !ele.getAttribute("href").contains("javascript")) {
				boolean resp = checkLink(ele.getAttribute("href"));
				if (resp == false) {
					count++;
					System.out.println("link....."+ele.getAttribute("href"));
				}
				else 
					continue;
			}
		}
		System.out.println("count..."+count);
	}

	// Returning the status code of URL
	public boolean checkLink(String linkurl) throws IOException {
		boolean result = false;
		try {
			URL url = new URL(linkurl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(3000);
			con.connect();
			if (con.getResponseCode() == 200) {
				result = true;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
