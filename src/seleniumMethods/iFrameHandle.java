package seleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameHandle {

	public static void main(String [] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame("frame2");
	    WebElement ele =driver.findElement(By.xpath("//select[@id='animals']"));
	    Select s=new Select(ele);
	    s.selectByVisibleText("Avatar");
	    Thread.sleep(2000);
	    
	    
		
		driver.quit();
		
		
	}
}
