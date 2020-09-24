package Ecommerce.youGo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pageBase {
	
	 WebDriver driver ; 
	
	public pageBase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setElement(WebElement textElement, String value) {
		textElement.sendKeys(value);
		
	}
	protected  void clickButton(WebElement button) 
	{
		button.click();
	}
	

}
