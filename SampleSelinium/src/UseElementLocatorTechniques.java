import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UseElementLocatorTechniques {
	WebDriver driver;

	public void invokeBrowser(String url) {
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void elementLocatorTechniquesUsingAmazon() {
		try {
			invokeBrowser("http://www.amazon.com");
			/*
			 * driver.findElement(By.linkText("Today's Deals")).click();
			 * driver.navigate().back();
			 * driver.findElement(By.partialLinkText("Customer")).click();
			 * driver.navigate().back();
			 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
			 * driver.findElement(By.className("nav-input")).click();
			 */
			//driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
			driver.findElement(By.xpath("//*[text()='Hello, Sign in']")).click();
			//closeBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void elementLocatorTechniquesUsingFacebook() {
		try {
			invokeBrowser("http://www.Facebook.com");
			//driver.findElement(By.name("firstname")).sendKeys("Chandana");
			driver.findElement(By.cssSelector("input#email")).sendKeys("Chandana@gmail.com");
			closeBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) {
		UseElementLocatorTechniques myObj = new UseElementLocatorTechniques();
		myObj.elementLocatorTechniquesUsingAmazon();
		//myObj.elementLocatorTechniquesUsingFacebook();

	}

}
