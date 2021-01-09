package Runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static GenericRunner Runner = new GenericRunner();
	WebDriver driver;
	
	public Hooks()
	{
		this.driver=Runner.getDriver();
	}
	
	
	
	
	/*
	 * @Before public static void setUP(Scenario currentScenario) { System.out.
	 * println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Test Started~~~~~~~~~~~~~~~~~~~~");
	 * System.out.println("Executing " +currentScenario.getName() ); }
	 */
	
	@AfterClass
	public static void tearDown(Scenario scenario) throws IOException
	{
		WebDriver driver =Runner.getDriver();
		System.out.println("######################################Test Finished##################");
		System.out.println(scenario.isFailed());
		if(scenario.isFailed())
		{
			System.out.println(scenario.isFailed());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File("/BDD_Project_Final/src/test/resources/snippet/image.png"));
		}
		
		Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
		Runtime.getRuntime().exec("taskkill /im iexplore.exe /f");
		Runner.teardown();
	}
	
	
	
	
}
