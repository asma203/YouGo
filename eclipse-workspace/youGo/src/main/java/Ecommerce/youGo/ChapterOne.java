package Ecommerce.youGo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChapterOne extends pageBase{

	public ChapterOne(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="radiobutton")
	WebElement radiobtn;
	
	@FindBy(id="selecttype")
	WebElement selectddl;
	
	@FindBy(name = "selected(1234)")
	WebElement checbox;
	
	@FindBy(id="secondajaxbutton")
	WebElement generatebtn;
	
	@FindBy(css = "div[id='html5div']")
	public WebElement generateTxt;
	
	@FindBy(id="multiplewindow")
	WebElement doubleWindowbtn;
	
	@FindBy(id="loadajax")
	WebElement loadAjax;
	
	@FindBy(xpath="/html[1]/body[1]/div[9]/p[1]")
	public WebElement verifyTxtAjax;
	
	@FindBy(id="divontheleft")
	public WebElement assertTxt;
	
	@FindBy(xpath ="//a[text()='Home Page']")
	WebElement homeRedirect;
	
	public void radioSelection() {
		clickButton(radiobtn);
	}
	
	public void loadTxt() {
		clickButton(generatebtn);
		
	}
	public void ajaxTx() {
		clickButton(loadAjax);
	}
	public void homepage() {
		clickButton(homeRedirect);
	}

}
