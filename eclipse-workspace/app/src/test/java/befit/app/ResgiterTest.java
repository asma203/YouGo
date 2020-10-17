package befit.app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ResgiterTest extends TestBase{
	
	@Test
	public void valiRegisterEmail() throws Exception {
		// Register by Email funcation 
		
		//Skip splash screen 
		WebElement skipbtn  = driver.findElement(By.partialLinkText("SKIP"));
		skipbtn.click();
		
		//find name element
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Asma");
		
		//find email element
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("eng_asma@live.com");
		
		//find password element
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456789");
		
		//find address element
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("new street");
		
		
		//find date for birthdate
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='birthdate']"));
        //Fill date as mm/dd/yyyy as 09/25/2013
        dateBox.sendKeys("March 20 1993");
        //Press tab to shift focus to time field
        dateBox.sendKeys(Keys.TAB);
		
        Thread.sleep(3000);
        
		//click signup button 
		WebElement signupbtn = driver.findElement(By.name("signupbtn"));
		signupbtn.click();
		
		
		// validate success message 
		WebElement results = driver.findElement(By.partialLinkText("SUCCESS"));
		// assert valid input and redirect to new page 
		assert results.getText().equals("6") : "Actual value is : " + results.getText()
				+ " Success";

	}
	
	@Test(dependsOnMethods= "valiRegisterEmail")
	public void ValidEmailLogin()
	{
		//find login button 
		
		//fill email 
		
		//fill password 
		
		//click loginbtn 
		
		//assert success redirect to homepage
	}

}
