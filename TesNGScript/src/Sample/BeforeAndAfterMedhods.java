package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterMedhods {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public String driverPath = "C:\\\\Selenium\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe";
	WebDriver driver;
	String expected = null;
	String actual = null;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}

	@BeforeMethod
	public void verifyHomepageTitle() {
		System.out.println("verifyHomepageTitle");
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod
	public void backToHomePage() {
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}

}
