package emp.attendence;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public static WebDriver driver;

	@BeforeMethod
	public void Start() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asma\\eclipse-workspace\\attendence\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://emp.roqay.com/panel");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}