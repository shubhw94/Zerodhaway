package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public static WebDriver driver;

@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
	}
@AfterSuite
	public void closeBrowser() {
		//driver.close();
	}
}
