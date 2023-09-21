package seleniumMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class snapShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://passport.quiestatechnologies.com/index.php");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des= new File("C:\\Selenium\\ScreenShots" + "Guru.png");// save the image in given Folder (Path here i delcare)
		FileHandler.copy(src, des);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
