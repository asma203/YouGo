package Ecommerce.youGo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends pageBase{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	  @FindBy(css = "a[href='/chapter1']")
	  WebElement chapter1Txt;

	  @FindBy(id= "q")
	  WebElement searchTxt;
	  
	  @FindBy(xpath = "//div[text()='Selenium: Beginners Guide']")
	  public WebElement pageHeader;
	 
		
		public void chapter1button()
		{
			clickButton(chapter1Txt);
		}
		
		public void searchTxt(String text) {
			setElement(searchTxt, text);
			
		}
		
	

}
