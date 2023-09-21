package TestingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchingURL {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");  //This is use for open or launch Driver
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();// this is used for maximize window
		driver.get("https://passport.quiestatechnologies.com/index.php");
		driver.findElement(By.id("name")).sendKeys("Guru");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("gshipekar88@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("phone")).sendKeys("9730791278");
		WebElement element=driver.findElement(By.name("service_type"));  // select option
		Select s =new Select(element);
		s.selectByVisibleText("New Passport");// Select a option
		driver.findElement(By.name("submit")).click();// Click Button 
		driver.quit();
		driver.close();

	}

}
