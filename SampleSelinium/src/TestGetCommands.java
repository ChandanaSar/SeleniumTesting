import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGetCommands {
	
	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			getCommands();
								
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getCommands() {
		driver.get("https://amazon.com");
		String titleOfThePage=driver.getTitle();
		System.out.println("Title Of The Page"+titleOfThePage);
		 driver.findElement(By.linkText("Today's Deals")).click();
		 String currentURL= driver.getCurrentUrl();
		 System.out.println("Current URL"+currentURL);
		 System.out.println("The current page Source"+ driver.getPageSource());
		 
		
	}
	
	public static void main(String[] args) {
		TestGetCommands myObj= new TestGetCommands();
		myObj.invokeBrowser();
		

	}

}
