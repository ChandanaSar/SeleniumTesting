import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNavigateCommands {

	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

			navigateCommands();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateCommands() {
		try {
			driver.navigate().to("https://amazon.com");
			driver.findElement(By.linkText("Best Sellers")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("See more Best Sellers in Toys & Games")).click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestNavigateCommands myObj = new TestNavigateCommands();
		myObj.invokeBrowser();

	}

}
