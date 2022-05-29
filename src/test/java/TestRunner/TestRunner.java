package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.TestBaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;





@CucumberOptions(features = {"C:\\Users\\jubay\\eclipse-workspace\\nexttechfall\\src\\test\\resources\\Features"}, 
plugin = {"json:target/cucumber.json"},
glue = "Step_Defination",tags= "@search")






public class TestRunner extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void setup() {
			TestBaseClass test=new TestBaseClass();
			test.initialize();

	}
	
@AfterTest
public void closeApplication() {
	TestBaseClass test=new TestBaseClass();
	test.driver.quit();
	
	
	
	
	
}}