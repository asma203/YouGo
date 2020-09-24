package Ecommerce.youGo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends testBase {
	
	HomePage homepageObject;
	
	@Test(priority=2)
	public void searchProduct()  {
		homepageObject = new HomePage(driver);
		homepageObject.chapter1button();
		Assert.assertTrue(homepageObject.pageHeader.getText().contains("Selenium: Beginners"));
		
	}
	
	@Test(priority=1)
	public void textSearch() {
		homepageObject = new HomePage(driver);
		homepageObject.searchTxt("text");
	}

}
