package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass {

public static Properties prop;
public static WebDriver driver; 

public TestBaseClass()	{
	prop = new Properties();
	
	try {
		FileInputStream files = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
		prop.load(files);
	} catch (FileNotFoundException e) {
		System.out.println("Please check your constructor");
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
}

public void initialize() {
String Browser = prop.getProperty("Browser1");

if(Browser.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(utility.implicity_wait, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(utility.pageload_timeout, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();


}
else if(Browser.equals("Interner_explorer"));

}

public static void LunchApplication(String URL) {
	driver.get(prop.getProperty("URL"));
}
}