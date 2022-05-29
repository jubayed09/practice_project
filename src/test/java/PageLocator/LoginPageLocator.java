package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utility.TestBaseClass;

public class LoginPageLocator extends TestBaseClass{

	public LoginPageLocator() {
		
		PageFactory.initElements(driver, this); //Page object model given by Maven.
	
	
}

	@FindBy(how=How.ID, using="loginusername")//syntax given by Maven to find out the locator
	public WebElement username;
	
	
	@FindBy(how=How.ID, using="loginpassword")
	public WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[text()='Log in']")
	public WebElement loginbutton;
	
	@FindBy(how=How.ID, using="login2")
	public WebElement loginlink;
	
	@FindBy(how=How.XPATH, using="//a[text()='Samsung galaxy s6']")
	public WebElement SamsungHyperlink;
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Add to cart']")
	public WebElement Addtocart;
	
	
	@FindBy(how=How.ID, using="cartur")
	public WebElement clickcart;
	
	
	@FindBy(how=How.XPATH, using="//td[text()='Samsung galaxy s6']")
	public WebElement verifySamsung6;
	
	
	
	
	
	
	
	
	
	
}