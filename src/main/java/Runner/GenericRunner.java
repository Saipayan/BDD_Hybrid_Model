package Runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.cucumber.listener.ExtentCucumberFormatter;

import Core.WebDriverManagerQA;

public class GenericRunner {

	
	public static WebDriver driver ;
	
	

		
	
	
	
	
	  public GenericRunner() { this.driver = WebDriverManagerQA.returnDriver("chrome"); }
	 
	
	public WebDriver getDriver()
	{
		return this.driver;
	}
	
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
