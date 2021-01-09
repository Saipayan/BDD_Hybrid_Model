package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerQA {

	
	public static  WebDriver driver;
	public static int TIMEOUT = 30;
	public static int PAGELOADTIMEOUT = 50;
	public static WebDriverWait waitDriver ;

	
	public static  WebDriver returnDriver(String Browser)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGELOADTIMEOUT, TimeUnit.SECONDS);
		
		return driver;
		}
		
		return null;
		
	}
}
	
	