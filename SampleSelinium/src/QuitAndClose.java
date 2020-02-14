import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitAndClose {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com");
		
		driver.get("http://www.popuptest.com/popuptest2.html");
        //driver.quit();  // using QUIT all windows will close
         driver.close();  // using CLOSE only the parent browser window will close and not the two pop-up windows
	}

}
