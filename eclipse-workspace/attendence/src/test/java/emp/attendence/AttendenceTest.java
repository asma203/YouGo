package emp.attendence;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Calendar;
import java.util.Date;

public class AttendenceTest extends TestBase {
	
	LoginPage loginpageObject;
	DashboardPage dashboardObject;
	AttendencePage AttendenceObject;
	
	
	@Test(priority =0)
	public void OpenAttendPage() throws InterruptedException {
		loginpageObject = new LoginPage(driver);
		loginpageObject.UserLoginForum("Asmaa.Ahmed@roqay.com.kw", "Asa2031993");
		Thread.sleep(2000);
		String Url = driver.getCurrentUrl();
		String Expected ="https://emp.roqay.com/panel/dashboard";
		AssertJUnit.assertEquals(Url, Expected);
		dashboardObject = new DashboardPage(driver);
		dashboardObject.OpenAttendence();
		Thread.sleep(1000);
		String Url2 = driver.getCurrentUrl();
		String Expected2 = "https://emp.roqay.com/panel/front/attendance";
		AssertJUnit.assertEquals(Url2, Expected2);
		Thread.sleep(1000);
		 Calendar calendar = Calendar.getInstance();
		 Date currentDate= calendar.getTime();
		 int actualDate = calendar.compareTo(calendar);
		AttendenceObject= new AttendencePage(driver);
		AttendenceObject.ClockIn();
		AssertJUnit.assertEquals(currentDate, actualDate);
		
	}
		
}
