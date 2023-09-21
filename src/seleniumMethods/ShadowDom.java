package seleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowDom {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://books-pwakit.appspot.com");
		//driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Guru");
		WebElement root=driver.findElement(By.tagName("book-app"));// Shadow Host
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement shadowDom1=(WebElement)js.executeScript("return argument[0].shadowRoot", root);
		WebElement appheader=shadowDom1.findElement(By.tagName("app-header"));// Root
		WebElement apptoolbar=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));//
		WebElement bookinputdecorater=apptoolbar.findElement(By.tagName("book-input-decorator"));
		bookinputdecorater.findElement(By.cssSelector("input#input")).sendKeys("Testing");
		driver.quit();
	}
}
