package seleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
;

public class simpleAlerts {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");  //This is use for open or launch Driver
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();// this is used for maximize window
		driver.manage().deleteAllCookies();
		driver.get("https:demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		Alert g =driver.switchTo().alert();
		System.out.println(g.getText());
		Thread.sleep(2000);
		g.accept();
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		Alert s=driver.switchTo().alert();
		Thread.sleep(3000);
		s.accept();
		*/
	
		driver.quit();

	}

}
