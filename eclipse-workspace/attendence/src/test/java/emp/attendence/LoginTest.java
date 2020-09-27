package emp.attendence;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class LoginTest extends TestBase {

	LoginPage loginpageObject;
	// String email="Asmaa.Ahmed@roqay.com.kw";
	// String password = "Asa2031993";
	@Test
	public void login() throws InterruptedException {

		loginpageObject = new LoginPage(driver);
		loginpageObject.UserLoginForum("Asmaa.Ahmed@roqay.com.kw", "Asa2031993");
		Thread.sleep(2000);
		String Url = driver.getCurrentUrl();
		String Expected ="https://emp.roqay.com/panel/dashboard";
		AssertJUnit.assertEquals(Url, Expected);
		
	}
}
