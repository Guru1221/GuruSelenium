package seleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class promptAlerts {

	public static void main(String [] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");  //This is use for open or launch Driver
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();// this is used for maximize window
		driver.manage().deleteAllCookies();
		driver.get("https:demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert g=driver.switchTo().alert();//this is for selenium focus shift to alert
		System.out.println(g.getText());
		Thread.sleep(2000);
		g.sendKeys("Guru");//data send to alert
		Thread.sleep(2000);
		g.accept();
		driver.quit();
	}
}
