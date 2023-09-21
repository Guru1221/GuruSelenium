package seleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");// For Scroll Down(x,y) suppose if we give positive value in y then it is scroll dwon
		
		WebElement ele =driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s=new Select(ele);
		s.selectByVisibleText("Opel");
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
