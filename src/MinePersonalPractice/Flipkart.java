package MinePersonalPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {

	public static void main(String [] args) {
		
		System.setProperty("wedriver.chrome.driver","C:\\Selenium\\edgedriver_win64");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
}
