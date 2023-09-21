package MinePersonalPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Goibibo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com");
		driver.findElement(By.xpath("(//p[@class='sc-dkPtRN dcnvPN'])[3]")).click();//Selecting Trains
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[@class='styles_FswTripTypeItemText__2KwWd']")).click();//Book Train Tickets
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
