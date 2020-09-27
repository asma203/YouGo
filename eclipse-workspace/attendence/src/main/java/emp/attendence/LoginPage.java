package emp.attendence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="email")
	WebElement emailtxt;

	@FindBy(name="password")
	WebElement passwordtxt;

	@FindBy(id="submitbutton")
	WebElement logintosystembtn;

	public void UserLoginForum(String email , String password) 
	{
		setTextElementText(emailtxt, email);
		setTextElementText(passwordtxt, password);
		clickButton(logintosystembtn);
	}

}
