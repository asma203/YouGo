package emp.attendence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends PageBase{

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath= "//a[contains(text(),'Attendance')]")
	WebElement attendPagebtn;
	
	public void OpenAttendence() {
		clickButton(attendPagebtn);
	}

}
