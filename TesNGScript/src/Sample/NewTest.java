package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\\\Selenium\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe";
	public WebDriver driver;

	@Test
	public void verifyHomepageTitle() {

		System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}

	@Test(priority = 3)
	public void test_c() {
		Assert.fail();
	}

	@Test(priority = 0)
	public void test_a() {
		Assert.assertTrue(true);
	}

	@Test(priority = 7)
	public void test_b() {
		throw new SkipException(" Skipping b_test.....");
	}

}
