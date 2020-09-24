package Ecommerce.youGo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class testBase {
	public static  WebDriver driver;
	
	
	@BeforeMethod
	public void ChromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asma\\eclipse-workspace\\youGo\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://book.theautomatedtester.co.uk");
		 Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	  @AfterMethod public void stopDriver() 
	  { 
		  driver.close(); 
	  }
	 
}