package Step_Defination;

import PageAction.LoginPageAction;
import Utility.TestBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class juba_loginStepDef extends TestBaseClass {
	
	
	LoginPageAction loginaction=new LoginPageAction();
	
	
	@Given("Lunch {string}")
	public void lunch(String URL) {
	    LunchApplication(URL);
	}

	@Then("Click login")
	public void click_login() {
		loginaction.Clicklogin();
	    
	}

	@Then("Enter username and password then click login")
	public void enter_username_and_password_then_click_login() throws Exception {
	    loginaction.usercredential(prop.getProperty("UserName"), prop.getProperty("Password"));
	}

	@Then("Click Samsung6 hyperlink")
	public void click_samsung6_hyperlink() {
		loginaction.ClickSamsung6hyperlink();
	   
	}

	@Then("Click add cart")
	public void click_add_cart() throws Throwable {
		loginaction.addcart();
		
	   
	}

	@Then("Click Cart")
	public void click_cart() {
	    loginaction.ClickCart();
	}

	@Then("Verify user add item in cart")
	public void verify_user_add_item_in_cart() {
		loginaction.Verifyuseradditemincart();
	    
	}

	
	
	
	
	
	
}
