package befit.app;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class TestBase {
	WebDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		// Set up desired capabilities and pass the Android app-activity and app-package
		// to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//Identify emulator 
		capabilities.setCapability("deviceName", "sdk_gphone_x86");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("appPackage", "com.robusta.befit");
		capabilities.setCapability("appActivity", "com.robusta.befit.features.splash.SplashActivity");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		capabilities.setCapability("autoGrantPermissions", "true");
	}

	

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}
}