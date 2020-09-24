package Ecommerce.youGo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChapterOneTest extends testBase {
	
	 HomePage homepageObj;
	 ChapterOne chapteroneObj;
	 
	
	 @Test()
	 public void chapterOneParamter()
	 {
		 homepageObj = new HomePage(driver);
		 homepageObj.chapter1button();
		 Assert.assertTrue(homepageObj.pageHeader.getText().contains("Selenium: Beginners"));
		 chapteroneObj = new ChapterOne(driver);
		 chapteroneObj.radioSelection();
		 chapteroneObj.ajaxTx();
		 Assert.assertTrue(chapteroneObj.verifyTxtAjax.getText().contains("The following text has"));
		 chapteroneObj.loadTxt();
		 Assert.assertTrue(chapteroneObj.generateTxt.getText().contains("To be used after the AJAX"));
		 chapteroneObj.homepage();
		 
	 }
	

}
