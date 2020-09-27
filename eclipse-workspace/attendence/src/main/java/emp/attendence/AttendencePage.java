package emp.attendence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttendencePage extends PageBase{

	public AttendencePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="clock_in")
	WebElement clockinBtn;
	
	@FindBy(id="clock_out")
	WebElement clockoutBtn;
	
	public void ClockIn()
	{
		clickButton(clockinBtn);
	}
	
	public void ClockOut()
	{
		clickButton(clockoutBtn);
	}
	
	
	

}
