package PageAction;

import org.testng.Assert;

import PageLocator.LoginPageLocator;
import Utility.TestBaseClass;
import Utility.testdatascreenshots;

public class LoginPageAction extends TestBaseClass{

	LoginPageLocator loginlocator = new LoginPageLocator();
	
	public void usercredential(String u, String p) throws Exception {
		loginlocator.username.sendKeys(u);
		loginlocator.password.sendKeys(p);
		loginlocator.loginbutton.click();
		Thread.sleep(5000);
		
		
		
		
		
	}
	public void Clicklogin() {
		loginlocator.loginlink.click();
		
		}
	public void ClickSamsung6hyperlink() {
		loginlocator.SamsungHyperlink.click();
		
	}
	public void addcart() throws Exception {
		loginlocator.Addtocart.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	
	public void ClickCart() {
		loginlocator.clickcart.click();
		
		
	}
	public void Verifyuseradditemincart() {
		
		Boolean result = loginlocator.verifySamsung6.isDisplayed();
		
		Assert.assertTrue(result);
		testdatascreenshots.takescreenshot(driver, "Verify Cart");
		
		
		
		
	}
	
	
}
