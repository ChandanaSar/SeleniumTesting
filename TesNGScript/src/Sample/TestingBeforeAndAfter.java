package Sample;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingBeforeAndAfter {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe";
	WebDriver driver;

	@AfterTest
	public void closeBrowser() {
		System.out.println("Closing Browser");
		driver.close();
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(baseUrl);

	}

	@Test
	public void verifyHomepageTitle() {
		System.out.println("verifyHomepageTitle");
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
