package seleniumMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollUpDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");  //This is use for open or launch Driver
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();// this is used for maximize window
		driver.manage().deleteAllCookies();
		driver.get("https://passport.quiestatechnologies.com/index.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-2000)");
		
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(-1000,0)");
		
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollBy(1000,0)");
	}
}
